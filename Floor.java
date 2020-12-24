import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Floor extends Actor
{
    public Floor(int floorType)
    {
        switch(floorType) {
            case 0:
                setImage(new GreenfootImage("./images/extras/dark_wood_floor.jpg"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/extras/light_wood_floor.jpg"));
            break;
            case 2:
                setImage(new GreenfootImage("./images/extras/squares_floor.jpg"));
            break;
            case 3:
                setImage(new GreenfootImage("./images/extras/diamonds_floor.jpg"));
            break;
             case 4:
                setImage(new GreenfootImage("./images/extras/rock_floor.jpg"));
            break;
        }
    }   
}
