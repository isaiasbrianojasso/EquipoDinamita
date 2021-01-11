import greenfoot.*;

public class Enemigo extends Enemy
{
    private int option;
    
    public Enemigo(int opcion)
    {
        spritesUp = new GreenfootImage[4];
        spritesDown = new GreenfootImage[4];
        spritesLeft = new GreenfootImage[4];
        spritesRight = new GreenfootImage[4];
        
        option = opcion;
        direction = CharacterDirection.DOWN;
        
        switch(opcion){
            case 0:
            speed = 8;
            advance = 4;
            damage = 2;

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
            break;

            case 1:
            speed = 6;
            advance = 4;
            damage = 2;

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
            break;

            case 2:
            speed = 4;
            advance = 4;
            damage = 1;

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
            break;
            
            case 3:
            speed = 2;
            advance = 4;
            damage = 1;

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
            break;
        }
        direction = CharacterDirection.DOWN;
        setImage(spritesDown[0]);
    }

    public void act() {
        try {
            checkCollisions(20);
            searchPlayer();
            walk(4);
            growl();
        } catch(WallCollisionException Ex) {
            changeDirection();
        } catch(PlayerCollisionException Ex) {
            if(!playerIsHitted) {
                playerDamage();
                biteSound();
                playerIsHitted = true;
            }
            walk(4);
        }
        playerVulnerableCounter();
    }
    
    public void biteSound() {
        if(option == 0)
            Sounds.fantasma_mordida();
        else
            Sounds.zombie_mordida();
    }
    
    public void growl() {
        if(Greenfoot.getRandomNumber(300) == 0)
            if(option == 0)
                Sounds.fantasma_lamento();
            else
                Sounds.zombie_fondo(); 
    }
} 
