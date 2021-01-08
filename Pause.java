import greenfoot.*;
import java.awt.Robot;

public class Pause extends Actor
{
    private SelectLight options = new SelectLight(1);
    private GreenfootImage OPTIONS_BOX = new GreenfootImage("./images/hud/options_box.png");
    
    public Pause() {
        setImage(OPTIONS_BOX);
    }
    
    public void startPause() {
        
        int option = 0;
        getWorld().showText("PAUSA",this.getX(),this.getY()-60);
        getWorld().showText("CONTINUAR",this.getX(),this.getY());
        getWorld().showText("SALIR",this.getX(),this.getY()+40);
        getWorld().addObject(options,this.getX(),this.getY());
        
        Greenfoot.delay(10);
        
        while(!Greenfoot.isKeyDown(Keys.PAUSE)) {
            
            if(Greenfoot.isKeyDown(Keys.UP)) {
                option--;
                if(option == -1) {option = 1;}
                changeOption(option);
            }
            else if(Greenfoot.isKeyDown(Keys.DOWN)) {
                option++;
                if(option == 2) {option = 0;}
                changeOption(option);
            }
            else if(Greenfoot.isKeyDown(Keys.CONFIRMATION)) {
                    executeOption(option);
                    return;
            }
            Greenfoot.delay(1);
        }
        
        clearPauseScreen();
        Greenfoot.delay(10);
    }
    
    public void changeOption(int option) {
        switch(option) {
            case 0:
                options.setLocation(this.getX(),this.getY());
            break;
            case 1:
                options.setLocation(this.getX(),this.getY()+40);
            break;
        }
        Greenfoot.delay(10);
    }
    
    public void executeOption(int option) {
        switch(option) {
            case 0:
                clearPauseScreen();
            break;
            case 1:
                Sounds.Stopfondo();
                Sounds.StopPiano();
                Greenfoot.setWorld (new Menu());
            break;
        }
        Greenfoot.delay(10);
    }
    
    public void clearPauseScreen() {
        getWorld().showText(" ",this.getX(),this.getY()-60);
        getWorld().showText(" ",this.getX(),this.getY());
        getWorld().showText(" ",this.getX(),this.getY()+40);
        getWorld().removeObjects(getWorld().getObjects(SelectLight.class));
        getWorld().removeObjects(getWorld().getObjects(Pause.class));
    }
}
