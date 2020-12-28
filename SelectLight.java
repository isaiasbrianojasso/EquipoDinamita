import greenfoot.*;

public class SelectLight extends Actor
{
    public SelectLight(int type) {
        switch(type) {
            case 0:
                setImage(new GreenfootImage("./images/hud/selected_item.png"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/hud/option.png"));
            break;
        }
    }
}
