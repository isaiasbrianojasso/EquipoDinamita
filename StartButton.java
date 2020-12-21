import greenfoot.*;

public class StartButton extends Button
{
    public StartButton() {
        buttonActive = true;
    }
    public void act()
    {
        getWorld().showText("NewGame",this.getX(),this.getY());
        validateImageChange();
        if(buttonActive == true && buttonPressed == true) {
            Greenfoot.setWorld (new Intro());
        }
    }
}
