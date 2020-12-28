import greenfoot.*;

public class Life extends Actor
{
    public Life() {
        setImage(new GreenfootImage("./images/HUD/full_heart.png"));
    }
    
    public void setFullHeart() {
        setImage(new GreenfootImage("./images/HUD/full_heart.png"));
    }
    
    public void setHalfHeart() {
        setImage(new GreenfootImage("./images/HUD/half_heart.png"));
    }
    
    public void setVoidHeart() {
        setImage(new GreenfootImage("./images/HUD/void_heart.png"));
    }
}
