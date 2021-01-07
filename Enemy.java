import greenfoot.*;

public abstract class Enemy extends Actor
{
    protected GreenfootImage []spritesUp;
    protected GreenfootImage []spritesDown;
    protected GreenfootImage []spritesLeft;
    protected GreenfootImage []spritesRight;
    protected GreenfootImage []spritesExtra;
    
    protected boolean playerIsHitted = false;
    protected int limitTimeUntilPlayerIsHittedAgain = 100;
    protected int timeUntilPlayerIsHittedCounter = 0;
    
    protected CharacterDirection direction;
    protected int speed;
    protected int advance;
    protected int damage;
    
    protected int movementCounter = 0;
    protected int spritesIndex = 0;
    protected int searchingDelay = 0;
    
    private Wall wall;
    private Forniture forniture;
    
    public void walk(int limit) {
        
        if (movementCounter == advance) {
            
            if(spritesIndex == limit)
                spritesIndex = 0;
            
            changeSprite();
            move();
            spritesIndex++;
            movementCounter = 0;
        }
        movementCounter++;
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
    
    public void checkCollisions(int distance) throws WallCollisionException, PlayerCollisionException{
        
        wall = null;
        forniture = null;
        
        switch(direction) {
            case UP:
                wall = (Wall)getOneObjectAtOffset(0,-distance,Wall.class);
                forniture = (Forniture)getOneObjectAtOffset(0,-distance,Forniture.class);
            break;
            case DOWN:
                wall = (Wall)getOneObjectAtOffset(0,distance,Wall.class);
                forniture = (Forniture)getOneObjectAtOffset(0,distance,Forniture.class);
            break;
            case LEFT:
                wall = (Wall)getOneObjectAtOffset(-distance,0,Wall.class);
                forniture = (Forniture)getOneObjectAtOffset(-distance,0,Forniture.class);
            break;
            case RIGHT:
                wall = (Wall)getOneObjectAtOffset(distance,0,Wall.class);
                forniture = (Forniture)getOneObjectAtOffset(0,-distance,Forniture.class);
            break;
        }
        
        if((Player)getOneObjectAtOffset(0,-distance,Player.class) != null ||
            (Player)getOneObjectAtOffset(0,distance,Player.class) != null ||
            (Player)getOneObjectAtOffset(-distance,0,Player.class) != null ||
            (Player)getOneObjectAtOffset(distance,0,Player.class) != null)
            throw new PlayerCollisionException();
        
        else if(wall != null)
            throw new WallCollisionException();
            
        else if(forniture != null) {
            evadeObject();
        }
    }
    
    public void evadeObject() {
        if(direction == CharacterDirection.UP || direction == CharacterDirection.DOWN)
            direction = CharacterDirection.getRandomSidesDirectionLR();
        else
            direction = CharacterDirection.getRandomSidesDirectionUD();
    }
    
    public void searchPlayer() {
        
        if(searchingDelay == 0 && ((Game)getWorld()).player.getX() < this.getX()) {
            direction = CharacterDirection.LEFT;
        }
        
        else if(searchingDelay == 0 && ((Game)getWorld()).player.getX() > this.getX()) {
            direction = CharacterDirection.RIGHT;
        }
        
        else if(searchingDelay == 30 && ((Game)getWorld()).player.getY() < this.getY()) {
            direction = CharacterDirection.UP;
        }
        
        else if(searchingDelay == 30 && ((Game)getWorld()).player.getY() > this.getY()) {
            direction = CharacterDirection.DOWN;
        }
        
        else if(searchingDelay == 50) {
            searchingDelay = -1;
        }
        searchingDelay++;
    }
    
    public void playerDamage() {
        ((Game)getWorld()).player.removeLife(damage);
        ((Game)getWorld()).hud.updateLives(((Game)getWorld()).player.getLives());
    }
    
    public void playerVulnerableCounter() {
        if(playerIsHitted && timeUntilPlayerIsHittedCounter != limitTimeUntilPlayerIsHittedAgain) {
            timeUntilPlayerIsHittedCounter++;
        }
        else if (timeUntilPlayerIsHittedCounter == limitTimeUntilPlayerIsHittedAgain){
            timeUntilPlayerIsHittedCounter = 0;
            playerIsHitted = false;
        }
    }
}
