import greenfoot.*;

public class Floor extends Actor
{
    private GreenfootImage DARK_WOOD = new GreenfootImage("./images/extras/dark_wood_floor.jpg");
    private GreenfootImage LIGHT_WOOD = new GreenfootImage("./images/extras/light_wood_floor.jpg");
    private GreenfootImage SQUARES = new GreenfootImage("./images/extras/squares_floor.jpg");
    private GreenfootImage DIAMONDS = new GreenfootImage("./images/extras/diamonds_floor.jpg");
    private GreenfootImage ROCKS = new GreenfootImage("./images/extras/rock_floor.jpg");
    
    public Floor(int floorType)
    {
        switch(floorType) {
            case 0:
                setImage(DARK_WOOD);
            break;
            case 1:
                setImage(LIGHT_WOOD);
            break;
            case 2:
                setImage(SQUARES);
            break;
            case 3:
                setImage(DIAMONDS);
            break;
             case 4:
                setImage(ROCKS);
            break;
        }
    }
}
