import greenfoot.*;

public class Wall extends Actor
{
    public Wall(int wallType)
    {
        if(wallType == 0)
            setImage(new GreenfootImage("./images/extras/red_wall0.jpg"));
        else if(wallType == 1)
            setImage(new GreenfootImage("./images/extras/red_wall1.jpg"));
        else
            setImage(new GreenfootImage("./images/extras/red_wall2.jpg"));
    }
}
