import greenfoot.*;
import java.util.*;

public class Door extends Forniture
{
    private GreenfootSound sound = new GreenfootSound("./sounds/opening_door.wav");
    private boolean locked = false;
    private boolean closed = true;
    private int doorNumber;
    
    public Door(int doorNumber)
    {
        DEFAULT_DESCRIPTION = ("Está cerrada con llave");
        setImage(new GreenfootImage("./images/forniture/interior_door_closed.jpg"));
        this.doorNumber = doorNumber;
        description = DEFAULT_DESCRIPTION;
    }
    
    public void setLocked(boolean locked) {
        this.locked = locked;
    }
    
    public void tryToOpen(List<KeyObject> inventory) {
        if(locked) {
            getWorld().addObject(textbox,getWorld().getWidth()/2,400);
            
            try {
                searchTheKey(inventory);
                sound.play();
                locked = false;
                closed = false;
                setImage(new GreenfootImage("./images/forniture/interior_door_opened.jpg"));
                textbox.displayDescription("  ","Abrió!");
            }
            catch (NoElementInTheInventoryException Ex) {
                textbox.displayDescription("Puerta " + Integer.toString(doorNumber),description);
            }
            
            getWorld().removeObject(textbox);
            Greenfoot.delay(10);
            
        }
        else {
            if(closed) {
                sound.play();
                setImage(new GreenfootImage("./images/forniture/interior_door_opened.jpg"));
                closed = false;
            }
        }
    }
    
    public void searchTheKey(List<KeyObject> inventory) throws NoElementInTheInventoryException{
        
        boolean found = false;
        
        for (KeyObject keyObject : inventory) {
            if(keyObject.getClass() == Key.class && ((Key)keyObject).getNumber() == doorNumber) {
                found = true;
            }
        }
        
        if(!found) {
            throw new NoElementInTheInventoryException();
        }
    }
}
