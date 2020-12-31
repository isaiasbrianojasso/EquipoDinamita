import greenfoot.*;

public abstract class Character extends Actor
{
    private final int DELAY_LIMIT = 20;
    protected Forniture collisionObject;
    protected Enemigo_1 enemigoObject;

    protected int currentSprite = 0;
    protected int delay = 0;
    protected int speed;
    protected int advance;
    protected String name;

    protected CharacterDirection direction;

    protected GreenfootImage []spritesRight = new GreenfootImage[4];
    protected GreenfootImage []spritesUp = new GreenfootImage[4];
    protected GreenfootImage []spritesLeft = new GreenfootImage[4];
    protected GreenfootImage []spritesDown = new GreenfootImage[4];

    protected GreenfootImage []zombieRigth = new GreenfootImage[4];
    protected GreenfootImage []zombieUp = new GreenfootImage[4];
    protected GreenfootImage []zombieLeft = new GreenfootImage[4];
    protected GreenfootImage []zombieDown = new GreenfootImage[4];

    public Character() {
        setImage(spritesDown[0]);
    }

    public void setDirection(CharacterDirection direction){
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void characterMove(){

        if (delay >= DELAY_LIMIT-speed) {

            delay = 0;

            switch(direction) {
                case RIGHT:
                rightMove();
                break;
                case UP:
                upMove();
                break;
                case LEFT:
                leftMove();
                break;
                case DOWN:
                downMove();
                break;
            }
        } 
        else {
            delay+=2;
        }
    }



    public void rightMove() {

        if(currentSprite < spritesRight.length-1 ){
            currentSprite++;
        }else{            
            currentSprite = 0;
        }

        setImage(spritesRight[currentSprite]);
        setLocation(getX()+advance,getY());
    }

    public void leftMove() {

        if(currentSprite < spritesLeft.length-1 ){
            currentSprite++;
        }else{            
            currentSprite = 0;
        }

        setImage(spritesLeft[currentSprite]);
        setLocation(getX()-advance,getY());
    }

    public void upMove() {

        if(currentSprite < spritesUp.length-1 ){
            currentSprite++;
        }else{            
            currentSprite = 0;
        }

        setImage(spritesUp[currentSprite]);
        setLocation(getX(),getY()-advance);
    }

    public void downMove() {

        if(currentSprite < spritesDown.length-1 ){
            currentSprite++;
        }else{            
            currentSprite = 0;
        }

        setImage(spritesDown[currentSprite]);
        setLocation(getX(),getY()+advance);
    }

    public void setOriginalPosition(){

        currentSprite = 0;

        switch(direction) {
            case RIGHT:
            setImage(spritesRight[0]);
            break;
            case UP:
            setImage(spritesUp[0]);
            break;
            case LEFT:
            setImage(spritesLeft[0]);
            break;
            case DOWN:
            setImage(spritesDown[0]);
            break;
        }
    }

    public void checkCollisions() throws ObjectCollisionException, WallCollisionException{

        collisionObject = null;
        enemigoObject = null;
        Wall wall = null;

        switch(direction) {
            case UP:
            collisionObject = (Forniture)getOneObjectAtOffset(0,-5,Forniture.class);
            wall = (Wall)getOneObjectAtOffset(0,-1,Wall.class);
            enemigoObject = (Enemigo_1)getOneObjectAtOffset(0,-1,Enemigo_1.class);
           
            //colision
            break;
            case DOWN:
            collisionObject = (Forniture)getOneObjectAtOffset(0,20,Forniture.class);
            wall = (Wall)getOneObjectAtOffset(0,24,Wall.class);
            enemigoObject = (Enemigo_1)getOneObjectAtOffset(0,24,Enemigo_1.class);
            //colision
            break;
            case LEFT:
            collisionObject = (Forniture)getOneObjectAtOffset(-13,12,Forniture.class);
            wall = (Wall)getOneObjectAtOffset(-15,12,Wall.class);
            enemigoObject = (Enemigo_1)getOneObjectAtOffset(-15,12,Enemigo_1.class);//colision

            break;
            case RIGHT:
            collisionObject = (Forniture)getOneObjectAtOffset(11,12,Forniture.class);
            wall = (Wall)getOneObjectAtOffset(12,12,Wall.class);
            enemigoObject = (Enemigo_1)getOneObjectAtOffset(12,12,Enemigo_1.class);//colision

            break;
        }

        if(collisionObject != null) {
            throw new ObjectCollisionException();
        } else if(wall != null) {
            throw new WallCollisionException();
        }else if(enemigoObject != null) {
           // Player.removeLife(2);
            throw new WallCollisionException();
        }
    }
        public void checkCollisionsEnemigo() throws EnemigoCollisionException{

        enemigoObject = null;

        switch(direction) {
            case UP:
            enemigoObject = (Enemigo_1)getOneObjectAtOffset(0,-5,Enemigo_1.class);
            break;
            case DOWN:
            enemigoObject = (Enemigo_1)getOneObjectAtOffset(0,20,Enemigo_1.class);
            break;
            case LEFT:
            enemigoObject = (Enemigo_1)getOneObjectAtOffset(-13,12,Enemigo_1.class);
            break;
            case RIGHT:
            enemigoObject = (Enemigo_1)getOneObjectAtOffset(11,12,Enemigo_1.class);
            break;
        }

        if(enemigoObject != null) {
            throw new EnemigoCollisionException();
        } 
    }
}
