import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Floor extends Actor
{
    public Floor(int floorType)
    {
        if(floorType == 0)
            setImage(new GreenfootImage("./images/extras/dark_wood_floor.jpg"));
    }   
}
