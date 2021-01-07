import greenfoot.*;

public class RecordsButton extends Button
{
    public void act() 
    {
        getWorld().showText("Records",this.getX(),this.getY());
        validateImageChange();
        if(buttonActive && buttonPressed) {
            Greenfoot.setWorld (new Records());
        }
    }    
}
