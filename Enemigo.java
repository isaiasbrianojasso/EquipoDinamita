import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Character

{
    private  int contador=100;
    private  int normal=0;
    public Enemigo(int opcion,int comogustes)
    {
        normal=comogustes;
        direction = CharacterDirection.DOWN;
        switch(opcion){
            case 1:
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

            break;

            case 2:

            name = "fantasma";
            spritesRight[0] = new GreenfootImage("./images/characters/fantasma_derecha_2.png");
            spritesRight[1] = new GreenfootImage("./images/characters/fantasma_derecha_1.png");
            spritesRight[2] = new GreenfootImage("./images/characters/fantasma_derecha_2.png");
            spritesRight[3] = new GreenfootImage("./images/characters/fantasma_derecha_3.png");

            spritesUp[0] = new GreenfootImage("./images/characters/fantasma_arriba_2.png");
            spritesUp[1] = new GreenfootImage("./images/characters/fantasma_arriba_1.png");
            spritesUp[2] = new GreenfootImage("./images/characters/fantasma_arriba_2.png");
            spritesUp[3] = new GreenfootImage("./images/characters/fantasma_arriba_3.png");

            spritesDown[0] = new GreenfootImage("./images/characters/fantasma_abajo_2.png");
            spritesDown[1] = new GreenfootImage("./images/characters/fantasma_abajo_1.png");
            spritesDown[2] = new GreenfootImage("./images/characters/fantasma_abajo_2.png");
            spritesDown[3] = new GreenfootImage("./images/characters/fantasma_abajo_3.png");

            spritesLeft[0] = new GreenfootImage("./images/characters/fantasma_izquierda_2.png");
            spritesLeft[1] = new GreenfootImage("./images/characters/fantasma_izquierda_1.png");
            spritesLeft[2] = new GreenfootImage("./images/characters/fantasma_izquierda_2.png");
            spritesLeft[3] = new GreenfootImage("./images/characters/fantasma_izquierda_3.png");

            setOriginalPosition();
            break;

            case 3:
      name = "zombie2";
            spritesRight[0] = new GreenfootImage("./images/characters/zombie2_derecha_2.png");
            spritesRight[1] = new GreenfootImage("./images/characters/zombie2_derecha_1.png");
            spritesRight[2] = new GreenfootImage("./images/characters/zombie2_derecha_2.png");
            spritesRight[3] = new GreenfootImage("./images/characters/zombie2_derecha_3.png");
            spritesUp[0] = new GreenfootImage("./images/characters/zombie2_arriba_2.png");
            spritesUp[1] = new GreenfootImage("./images/characters/zombie2_arriba_1.png");
            spritesUp[2] = new GreenfootImage("./images/characters/zombie2_arriba_2.png");
            spritesUp[3] = new GreenfootImage("./images/characters/zombie2_arriba_3.png");
            spritesDown[0] = new GreenfootImage("./images/characters/zombie2_abajo_2.png");
            spritesDown[1] = new GreenfootImage("./images/characters/zombie2_abajo_1.png");
            spritesDown[2] = new GreenfootImage("./images/characters/zombie2_abajo_2.png");
            spritesDown[3] = new GreenfootImage("./images/characters/zombie2_abajo_3.png");
            spritesLeft[0] = new GreenfootImage("./images/characters/zombie2_izquierda_2.png");
            spritesLeft[1] = new GreenfootImage("./images/characters/zombie2_izquierda_1.png");
            spritesLeft[2] = new GreenfootImage("./images/characters/zombie2_izquierda_2.png");
            spritesLeft[3] = new GreenfootImage("./images/characters/zombie2_izquierda_3.png");
            setOriginalPosition();
            break;
           case 4:
                 name = "zombie3";
            spritesRight[0] = new GreenfootImage("./images/characters/zombie3_derecha_2.png");
            spritesRight[1] = new GreenfootImage("./images/characters/zombie3_derecha_1.png");
            spritesRight[2] = new GreenfootImage("./images/characters/zombie3_derecha_2.png");
            spritesRight[3] = new GreenfootImage("./images/characters/zombie3_derecha_3.png");
            spritesUp[0] = new GreenfootImage("./images/characters/zombie3_arriba_2.png");
            spritesUp[1] = new GreenfootImage("./images/characters/zombie3_arriba_1.png");
            spritesUp[2] = new GreenfootImage("./images/characters/zombie3_arriba_2.png");
            spritesUp[3] = new GreenfootImage("./images/characters/zombie3_arriba_3.png");
            spritesDown[0] = new GreenfootImage("./images/characters/zombie3_abajo_2.png");
            spritesDown[1] = new GreenfootImage("./images/characters/zombie3_abajo_1.png");
            spritesDown[2] = new GreenfootImage("./images/characters/zombie3_abajo_2.png");
            spritesDown[3] = new GreenfootImage("./images/characters/zombie3_abajo_3.png");
            spritesLeft[0] = new GreenfootImage("./images/characters/zombie3_izquierda_2.png");
            spritesLeft[1] = new GreenfootImage("./images/characters/zombie3_izquierda_1.png");
            spritesLeft[2] = new GreenfootImage("./images/characters/zombie3_izquierda_2.png");
            spritesLeft[3] = new GreenfootImage("./images/characters/zombie3_izquierda_3.png");
            setOriginalPosition();
           break;

        }
    }

    public void act() {
        try {
            //checkKeyPressed();
            //checkRunKey();
            if(contador==0){
                normal = Greenfoot.getRandomNumber(4-0);
                contador=50;
            }else{
                contador--;
            }
            if(normal==0){
                checkCollisions();
                checkCollisionsEnemigo();
                setDirection(CharacterDirection.RIGHT);
                advance = 5;
                characterMove();

            }else if(normal==1){

                checkCollisions();
                setDirection(CharacterDirection.LEFT);
                advance = 5;
                characterMove();

            }else if(normal==2){

                checkCollisions();
                setDirection(CharacterDirection.DOWN);
                advance = 5;
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

            setDirection(CharacterDirection.DOWN);
            checkInteractions();
            characterMove();

        }
        catch(WallCollisionException Ex) {

            setDirection(CharacterDirection.DOWN);
            advance = 4;
            characterMove();

        }
        catch(EnemigoCollisionException Ex) {

            setDirection(CharacterDirection.DOWN);
            advance = 4;
            characterMove();

        }
        catch(PlayerCollisionException Ex) {
            if(((Game)getWorld()).player.getLives()>0){
                ((Game)getWorld()).player.removeLife(1);
                ((Game)getWorld()).hud.updateLives(((Game)getWorld()).player.getLives());
                ((Game)getWorld()).player.setCoordenadas(getX(),getY()-80);
            }else{
                //gameover

            }

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

        }catch(PlayerCollisionException Ex){
            setDirection(CharacterDirection.DOWN);

        }
    }

    public void checkInteractions(){
        try {
            collisionObject.isMovable();
            collisionObject.checkCollisions(direction);
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
