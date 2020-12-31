import greenfoot.*;

public class Controls extends World
{
    public Controls()
    {   
        super(1024, 480, 1);
        prepare();
    }
    
    public void prepare() {
        GreenfootImage background = new GreenfootImage("./images/ControlsBackground.png");
        background.scale(getWidth(),getHeight());
        setBackground(new GreenfootImage(background));
        
        showText("Proyecto Final", getWidth()/2, getHeight()-10);
        showText("Jose Isaias Briano Jasso",getWidth()/2, (getHeight())-30);
        showText("ISRAEL FELIX HERNANDEZ", getWidth()/2, (getHeight())-50);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown(Keys.PAUSE)) {
            Greenfoot.setWorld (new Menu());
        }
    }
}
