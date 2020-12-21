import greenfoot.*;

public class RecordsButton extends Button
{
    public void act() 
    {
        getWorld().showText("Records",this.getX(),this.getY());
        validateImageChange();
        if(buttonActive == true && buttonPressed == true) {
            Greenfoot.setWorld (new Records());
        }
    }    
}
