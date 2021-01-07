import greenfoot.*;
import java.util.*;

public class Player extends Character
{
    private int lives;
    private static int INITIAL_ADVANCE = 8;
    private static int INITIAL_SPEED = 12;
    private static int STAMINA_SPEED = 18;
    private static int INITIAL_LIVES = 6;
    private List<KeyObject> inventory = new ArrayList<KeyObject>();

    public Player() {
        lives = INITIAL_LIVES;
        speed = INITIAL_SPEED;
        advance = INITIAL_ADVANCE;
        direction = CharacterDirection.DOWN;
        name = "Nombre";

        spritesRight[0] = new GreenfootImage("./images/characters/protagonista_derecha_2.png");
        spritesRight[1] = new GreenfootImage("./images/characters/protagonista_derecha_1.png");
        spritesRight[2] = new GreenfootImage("./images/characters/protagonista_derecha_2.png");
        spritesRight[3] = new GreenfootImage("./images/characters/protagonista_derecha_3.png");

        spritesUp[0] = new GreenfootImage("./images/characters/protagonista_arriba_2.png");
        spritesUp[1] = new GreenfootImage("./images/characters/protagonista_arriba_1.png");
        spritesUp[2] = new GreenfootImage("./images/characters/protagonista_arriba_2.png");
        spritesUp[3] = new GreenfootImage("./images/characters/protagonista_arriba_3.png");

        spritesDown[0] = new GreenfootImage("./images/characters/protagonista_abajo_2.png");
        spritesDown[1] = new GreenfootImage("./images/characters/protagonista_abajo_1.png");
        spritesDown[2] = new GreenfootImage("./images/characters/protagonista_abajo_2.png");
        spritesDown[3] = new GreenfootImage("./images/characters/protagonista_abajo_3.png");

        spritesLeft[0] = new GreenfootImage("./images/characters/protagonista_izquierda_2.png");
        spritesLeft[1] = new GreenfootImage("./images/characters/protagonista_izquierda_1.png");
        spritesLeft[2] = new GreenfootImage("./images/characters/protagonista_izquierda_2.png");
        spritesLeft[3] = new GreenfootImage("./images/characters/protagonista_izquierda_3.png");
        
        setOriginalPosition();
    }
    
    public void act() {
        try {
            checkKeyPressed();
            checkRunKey();
            checkCollisions();
            advance = INITIAL_ADVANCE;
            characterMove();
        }
        catch(NoKeyPressedException Ex) {
            if(currentSprite != 0)
                setOriginalPosition();
            checkInteractionsNoMoving();
        }
        catch(ObjectCollisionException Ex) {
            checkInteractions();
            characterMove();
        }
        catch(WallCollisionException Ex) {
            advance = 0;
            characterMove();
        }
    }
    
    public void checkInteractionsNoMoving(){
        try {
            checkCollisions();
        } catch(ObjectCollisionException Ex) {
            checkInteractions();
        } catch(WallCollisionException Ex){}
    }
    
    public void checkKeyPressed() throws NoKeyPressedException{
        if(Greenfoot.isKeyDown("left")) {
            setDirection(CharacterDirection.LEFT);
        }
        else if(Greenfoot.isKeyDown("right")) {
            setDirection(CharacterDirection.RIGHT);
        }
        else if(Greenfoot.isKeyDown("up")) {
            setDirection(CharacterDirection.UP);
        }
        else if(Greenfoot.isKeyDown("down")) {
            setDirection(CharacterDirection.DOWN);
        }
        else {
            throw new NoKeyPressedException();
        }
    }
    
    public void checkRunKey() {
        if(Greenfoot.isKeyDown("c")) {
            speed = STAMINA_SPEED;
        } else {
            speed = INITIAL_SPEED;
        }
    }
    
    public void checkInteractions(){
        try {
            collisionObject.isMovable();
            collisionObject.checkCollisions(direction);
            advance = INITIAL_ADVANCE;
            collisionObject.movement(direction);
        }
        catch(NoMovableObjectException Ex) {
            advance = 0;
            if(Greenfoot.isKeyDown("x")) {
                checkDoor();
            }
        }
    }
    
    public void checkDoor() {
        if(collisionObject instanceof Door) {
            ((Door)collisionObject).tryToOpen(inventory);
        } else {
            collisionObject.receiveObject();
            
            if(collisionObject.getObject() != null) {
                
                inventory.add(collisionObject.getObject());
                collisionObject.setObject(null);
            }
        }
    }
}

