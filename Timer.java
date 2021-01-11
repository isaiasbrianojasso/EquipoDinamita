import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int timer = 0;
    private int tiempo = 0;
    private static int hora=0;
    private static int minuto=0;
    private static int segundos=0;

    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        timer++;
        if (timer <= 0) {

            new Aviso();
        }
        if(timer>=60){
            segundos++;
            if(segundos>=60)
            {
                minuto++;
                segundos=0;
            }
            if(minuto>=60){
                hora++;
                minuto=0;
            }
            timer=0;
        }
        getWorld().showText(""+hora+":"+minuto+":"+segundos,900, 100);
        //Timer timer = new Timer("",0,0);

        // Add your action code here.
    }

    public static String stop() {

        // Greenfoot.stop(); // pause the execution of the program if 'timer' is less than or equal to 0

   return hora+":"+minuto+":"+segundos;
    }

    
}

