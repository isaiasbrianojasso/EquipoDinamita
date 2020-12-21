import greenfoot.*;
import java.util.*;

public class Forniture extends Actor
{
    protected String DEFAULT_DESCRIPTION;
    protected boolean movable = false;     
    public KeyObject object;
    public String description;
    public TextBox textbox = new TextBox();
        
    public void setObject(KeyObject object) {
        this.object = object;
    }

    public void setDescription(String description) {
        this.description = description;
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

        public void checkCollisions(CharacterDirection direction) throws NoMovableObjectException{
            
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
                collisionObject = (Forniture)getOneObjectAtOffset(-13,12,Forniture.class);
                wall = (Wall)getOneObjectAtOffset(-17,12,Wall.class);
            break;
            case RIGHT:
                collisionObject = (Forniture)getOneObjectAtOffset(13,12,Forniture.class);
                wall = (Wall)getOneObjectAtOffset(17,12,Wall.class);
            break;
            }
            
            if(collisionObject != null || wall != null) {
                throw new NoMovableObjectException();
            }
        }
              
    public void receiveObject() {
        
        getWorld().addObject(textbox,getWorld().getWidth()/2,400);
        textbox.displayDescription("  ",description);
        
        if(object != null) {
            textbox.receiveObject(object);
            description = DEFAULT_DESCRIPTION;
        }
        
        getWorld().removeObject(textbox);
        Greenfoot.delay(10);
    }
}
