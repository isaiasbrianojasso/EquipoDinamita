import greenfoot.*;

public abstract class Button extends Actor
{
    private GreenfootImage button[] = new GreenfootImage[2];
    protected boolean buttonPressed;
    protected boolean buttonActive;
    
    public Button() {
        button[0] = new GreenfootImage("./images/Button00.png");
        button[1] = new GreenfootImage("./images/Button05.png");
        
        setImage(button[0]);
        buttonActive = false;
        buttonPressed = false;
    }
    
    public void setActive(boolean buttonActive) {
        this.buttonActive = buttonActive;
    }
    
    public void setButtonPressed (boolean buttonPressed) {
        this.buttonPressed = buttonPressed;
    }
    
    public void validateImageChange() {
        if (buttonActive == true) {
            setImage(button[1]);
        } else {
            setImage(button[0]);
        }
    }
}
    
