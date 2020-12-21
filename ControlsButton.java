import greenfoot.*;

public class ControlsButton extends Button
{
    public void act() 
    {
        getWorld().showText("Controls",this.getX(),this.getY());
        validateImageChange();
        if(buttonActive == true && buttonPressed == true) {
            Greenfoot.setWorld (new Controls());
        }
    }    
}
