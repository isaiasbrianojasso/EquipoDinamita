import greenfoot.*;

public class Life extends Actor
{
    private GreenfootImage FULL_HEART = new GreenfootImage("./images/HUD/full_heart.png");
    private GreenfootImage HALF_HEART = new GreenfootImage("./images/HUD/half_heart.png");
    private GreenfootImage VOID_HEART = new GreenfootImage("./images/HUD/void_heart.png");
    
    public Life() {
        setImage(FULL_HEART);
    }
    
    public void setFullHeart() {
        setImage(FULL_HEART);
    }
    
    public void setHalfHeart() {
        setImage(HALF_HEART);
    }
    
    public void setVoidHeart() {
        setImage(VOID_HEART);
    }
}
