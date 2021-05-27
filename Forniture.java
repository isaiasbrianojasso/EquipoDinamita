import greenfoot.*;
import java.util.*;

public abstract class Forniture extends Actor
{
    protected String DEFAULT_DESCRIPTION;
    protected boolean movable = false;
    protected KeyObject object;
    protected String description;
    protected TextBox textbox = new TextBox();
    
    public Forniture() {
        description = DEFAULT_DESCRIPTION;
    }

    public void setObject(KeyObject object) {
        this.object = object;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public void isMovable() throws NoMovableObjectException{
        if (movable == false)
            throw new NoMovableObjectException();
    }
    
    public KeyObject getObject() {
        return object;
    }

    public void movement(CharacterDirection direction){

        switch(direction) {
            case UP:
                setLocation(getX(),getY()-5);
                break;
            case DOWN:
                setLocation(getX(),getY()+5);
            break;
            case LEFT:
                setLocation(getX()-5,getY());
            break;
            case RIGHT:
                setLocation(getX()+5,getY());
            break;
        }

    }

    public void checkCollisions(CharacterDirection direction) throws ObjectCollisionException{
        
        Forniture collisionObject = null;
        Wall wall = null;
            
        switch(direction) {
            case UP:
                collisionObject = (Forniture)getOneObjectAtOffset(0,-5,Forniture.class);
                wall = (Wall)getOneObjectAtOffset(0,-10,Wall.class);
            break;
            case DOWN:
                collisionObject = (Forniture)getOneObjectAtOffset(0,18,Forniture.class);
                wall = (Wall)getOneObjectAtOffset(0,15,Wall.class);
            break;
            case LEFT:
                collisionObject = (Forniture)getOneObjectAtOffset(-13,0,Forniture.class);
                wall = (Wall)getOneObjectAtOffset(-17,0,Wall.class);
            break;
            case RIGHT:
                collisionObject = (Forniture)getOneObjectAtOffset(13,0,Forniture.class);
                wall = (Wall)getOneObjectAtOffset(17,0,Wall.class);
            break;
        }
        
        if(collisionObject != null || wall != null) {
            throw new ObjectCollisionException();
        }
    }

    public void receiveObject(int size) {
        
        getWorld().addObject(textbox,getWorld().getWidth()/2,400);
        textbox.displayDescription("  ",description);
        
        if(object != null && size < 20) {
            textbox.receiveObject(object);
            description = DEFAULT_DESCRIPTION;
        } else if (object != null && size == 20) {
            fullInventory();
        }
        
        getWorld().removeObject(textbox);
        Greenfoot.delay(10);
    }
    
    public void fullInventory() {
        getWorld().removeObject(textbox);
        getWorld().addObject(textbox,getWorld().getWidth()/2,400);
        textbox.displayDescription("  ",Dialogues.LINE_FULL_INVENTORY);
    }
}
