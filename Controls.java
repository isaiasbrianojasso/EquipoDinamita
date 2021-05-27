import greenfoot.*;

public class Controls extends World
{
    public Controls()
    {   
        super(1024, 480, 1);
        prepare();
    }
    
    public void prepare() {
        GreenfootImage background = new GreenfootImage("./images/ControlsBackground.jpg");
        background.scale(getWidth(),getHeight());
        setBackground(new GreenfootImage(background));
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown(Keys.PAUSE)) {
            Greenfoot.setWorld (new Menu());
        }
    }
}
