import greenfoot.*;

public class BandAid extends KeyObject
{
    private static int LIFE_TO_RECOVER = 1;
    
    public BandAid() {
        name = "Bandita";
        DEFAULT_DESCRIPTION = "Ayuda a recuperar una ligera cantidad de vida";
        setImage(new GreenfootImage("./images/objects/band_aid.png"));
        description = DEFAULT_DESCRIPTION;
    }
    
    public int getLifeToRecover() {
        return LIFE_TO_RECOVER;
    }
}
