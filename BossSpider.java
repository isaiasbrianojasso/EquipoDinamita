import greenfoot.*;

public class BossSpider extends Spider
{
    private GreenfootSound hit = new GreenfootSound("./sounds/spider_hit.wav");
    
    private boolean battleIsStarted = false;
    
    private static int TOTAL_LIVES = 6;
    private int lives = TOTAL_LIVES;
    
    private boolean defeated = false;
    private boolean isOnTop = true;
    private boolean isVulnerable = false;
    private boolean isHitted = false;
    private boolean playerIsHitted = false;
    
    private int limitTimeToAttack = Greenfoot.getRandomNumber(80)+40;
    private int limitTimeToAddAnotherSpider = 60;
    private int limitTimeVulnerable = 150;
    private int limitTimeUntilPlayerIsHittedAgain = 100;
    private int limitNumberOfAttacks = 3;
    
    private int timeToAttackCounter = 0;
    private int timeToAddAnotherSpiderCounter = 0;
    private int timeVulnerableCounter = 0;
    private int timeUntilPlayerIsHittedCounter = 0;
    private int numberOfAttacksCounter = 0;
    
    public BossSpider() {
        speed = 15;
        advance = 3;
        damage = 2;
        initializeSprites();
        setImage(spritesExtra[0]);
        direction = CharacterDirection.LEFT;
    }
    
    public int getTotalLives() {
        return TOTAL_LIVES;
    }
    
    public boolean isDefeated() {
        return defeated;
    }
    
    public void act()
    {
        if(battleIsStarted)
            try {
                checkCollisions(60);
                attack();
                walk();
                vulnerableCounter();
                
            } catch (WallCollisionException Ex) {
                checkWallsCollisions();
                
            } catch (PlayerCollisionException Ex) {
                if(!playerIsHitted && !isVulnerable) {
                    playerDamage();
                    playerIsHitted = true;
                }
                else if(isVulnerable) {
                    hitCheck();
                }
                else
                    walk();
                
            } catch (VulnerableEnemyException Ex) {
                standBy();
            }
            
        if(lives == 0)
            finishBattle();
    }
    
    public void attack() throws VulnerableEnemyException{
        
        if(isOnTop && timeToAttackCounter == limitTimeToAttack) {
            direction = CharacterDirection.DOWN;
        }
        else if(timeToAttackCounter == limitTimeToAttack) {
            direction = CharacterDirection.UP;
        }
        else if(numberOfAttacksCounter == limitNumberOfAttacks) {
            throw new VulnerableEnemyException();
        }
        else {
            addSpiders();
            timeToAttackCounter++;
        }
    }
    
    public void checkWallsCollisions() {
        
        if(direction == CharacterDirection.UP) {
            isOnTop = true;
            timeToAttackCounter = 0;
            limitTimeToAttack = Greenfoot.getRandomNumber(80)+40;
            direction = CharacterDirection.getRandomSidesDirection();
            numberOfAttacksCounter++;
            
        } else if(direction == CharacterDirection.DOWN) {
            isOnTop = false;
            timeToAttackCounter = 0;
            limitTimeToAttack = Greenfoot.getRandomNumber(80)+40;
            direction = CharacterDirection.getRandomSidesDirection();
            numberOfAttacksCounter++;
            
        } else
            changeDirection();
    }
    
    public void standBy() {
        
        if(!isVulnerable) {
            if(isOnTop)
                setImage(spritesExtra[0]);
            else
                setImage(spritesExtra[1]);
        }
        
        isVulnerable = true;
        
        if(timeVulnerableCounter == limitTimeVulnerable) {
            isVulnerable = false;
            numberOfAttacksCounter = 0;
            timeVulnerableCounter = 0;
        } else {
            timeVulnerableCounter++;
        }
    }
    
    public void hitCheck() {
        if(Greenfoot.isKeyDown(Keys.CONFIRMATION) && !isHitted) {
            isHitted = true;
            lives--;
            ((Game)getWorld()).hud.updateBossLives(lives);
            hit.play();
            scream.play();
        }
    }
    
    public void addSpiders() {
        if(lives <= TOTAL_LIVES/2 && timeToAddAnotherSpiderCounter == limitTimeToAddAnotherSpider) {
            getWorld().addObject(new LittleSpider(),this.getX(),this.getY());
            timeToAddAnotherSpiderCounter = 0;
        }
        else if(lives <= TOTAL_LIVES/2)
           timeToAddAnotherSpiderCounter++;
    }
    
    public void vulnerableCounter() {
        if(playerIsHitted && timeUntilPlayerIsHittedCounter != limitTimeUntilPlayerIsHittedAgain) {
            timeUntilPlayerIsHittedCounter++;
        }
        else if (timeUntilPlayerIsHittedCounter == limitTimeUntilPlayerIsHittedAgain){
            timeUntilPlayerIsHittedCounter = 0;
            playerIsHitted = false;
        }
        
        if(isHitted && timeVulnerableCounter != limitTimeVulnerable) {
            timeVulnerableCounter++;
        }
        else if (timeVulnerableCounter == limitTimeVulnerable){
            timeVulnerableCounter = 0;
            isHitted = false;
        }
        
    }
    
    public void startBattle() {
        Greenfoot.delay(50);
        scream.play();
        setImage(spritesExtra[2]);
        Greenfoot.delay(100);
        battleIsStarted = true;
    }
    
    public void finishBattle() {
        
        Greenfoot.delay(100);
        scream.play();
        
        if(direction == CharacterDirection.UP)
            setImage(spritesExtra[4]);
        else
            setImage(spritesExtra[3]);
        
        Greenfoot.delay(100);
        defeated = true;
        ((Game)getWorld()).hud.clearBossLives();
        getWorld().removeObject(this);
    }
    
    public void initializeSprites() {
        spritesUp[0] = new GreenfootImage("./images/characters/boss_spider/up_00.png");
        spritesUp[1] = new GreenfootImage("./images/characters/boss_spider/up_01.png");
        spritesUp[2] = new GreenfootImage("./images/characters/boss_spider/up_02.png");
        spritesUp[3] = new GreenfootImage("./images/characters/boss_spider/up_03.png");
        spritesUp[4] = new GreenfootImage("./images/characters/boss_spider/up_04.png");
        
        spritesDown[0] = new GreenfootImage("./images/characters/boss_spider/down_00.png");
        spritesDown[1] = new GreenfootImage("./images/characters/boss_spider/down_01.png");
        spritesDown[2] = new GreenfootImage("./images/characters/boss_spider/down_02.png");
        spritesDown[3] = new GreenfootImage("./images/characters/boss_spider/down_03.png");
        spritesDown[4] = new GreenfootImage("./images/characters/boss_spider/down_04.png");
        
        spritesLeft[0] = new GreenfootImage("./images/characters/boss_spider/left_00.png");
        spritesLeft[1] = new GreenfootImage("./images/characters/boss_spider/left_01.png");
        spritesLeft[2] = new GreenfootImage("./images/characters/boss_spider/left_02.png");
        spritesLeft[3] = new GreenfootImage("./images/characters/boss_spider/left_03.png");
        spritesLeft[4] = new GreenfootImage("./images/characters/boss_spider/left_04.png");
        
        spritesRight[0] = new GreenfootImage("./images/characters/boss_spider/right_00.png");
        spritesRight[1] = new GreenfootImage("./images/characters/boss_spider/right_01.png");
        spritesRight[2] = new GreenfootImage("./images/characters/boss_spider/right_02.png");
        spritesRight[3] = new GreenfootImage("./images/characters/boss_spider/right_03.png");
        spritesRight[4] = new GreenfootImage("./images/characters/boss_spider/right_04.png");
        
        spritesExtra[0] = new GreenfootImage("./images/characters/boss_spider/extra_00.png");
        spritesExtra[1] = new GreenfootImage("./images/characters/boss_spider/extra_01.png");
        spritesExtra[2] = new GreenfootImage("./images/characters/boss_spider/extra_02.png");
        spritesExtra[3] = new GreenfootImage("./images/characters/boss_spider/extra_03.png");
        spritesExtra[4] = new GreenfootImage("./images/characters/boss_spider/extra_04.png");
    }
}