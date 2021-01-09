import greenfoot.*;

public class PillBottle extends Cure
{
    public PillBottle()
    {
        LIFE_TO_RECOVER = 2;
        name = "Bote de pastillas";
        DEFAULT_DESCRIPTION = "Ayuda a recuperar salud";
        setImage(new GreenfootImage("./images/objects/pills.png"));
        description = DEFAULT_DESCRIPTION;
    }    
}
