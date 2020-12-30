import greenfoot.*;

public class Life extends Actor
{
    private GreenfootImage FULL_HEART;
    private GreenfootImage HALF_HEART;
    private GreenfootImage VOID_HEART = new GreenfootImage("./images/HUD/void_heart.png");
    
    public Life(int type) {
        if(type == 0) {
            FULL_HEART = new GreenfootImage("./images/HUD/full_heart.png");
            HALF_HEART = new GreenfootImage("./images/HUD/half_heart.png");
        } else {
            FULL_HEART = new GreenfootImage("./images/HUD/full_heart_boss.png");
            HALF_HEART = new GreenfootImage("./images/HUD/half_heart_boss.png");
        }
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
