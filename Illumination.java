import greenfoot.*;

public class Illumination extends Actor
{
    private GreenfootImage characterLight = new GreenfootImage("./images/HUD/character_light.png");
    private GreenfootImage flashlightLight = new GreenfootImage("./images/HUD/flashlight_light.png");
    private GreenfootImage darkLight = new GreenfootImage("./images/HUD/dark_light.png");
    private boolean isFlashlightOn = false;
    private boolean isDarkRoom = false;
    
    public Illumination() {
        setCharacterLight();
    }
    
    public void act() {
        setLocation(((Game)getWorld()).player.getX(),((Game)getWorld()).player.getY());
    }
    
    public void setDarkRoom(boolean darkRoom) {
        isDarkRoom = darkRoom;
    }
    
    public void changeFlashlightStatus() {
        if(isFlashlightOn)
            isFlashlightOn = false;
        else
            isFlashlightOn = true;
    }
    
    public void setCharacterLight() {
        if(isFlashlightOn)
            setImage(flashlightLight);
        else if(isDarkRoom)
            setImage(darkLight);
        else
            setImage(characterLight);
    }
}