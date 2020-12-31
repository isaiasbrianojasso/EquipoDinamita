import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Enemigo_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class Enemigo_1 extends Character
{
    private int lives;
    private static int INITIAL_ADVANCE = 8;
    private static int INITIAL_SPEED = 12;
    private static int STAMINA_SPEED = 18;
    private static int INITIAL_LIVES = 1;
    private  int contador=100;
    private  int normal=0;

    public Enemigo_1(int comogustes){
        normal=comogustes;
        lives = INITIAL_LIVES;
        speed = INITIAL_SPEED;
        advance = INITIAL_ADVANCE;
        direction = CharacterDirection.DOWN;
        name = "zombie";
        spritesRight[0] = new GreenfootImage("./images/characters/zombie_derecha_2.png");
        spritesRight[1] = new GreenfootImage("./images/characters/zombie_derecha_1.png");
        spritesRight[2] = new GreenfootImage("./images/characters/zombie_derecha_2.png");
        spritesRight[3] = new GreenfootImage("./images/characters/zombie_derecha_3.png");

        spritesUp[0] = new GreenfootImage("./images/characters/zombie_arriba_2.png");
        spritesUp[1] = new GreenfootImage("./images/characters/zombie_arriba_1.png");
        spritesUp[2] = new GreenfootImage("./images/characters/zombie_arriba_2.png");
        spritesUp[3] = new GreenfootImage("./images/characters/zombie_arriba_3.png");

        spritesDown[0] = new GreenfootImage("./images/characters/zombie_abajo_2.png");
        spritesDown[1] = new GreenfootImage("./images/characters/zombie_abajo_1.png");
        spritesDown[2] = new GreenfootImage("./images/characters/zombie_abajo_2.png");
        spritesDown[3] = new GreenfootImage("./images/characters/zombie_abajo_3.png");

        spritesLeft[0] = new GreenfootImage("./images/characters/zombie_izquierda_2.png");
        spritesLeft[1] = new GreenfootImage("./images/characters/zombie_izquierda_1.png");
        spritesLeft[2] = new GreenfootImage("./images/characters/zombie_izquierda_2.png");
        spritesLeft[3] = new GreenfootImage("./images/characters/zombie_izquierda_3.png");

        setOriginalPosition();

    }

    public int getInitialLives() {
        return INITIAL_LIVES;
    }

    public int getLives() {
        return lives;
    }

    public void addLife(int cure) {
        lives+=cure;
        if(lives > INITIAL_LIVES)
            lives = INITIAL_LIVES;
    }

    public void removeLife(int damage) {
        lives -= damage;
    }

    public void act() {
        try {
            //checkKeyPressed();
            //checkRunKey();
            if(contador==0){
                normal = Greenfoot.getRandomNumber(4-0);
                contador=100;
            }else{
                contador--;
            }
            if(normal==0){
                checkCollisions();
                checkCollisionsEnemigo();
                setDirection(CharacterDirection.RIGHT);
                advance = 2;
                characterMove();

            }else if(normal==1){

                checkCollisions();
                setDirection(CharacterDirection.LEFT);
                advance = 2;
                characterMove();

            }else if(normal==2){

                checkCollisions();
                setDirection(CharacterDirection.DOWN);
                advance = 2;
                characterMove();

            }
            else if(normal==3){
                checkCollisions();
                setDirection(CharacterDirection.UP);
                advance = 2;
                characterMove();

            }

        }

        catch(ObjectCollisionException Ex) {
            checkInteractions();
            characterMove();
        }
        catch(WallCollisionException Ex) {
            advance = 0;
            characterMove();
        }
          catch(EnemigoCollisionException Ex) {
            advance = 0;
            characterMove();
        }

    }

    public void checkInteractionsNoMoving(){
        try {
            checkCollisions();
        } catch(ObjectCollisionException Ex) {
            checkInteractions();
            setDirection(CharacterDirection.DOWN);

        } catch(WallCollisionException Ex){
            setDirection(CharacterDirection.DOWN);

        }
    }

    public void checkKeyPressed() throws NoKeyPressedException{
        if(Greenfoot.isKeyDown(Keys.LEFT)) {
            setDirection(CharacterDirection.LEFT);
        }
        else if(Greenfoot.isKeyDown(Keys.RIGHT)) {
            setDirection(CharacterDirection.RIGHT);
        }
        else if(Greenfoot.isKeyDown(Keys.UP)) {
            setDirection(CharacterDirection.UP);
        }
        else if(Greenfoot.isKeyDown(Keys.DOWN)) {
            setDirection(CharacterDirection.DOWN);
        }
        else {
            throw new NoKeyPressedException();
        }
    }

    public void checkRunKey() {
        if(Greenfoot.isKeyDown(Keys.RUN)) {
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

        }
        catch(ObjectCollisionException Ex) {
            advance = 0;
        }

    }

}
