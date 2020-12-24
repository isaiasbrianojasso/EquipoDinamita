import greenfoot.*;

public class Basement extends Level
{
    public Basement()
    {
        setImage(new GreenfootImage(1,1));
    }
    
    public void setBasement() {
        
        setBigLobby(4,4);
        
        Door doorEA = new Door("Sala este",0,1);
        doorEA.setDestination('n',783,240);
        getWorld().addObject(doorEA,898,240);
    }
}
