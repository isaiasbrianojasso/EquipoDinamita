import greenfoot.*;

public class LittleSpider extends Spider
{
    private GreenfootSound bite = new GreenfootSound("./sounds/spider_bite.wav");
    private static int livingTime = 200;
    private int searchingDelay = 0;
    private int livingTimeCounter = 0;
    
    public LittleSpider() {
        speed = 12;
        advance = 4;
        damage = 1;
        direction = CharacterDirection.RIGHT;
        
        spritesUp[0] = new GreenfootImage("./images/characters/little_spider/up_00.png");
        spritesUp[1] = new GreenfootImage("./images/characters/little_spider/up_01.png");
        spritesUp[2] = new GreenfootImage("./images/characters/little_spider/up_02.png");
        spritesUp[3] = new GreenfootImage("./images/characters/little_spider/up_03.png");
        spritesUp[4] = new GreenfootImage("./images/characters/little_spider/up_04.png");
        
        spritesDown[0] = new GreenfootImage("./images/characters/little_spider/down_00.png");
        spritesDown[1] = new GreenfootImage("./images/characters/little_spider/down_01.png");
        spritesDown[2] = new GreenfootImage("./images/characters/little_spider/down_02.png");
        spritesDown[3] = new GreenfootImage("./images/characters/little_spider/down_03.png");
        spritesDown[4] = new GreenfootImage("./images/characters/little_spider/down_04.png");
        
        spritesLeft[0] = new GreenfootImage("./images/characters/little_spider/left_00.png");
        spritesLeft[1] = new GreenfootImage("./images/characters/little_spider/left_01.png");
        spritesLeft[2] = new GreenfootImage("./images/characters/little_spider/left_02.png");
        spritesLeft[3] = new GreenfootImage("./images/characters/little_spider/left_03.png");
        spritesLeft[4] = new GreenfootImage("./images/characters/little_spider/left_04.png");
        
        spritesRight[0] = new GreenfootImage("./images/characters/little_spider/right_00.png");
        spritesRight[1] = new GreenfootImage("./images/characters/little_spider/right_01.png");
        spritesRight[2] = new GreenfootImage("./images/characters/little_spider/right_02.png");
        spritesRight[3] = new GreenfootImage("./images/characters/little_spider/right_03.png");
        spritesRight[4] = new GreenfootImage("./images/characters/little_spider/right_04.png");
        setImage(spritesDown[0]);
    }
    
    public void act() 
    {
        try {
            checkCollisions(20);
            searchPlayer();
            walk();
        } catch(WallCollisionException Ex) {
            changeDirection();
        } catch(PlayerCollisionException Ex) {
            playerDamage();
            getWorld().removeObject(this);
        }
        checkTimeLiving();
    }
    
    public void searchPlayer() {
        
        if(searchingDelay == 0 && ((Game)getWorld()).player.getY() < this.getY()) {
            direction = CharacterDirection.UP;
        }
        
        else if(searchingDelay == 15 && ((Game)getWorld()).player.getY() > this.getY()) {
            direction = CharacterDirection.DOWN;
        }
        
        else if(searchingDelay == 30 && ((Game)getWorld()).player.getX() < this.getX()) {
            direction = CharacterDirection.LEFT;
        }
        
        else if(searchingDelay == 45 && ((Game)getWorld()).player.getX() > this.getX()) {
            direction = CharacterDirection.RIGHT;
        }
        
        else if(searchingDelay == 50) {
            searchingDelay = -1;
        }
        searchingDelay++;
    }
    
    public void checkTimeLiving() {
        if (livingTimeCounter == livingTime){
            scream.play();
            getWorld().removeObject(this);
        }
        else
            livingTimeCounter++;
    }
}
