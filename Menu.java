import greenfoot.*;
import java.util.*;

public class Menu extends World
{
    private GreenfootSound sound = new GreenfootSound("./sounds/Ouija A.wav");
    private StartButton startButton = new StartButton ();
    private RecordsButton recordsButton = new RecordsButton ();
    private ControlsButton controlsButton = new ControlsButton();
    private String lastKeyPressed;
    private int activeOption = 0;
    
    public Menu()
    {
        // size of the world
        super(1024, 480, 1);
        prepare();
        act();
    }

    private void prepare()
    {
        GreenfootImage backgroundImage = new GreenfootImage("./images/MainMenuBackground.jpg");
        GreenfootImage titleImage = new GreenfootImage("./images/titleMain.png");
        titleImage.scale(getWidth()/3,getHeight()/3);
        backgroundImage.scale(getWidth(),getHeight());
        backgroundImage.drawImage(titleImage, getWidth ()/3,40);
        setBackground(backgroundImage);
        
        addObject (startButton, getWidth ()/2, getHeight ()/2);
        addObject (recordsButton, getWidth ()/2, (getHeight ()/2)+75);
        addObject (controlsButton, getWidth ()/2, (getHeight ()/2)+150);
    }

    public void act()
    {
        //sound.playLoop();
        
        lastKeyPressed = Greenfoot.getKey();
        
        if(lastKeyPressed != null)
        {
            validateKeyPressed();
        }
    }
    
    public void validateKeyPressed() {
        switch(lastKeyPressed) {
            case "up":
                if(activeOption == 0)
                    activeOption = 2;
                else
                    activeOption--;
            break;
            case "down":
                if(activeOption == 2)
                    activeOption = 0;
                else
                    activeOption++;
            break;
            case "enter":
                callOption();
            break;
        }
        changeActiveOption();
    }
    
    public void callOption() {
        switch(activeOption) {
            case 0:
                startButton.setButtonPressed(true);
            break;
            case 1:
                recordsButton.setButtonPressed(true);
            break;
            case 2:
                controlsButton.setButtonPressed(true);
            break;
        }
        sound.stop();
    }
    
    public void changeActiveOption() {
        switch(activeOption) {
            case 0:
                startButton.setActive(true);
                recordsButton.setActive(false);
                controlsButton.setActive(false);
            break;
            case 1:
                startButton.setActive(false);
                recordsButton.setActive(true);
                controlsButton.setActive(false);
            break;
            case 2:
                startButton.setActive(false);
                recordsButton.setActive(false);
                controlsButton.setActive(true);
            break;
        }
    }
}
