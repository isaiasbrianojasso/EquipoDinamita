import greenfoot.*;

public class SecondLevel extends Level
{
    public SecondLevel()
    {
        setImage(new GreenfootImage(1,1));
    }
    
    public void setUniqueRoom() {
        
        roomName = "HABITACION ???";
        
        setRoom(287,118,1,1);
        
        Door door = new Door("PUERTA",0,1);
        door.setDestination('o',237,240);
        getWorld().addObject(door,766,240);
    }
    
}
