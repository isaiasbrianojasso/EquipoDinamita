import greenfoot.*;

public abstract class Spider extends Actor
{
    protected GreenfootSound scream = new GreenfootSound("./sounds/spider_scream.wav");
    protected GreenfootSound bite = new GreenfootSound("./sounds/spider_bite.wav");
    
    protected GreenfootImage []spritesUp = new GreenfootImage[5];
    protected GreenfootImage []spritesDown = new GreenfootImage[5];
    protected GreenfootImage []spritesLeft = new GreenfootImage[5];
    protected GreenfootImage []spritesRight = new GreenfootImage[5];
    protected GreenfootImage []spritesExtra = new GreenfootImage[5];
    protected CharacterDirection direction;
    protected int speed;
    protected int advance;
    protected int damage;
    
    private int movementCounter = 0;
    private int spritesIndex = 0;
    
    public void walk() {
        
        if (movementCounter == advance) {
            
            if(spritesIndex > 4)
                spritesIndex = 0;
            
            changeSprite();
            move();
            spritesIndex++;
            movementCounter = 0;
        }
        movementCounter++;
    }
    
    public void changeSprite() {
        switch(direction) {
            case UP:
                setImage(spritesUp[spritesIndex]);
            break;
            case DOWN:
                setImage(spritesDown[spritesIndex]);
            break;
            case LEFT:
                setImage(spritesLeft[spritesIndex]);
            break;
            case RIGHT:
                setImage(spritesRight[spritesIndex]);
            break;
        }
    }
    
    public void move() {
        switch(direction) {
            case UP:
                setLocation(getX(),getY()-speed);
            break;
            case DOWN:
                setLocation(getX(),getY()+speed);
            break;
            case LEFT:
                setLocation(getX()-speed,getY());
            break;
            case RIGHT:      
                setLocation(getX()+speed,getY());
            break;
        }
    }
    
    public void changeDirection() {
        
        switch(direction) {
            case UP:
                direction = CharacterDirection.DOWN;
            break;
            case DOWN:
                direction = CharacterDirection.UP;
            break;
            case LEFT:
                direction = CharacterDirection.RIGHT;
            break;
            case RIGHT:
                direction = CharacterDirection.LEFT;
            break;
        }
    }
    
    public void checkCollisions(int distance) throws WallCollisionException, PlayerCollisionException{
        
        Wall wall = null;
        
        switch(direction) {
            case UP:
                wall = (Wall)getOneObjectAtOffset(0,-distance,Wall.class);
            break;
            case DOWN:
                wall = (Wall)getOneObjectAtOffset(0,distance,Wall.class);
            break;
            case LEFT:
                wall = (Wall)getOneObjectAtOffset(-distance,0,Wall.class);
            break;
            case RIGHT:
                wall = (Wall)getOneObjectAtOffset(distance,0,Wall.class);
            break;
        }
        
        if((Player)getOneObjectAtOffset(0,-distance,Player.class) != null ||
            (Player)getOneObjectAtOffset(0,distance,Player.class) != null ||
            (Player)getOneObjectAtOffset(-distance,0,Player.class) != null ||
            (Player)getOneObjectAtOffset(distance,0,Player.class) != null)
            throw new PlayerCollisionException();
        
        else if(wall != null)
            throw new WallCollisionException();
    }
    
    public void playerDamage() {
        bite.play();
        ((Game)getWorld()).player.removeLife(damage);
        ((Game)getWorld()).hud.updateLives(((Game)getWorld()).player.getLives());
    }
}