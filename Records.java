import greenfoot.*;

public class Records extends World
{
    private String lastKeyPressed;
    
    public Records()
    {   
        super(1024, 480, 1);
        prepare();
    }
    public void prepare() {
        GreenfootImage background = new GreenfootImage("./images/RecordsBackground.jpg");
        background.scale(getWidth(),getHeight());
        setBackground(new GreenfootImage(background));
    }
    
    public void act() 
    {
        lastKeyPressed = Greenfoot.getKey();
        
        if(lastKeyPressed != null)
        {
            validateKeyPressed();
        }
    }
    
    public void validateKeyPressed() {
        switch(lastKeyPressed) {
            case "escape":
                Greenfoot.setWorld (new Menu());
            break;
        }
    }
}
