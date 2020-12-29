import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    private static int INITIAL_SPEED = 5;
    private static int STAMINA_SPEED = 10;
    private static int INITIAL_LIVES = 1;
 
    public Enemigo_1(){
        lives = INITIAL_LIVES;
        speed = INITIAL_SPEED;
        advance = INITIAL_ADVANCE;
        direction = CharacterDirection.DOWN;
        name = "D";

        dragonderecha = new GreenfootImage[3];
        dragonderecha[0] = new GreenfootImage("./src/dragon_derecha_1.png");
        dragonderecha[1] = new GreenfootImage("./src/dragon_derecha_2.png");
        dragonderecha[2] = new GreenfootImage("./src/dragon_derecha_3.png");

        dragonizquierda = new GreenfootImage[3];
        dragonizquierda[0] = new GreenfootImage("./src/dragon_izquierda_1.png");
        dragonizquierda[1] = new GreenfootImage("./src/dragon_izquierda_2.png");
        dragonizquierda[2] = new GreenfootImage("./src/dragon_izquierda_3.png");

        dragonarriba = new GreenfootImage[3];
        dragonarriba[0] = new GreenfootImage("./src/dragon_arriba_1.png");
        dragonarriba[1] = new GreenfootImage("./src/dragon_arriba_2.png");
        dragonarriba[2] = new GreenfootImage("./src/dragon_arriba_3.png");

        dragonabajo = new GreenfootImage[3];
        dragonabajo[0] = new GreenfootImage("./src/dragon_abajo_1.png");
        dragonabajo[1] = new GreenfootImage("./src/dragon_abajo_2.png");
        dragonabajo[2] = new GreenfootImage("./src/dragon_abajo_3.png");

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
            }
        }
        catch(ObjectCollisionException Ex) {
            advance = 0;
        }
    }
    
    /**
     * Act - do whatever the Enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        int normal = Greenfoot.getRandomNumber(4-0);

        if(normal==0){
            
            if(currentSprite < dragonarriba.length-1 ){
                currentSprite++;
            }else{
                currentSprite=0;

            }
            setDirection(CharacterDirection.RIGHT);
            
        }else if(normal==1){
            if(currentSprite < dragonabajo.length-1 ){
                currentSprite++;
            }else{
                currentSprite=0;

            }
            setImage(dragonabajo[currentSprite]); 
        }else if(normal==2){
            if(currentSprite < dragonizquierda.length-1 ){
                currentSprite++;
            }else{
                currentSprite=0;

            }
            setDirection(CharacterDirection.RIGHT);
        }
        else if(normal==3){
            if(currentSprite < dragonderecha.length-1 ){
                currentSprite++;
            }else{
                currentSprite=0;

            }
            setDirection(CharacterDirection.RIGHT);
        }

        // Add your action code here.
    }    
}
