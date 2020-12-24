import greenfoot.*;
import java.util.*;

public class Door extends Forniture
{
    private GreenfootSound sound = new GreenfootSound("./sounds/opening_door.wav");
    private boolean locked = false;
    private boolean closed = true;
    private String doorNumber;
    private int doorType;
    private int doorSubType;
    private char destinationRoom;
    private int destinationX;
    private int destinationY;
    
    public Door(String doorNumber,int doorType,int doorSubType)
    {
        DEFAULT_DESCRIPTION = "No abrirá";
        this.doorNumber = doorNumber;
        this.doorType = doorType;
        this.doorSubType = doorSubType;
        description = DEFAULT_DESCRIPTION;
        closedDoorType();
    }
    
    public void setDestination(char destinationRoom,int destinationX,int destinationY) {
        this.destinationRoom = destinationRoom;
        this.destinationX = destinationX;
        this.destinationY = destinationY;
    }
    
    public void openedDoorType(){
        switch(doorType) {
            case 0:
                if(doorSubType == 0)
                    setImage(new GreenfootImage("./images/forniture/interior_door3.jpg"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/forniture/elevator1.png"));
            break;
        }
    }
    
    public void closedDoorType(){
        switch(doorType) {
            case 0:
                normalDoor();
            break;
            case 1:
                setImage(new GreenfootImage("./images/forniture/elevator0.png"));
            break;
        }
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
                openedDoorType();
                textbox.displayDescription("  ","Abrió!");
            }
            catch (NoElementInTheInventoryException Ex) {
                textbox.displayDescription(doorNumber,description);
            }
            
            getWorld().removeObject(textbox);
        }
        else {
            if(closed) {
                sound.play();
                openedDoorType();
                closed = false;
            } else {
                sound.play();
                closedDoorType();
                closed = true;
                ((Game)getWorld()).changeRoom(destinationRoom,destinationX,destinationY);
            }
        }
        Greenfoot.delay(10);
    }
    
    public void searchTheKey(List<KeyObject> inventory) throws NoElementInTheInventoryException{
        
        boolean found = false;
        
        for (KeyObject keyObject : inventory) {
            if(keyObject.getClass() == Key.class && ((Key)keyObject).getNumber().equals(doorNumber)) {
                found = true;
            }
        }
        
        if(!found) {
            throw new NoElementInTheInventoryException();
        }
    }
    
    public void normalDoor(){
        switch(doorSubType) {
            case 0:
                setImage(new GreenfootImage("./images/forniture/interior_door0.jpg"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/forniture/interior_door1.jpg"));
            break;
            case 2:
                setImage(new GreenfootImage("./images/forniture/interior_door2.jpg"));
            break;
        }
    }
}
