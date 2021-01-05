import greenfoot.*;

public class Spider extends Actor
{
    private GreenfootSound scream = new GreenfootSound("./sounds/spider_scream.wav");
    private GreenfootSound bite = new GreenfootSound("./sounds/spider_bite.wav");
    private GreenfootSound hit = new GreenfootSound("./sounds/spider_hit.wav");
    
    private GreenfootImage []upSprites = new GreenfootImage[10];
    private GreenfootImage []downSprites = new GreenfootImage[10];
    private GreenfootImage []leftSprites = new GreenfootImage[10];
    private GreenfootImage []rightSprites = new GreenfootImage[10];
    private GreenfootImage []extraSprites = new GreenfootImage[3];
    private CharacterDirection actualDirection;
    private CharacterDirection pastDirection;
    private boolean battleIsStarted = false;
    
    private int DAMAGE = 2;
    private static int TOTAL_LIVES = 6;
    private static int MOVEMENT = 15;
    private int lives = TOTAL_LIVES;
    
    private boolean isOnTop = true;
    private boolean isVulnerable = false;
    private boolean isHitted = false;
    private boolean playerIsHitted = false;
    private static int LIMIT_MOVEMENT_DELAY = 3;
    private int limitTimeToAttack = Greenfoot.getRandomNumber(80)+40;
    private int limitTimeVulnerable = 150;
    private int limitTimeUntilPlayerIsHittedAgain = 100;
    private int limitNumberOfAttacks = 5;
    
    private int spritesIndex = 4;
    private int movementCounter = 0;
    private int timeToAttackCounter = 0;
    private int timeVulnerableCounter = 0;
    private int timeUntilPlayerIsHittedCounter = 0;
    private int numberOfAttacksCounter = 0;
    
    public Spider() {
        initializeSprites();
        setImage(extraSprites[0]);
        actualDirection = CharacterDirection.LEFT;
    }
    
    public int getLives() {
        return TOTAL_LIVES;
    }
    
    public int getActualLives() {
        return lives;
    }
    
    public void act()
    {
        if(lives != 0 && battleIsStarted) {
            
            if(timeToAttackCounter == limitTimeToAttack) {
                attack();
                walk();
                movementCounter++;
            } else if(numberOfAttacksCounter == limitNumberOfAttacks) {
                standBy();
            } else {
                walk();
                movementCounter++;
                timeToAttackCounter++;
            }
            
            if(playerIsHitted) {
                timeUntilPlayerIsHittedCounter++;
                if(timeUntilPlayerIsHittedCounter == limitTimeUntilPlayerIsHittedAgain) {
                    playerIsHitted = false;
                    timeUntilPlayerIsHittedCounter = 0;
                }
            }
            
        } else if(!battleIsStarted){
            startBattle();
        } else {
            finishBattle();
        }
    }
    
    public void walk() {
        
        isHitted = false;
        
        if (movementCounter == LIMIT_MOVEMENT_DELAY) {
            
            if(spritesIndex > 8)
                spritesIndex = 4;
            changeSprite();
            move();
            spritesIndex++;
            movementCounter = 0;
        }
    }
    
    public void attack() {
        
        if(isOnTop) {
            actualDirection = CharacterDirection.DOWN;
        } else {
            actualDirection = CharacterDirection.UP;
        }
    }
    
    public void standBy() {
        try {
              checkCollisions();
            
            if (timeVulnerableCounter == limitTimeVulnerable) {
                timeVulnerableCounter = 0;
                numberOfAttacksCounter = 0;
                isVulnerable = false;
            } else {
                
                if(pastDirection == CharacterDirection.UP && !isVulnerable) {
                    setImage(extraSprites[0]);
                } else if(!isVulnerable){
                    setImage(upSprites[3]);
                }
                
                isVulnerable = true;
                timeVulnerableCounter++;
            }
        }
        catch (WallCollisionException Ex) {}
        catch (PlayerCollisionException Ex) {
            
            if(Greenfoot.isKeyDown(Keys.CONFIRMATION) && !isHitted) {
                isHitted = true;
                lives--;
                ((Game)getWorld()).hud.updateBossLives(lives);
                hit.play();
                scream.play();
            }
            
        }
    }
    
    public void changeSprite() {
        switch(actualDirection) {
            case UP:
                setImage(upSprites[spritesIndex]);
            break;
            case DOWN:
                setImage(downSprites[spritesIndex]);
            break;
            case LEFT:
                setImage(leftSprites[spritesIndex]);
            break;
            case RIGHT:
                setImage(rightSprites[spritesIndex]);
            break;
        }
    }
    
    public void move() {
        try {
            
            checkCollisions();
            
            switch(actualDirection) {
                case UP:
                    setLocation(getX(),getY()-MOVEMENT);
                break;
                case DOWN:
                    setLocation(getX(),getY()+MOVEMENT);
                break;
                case LEFT:
                    setLocation(getX()-MOVEMENT,getY());
                break;
                case RIGHT:
                    setLocation(getX()+MOVEMENT,getY());
                break;
            }
            
        } catch(WallCollisionException Ex) {
            
            pastDirection = actualDirection;
            
            if(actualDirection == CharacterDirection.UP) {
                isOnTop = true;
                timeToAttackCounter = 0;
                limitTimeToAttack = Greenfoot.getRandomNumber(80)+40;
                actualDirection = CharacterDirection.getRandomSidesDirection();
                numberOfAttacksCounter++;
                
            } else if(actualDirection == CharacterDirection.DOWN) {
                isOnTop = false;
                timeToAttackCounter = 0;
                limitTimeToAttack = Greenfoot.getRandomNumber(80)+40;
                actualDirection = CharacterDirection.getRandomSidesDirection();
                numberOfAttacksCounter++;
                
            } else if(actualDirection == CharacterDirection.LEFT)
                actualDirection = CharacterDirection.RIGHT;
                
            else if (actualDirection == CharacterDirection.RIGHT)
                actualDirection = CharacterDirection.LEFT;
        }
        catch (PlayerCollisionException Ex) {
            playerIsHitted = true;
            bite.play();
            ((Game)getWorld()).player.removeLife(DAMAGE);
            ((Game)getWorld()).hud.updateLives(((Game)getWorld()).player.getLives());
        }
    }
    
    public void checkCollisions() throws WallCollisionException, PlayerCollisionException{
        
        Wall wall = null;
        Player player = null;
        
        switch(actualDirection) {
            case UP:
                wall = (Wall)getOneObjectAtOffset(0,-60,Wall.class);
                player = (Player)getOneObjectAtOffset(0,-15,Player.class);
            break;
            case DOWN:
                wall = (Wall)getOneObjectAtOffset(0,60,Wall.class);
                player = (Player)getOneObjectAtOffset(0,15,Player.class);
            break;
            case LEFT:
                wall = (Wall)getOneObjectAtOffset(-60,0,Wall.class);
                player = (Player)getOneObjectAtOffset(-15,0,Player.class);
            break;
            case RIGHT:
                wall = (Wall)getOneObjectAtOffset(60,0,Wall.class);
                player = (Player)getOneObjectAtOffset(15,0,Player.class);
            break;
        }
        
        if(player != null && !playerIsHitted)
            throw new PlayerCollisionException();
        else if(wall != null)
            throw new WallCollisionException();
            
        
    }
    
    public void startBattle() {
        Greenfoot.delay(50);
        scream.play();
        setImage(downSprites[0]);
        Greenfoot.delay(100);
        battleIsStarted = true;
    }
    
    public void finishBattle() {
        
        Greenfoot.delay(100);
        scream.play();
        
        if(pastDirection == CharacterDirection.UP)
            setImage(extraSprites[1]);
        else
            setImage(extraSprites[2]);
        
        Greenfoot.delay(100);
        ((Game)getWorld()).hud.clearBossLives();
        getWorld().removeObjects(getWorld().getObjects(Spider.class));
    }
    
    public void initializeSprites() {
        upSprites[0] = new GreenfootImage("./images/characters/boss_spider/up_00.png");
        upSprites[1] = new GreenfootImage("./images/characters/boss_spider/up_01.png");
        upSprites[2] = new GreenfootImage("./images/characters/boss_spider/up_02.png");
        upSprites[3] = new GreenfootImage("./images/characters/boss_spider/up_03.png");
        upSprites[4] = new GreenfootImage("./images/characters/boss_spider/up_04.png");
        upSprites[5] = new GreenfootImage("./images/characters/boss_spider/up_05.png");
        upSprites[6] = new GreenfootImage("./images/characters/boss_spider/up_06.png");
        upSprites[7] = new GreenfootImage("./images/characters/boss_spider/up_07.png");
        upSprites[8] = new GreenfootImage("./images/characters/boss_spider/up_08.png");
        upSprites[9] = new GreenfootImage("./images/characters/boss_spider/up_09.png");
        
        downSprites[0] = new GreenfootImage("./images/characters/boss_spider/down_00.png");
        downSprites[1] = new GreenfootImage("./images/characters/boss_spider/down_01.png");
        downSprites[2] = new GreenfootImage("./images/characters/boss_spider/down_02.png");
        downSprites[3] = new GreenfootImage("./images/characters/boss_spider/down_03.png");
        downSprites[4] = new GreenfootImage("./images/characters/boss_spider/down_04.png");
        downSprites[5] = new GreenfootImage("./images/characters/boss_spider/down_05.png");
        downSprites[6] = new GreenfootImage("./images/characters/boss_spider/down_06.png");
        downSprites[7] = new GreenfootImage("./images/characters/boss_spider/down_07.png");
        downSprites[8] = new GreenfootImage("./images/characters/boss_spider/down_08.png");
        downSprites[9] = new GreenfootImage("./images/characters/boss_spider/down_09.png");
        
        leftSprites[0] = new GreenfootImage("./images/characters/boss_spider/left_00.png");
        leftSprites[1] = new GreenfootImage("./images/characters/boss_spider/left_01.png");
        leftSprites[2] = new GreenfootImage("./images/characters/boss_spider/left_02.png");
        leftSprites[3] = new GreenfootImage("./images/characters/boss_spider/left_03.png");
        leftSprites[4] = new GreenfootImage("./images/characters/boss_spider/left_04.png");
        leftSprites[5] = new GreenfootImage("./images/characters/boss_spider/left_05.png");
        leftSprites[6] = new GreenfootImage("./images/characters/boss_spider/left_06.png");
        leftSprites[7] = new GreenfootImage("./images/characters/boss_spider/left_07.png");
        leftSprites[8] = new GreenfootImage("./images/characters/boss_spider/left_08.png");
        leftSprites[9] = new GreenfootImage("./images/characters/boss_spider/left_09.png");
        
        rightSprites[0] = new GreenfootImage("./images/characters/boss_spider/right_00.png");
        rightSprites[1] = new GreenfootImage("./images/characters/boss_spider/right_01.png");
        rightSprites[2] = new GreenfootImage("./images/characters/boss_spider/right_02.png");
        rightSprites[3] = new GreenfootImage("./images/characters/boss_spider/right_03.png");
        rightSprites[4] = new GreenfootImage("./images/characters/boss_spider/right_04.png");
        rightSprites[5] = new GreenfootImage("./images/characters/boss_spider/right_05.png");
        rightSprites[6] = new GreenfootImage("./images/characters/boss_spider/right_06.png");
        rightSprites[7] = new GreenfootImage("./images/characters/boss_spider/right_07.png");
        rightSprites[8] = new GreenfootImage("./images/characters/boss_spider/right_08.png");
        rightSprites[9] = new GreenfootImage("./images/characters/boss_spider/right_09.png");
        
        extraSprites[0] = new GreenfootImage("./images/characters/boss_spider/extra_00.png");
        extraSprites[1] = new GreenfootImage("./images/characters/boss_spider/extra_01.png");
        extraSprites[2] = new GreenfootImage("./images/characters/boss_spider/extra_02.png");
    }
}
