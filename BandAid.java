import greenfoot.*;

public class BandAid extends Cure
{
    public BandAid() {
        LIFE_TO_RECOVER = 1;
        name = "Bandita";
        DEFAULT_DESCRIPTION = "Ayuda a recuperar una ligera cantidad de salud";
        setImage(new GreenfootImage("./images/objects/band_aid.png"));
        description = DEFAULT_DESCRIPTION;
    }
}
