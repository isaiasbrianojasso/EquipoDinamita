import greenfoot.*;

public class ControlsButton extends Button
{
    public void act()
    {
        getWorld().showText("Controles",this.getX(),this.getY());
        validateImageChange();
        if(buttonActive && buttonPressed) {
            Greenfoot.setWorld (new Controls());
        }
    }    
}
