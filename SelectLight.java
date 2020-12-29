import greenfoot.*;

public class SelectLight extends Actor
{
    private GreenfootImage CIRCLE = new GreenfootImage("./images/hud/circle_light.png");
    private GreenfootImage LINE = new GreenfootImage("./images/hud/line_light.png");
    
    public SelectLight(int type) {
        switch(type) {
            case 0:
                setImage(CIRCLE);
            break;
            case 1:
                setImage(LINE);
            break;
        }
    }
}
