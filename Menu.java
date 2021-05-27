import greenfoot.*;
import java.util.*;

public class Menu extends World
{
    private SelectLight options = new SelectLight(1);
    private int option;
    
    public Menu()
    {
        // size of the world
        super(1024, 480, 1);
        prepare();
    }

    private void prepare()
    {
        GreenfootImage backgroundImage = new GreenfootImage("./images/MainMenuBackground.jpg");
        GreenfootImage titleImage = new GreenfootImage("./images/titleMain.png");
        GreenfootImage menuImage = new GreenfootImage("./images/buttons_main.png");
        titleImage.scale(getWidth()/3,getHeight()/3);
        backgroundImage.scale(getWidth(),getHeight());
        backgroundImage.drawImage(menuImage, (getWidth()/2)-125,getHeight()/2);
        backgroundImage.drawImage(titleImage, getWidth()/3,40);
        setBackground(backgroundImage);
        
        addObject(options,getWidth()/2,(getHeight()/2)+50);
        
        showText("NUEVA PARTIDA", getWidth()/2,(getHeight()/2)+50);
        showText("RECORDS", getWidth()/2,(getHeight()/2)+100);
        showText("INFORMACION", getWidth()/2,(getHeight()/2)+150);
        
        option = 0;
        Sounds.fondo();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown(Keys.DOWN)) {
            option++;
            if(option == 3) {option = 0;}
            changeOption();
        } else if(Greenfoot.isKeyDown(Keys.UP)) {
            option--;
            if(option == -1) {option = 2;}
            changeOption();
        } else if(Greenfoot.isKeyDown(Keys.CONFIRMATION)) {
            executeOption();
        }
    }
    
    public void changeOption() {
        switch(option) {
            case 0:
                options.setLocation(getWidth()/2,(getHeight()/2)+50);
            break;
            case 1:
                options.setLocation(getWidth()/2,(getHeight()/2)+100);
            break;
            case 2:
                options.setLocation(getWidth()/2,(getHeight()/2)+150);
            break;
        }
        Greenfoot.delay(10);
    }
    
    public void executeOption() {
        switch(option) {
            case 0:
                Sounds.Stopfondo();
                Greenfoot.setWorld (new Game());
            break;
            case 1:
                Greenfoot.setWorld (new Records());
            break;
            case 2:
                Greenfoot.setWorld (new Controls());
            break;
        }
        Greenfoot.delay(10);
    }
}
