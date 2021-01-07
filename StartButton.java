import greenfoot.*;

public class StartButton extends Button
{
    public StartButton() {
        buttonActive = true;
    }
    
    public void act()
    {
        getWorld().showText("Nuevo juego",this.getX(),this.getY());
        validateImageChange();
        
        if(buttonActive && buttonPressed) {
            Greenfoot.setWorld (new Game());
        }
    }
}
