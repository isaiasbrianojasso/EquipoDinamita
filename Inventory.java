import greenfoot.*;
import java.util.*;

public class Inventory extends Actor
{
    private GreenfootImage inventoryBox = new GreenfootImage("./images/hud/inventory_box.png");
    private GreenfootImage optionsBox = new GreenfootImage("./images/hud/options_box.png");
    private TextBox textbox = new TextBox();
    private SelectLight itemSelected = new SelectLight(0);
    private SelectLight options = new SelectLight(1);
    private List<KeyObject> temporalInventory;
    
    public Inventory() {
        setImage(inventoryBox);
    }
    
    public void showInventoryList() {
        
        temporalInventory = ((Game)getWorld()).player.getInventory();
        
        if(!temporalInventory.isEmpty()) {
            
            getWorld().addObject(itemSelected,this.getX()-140,this.getY()-70);
            
            getWorld().showText("- INVENTARIO -",this.getX(),this.getY()-125);
            
            int X = this.getX()-140;
            int Y = this.getY()-70;
            int limit = 0;
            
            for (int i = 0 ; i < temporalInventory.size() ; i++ , X+=70 , limit++) {
                getWorld().addObject(temporalInventory.get(i),X,Y);
                
                if(limit == 4) {
                    limit = 0;
                    X = this.getX()-210;
                    Y+=70;
                }
            }
        } else {
            getWorld().showText("INVENTARIO VACIO",this.getX(),this.getY());
        }
    }
    
    public void checkInteractions(List<KeyObject> temporalInventory) {
        
        Greenfoot.delay(10);
        int index = 0;
        
        while(!Greenfoot.isKeyDown(Keys.INVENTORY)) {
            
            if(Greenfoot.isKeyDown(Keys.RIGHT) && index < temporalInventory.size()-1) {
                if(index == 0 || index%4 != 0) {
                    index++;
                    moveSelection(0);
                }
            } else if(Greenfoot.isKeyDown(Keys.LEFT) && index%5 != 0) {
                index--;
                moveSelection(1);
            } else if(Greenfoot.isKeyDown(Keys.UP) && index > 4) {
                index-=5;
                moveSelection(2);
            } else if(Greenfoot.isKeyDown(Keys.DOWN) && index+5 < temporalInventory.size()) {
                index+=5;
                moveSelection(3);
            } else if(Greenfoot.isKeyDown(Keys.CONFIRMATION)) {
                itemSelected(index);
                showInventoryList();
                index = 0;
                Greenfoot.delay(10);
            }
        }
        clearInventoryScreen();
    }
    
    public void itemSelected(int index) {
        
        Greenfoot.delay(10);
        
        clearInventoryScreen();
        setImage(optionsBox);
        setOptions();
        getWorld().showText(temporalInventory.get(index).getName(),this.getX(),this.getY()-60);
        getWorld().addObject(temporalInventory.get(index),this.getX()-110,this.getY()+15);
        
        int option = 0;
        
        while(!Greenfoot.isKeyDown(Keys.INVENTORY)) {
            
            if(Greenfoot.isKeyDown(Keys.DOWN)) {
                option++;
                if(option == 3) {option = 0;}
                changeOption(option);
            } else if(Greenfoot.isKeyDown(Keys.UP)) {
                option--;
                if(option == -1) {option = 2;}
                changeOption(option);
            } else if(Greenfoot.isKeyDown(Keys.CONFIRMATION)) {
                executeOption(option,index);
                clearOptionsScreen();
                setImage(inventoryBox);
                return;
            }
            
            Greenfoot.delay(1);
        }
        
        clearOptionsScreen();
        setImage(inventoryBox);
    }
    
    public void setOptions() {
        getWorld().addObject(options,this.getX()+50,this.getY()-15);
        
        getWorld().showText("USAR",this.getX()+50,this.getY()-15);
        getWorld().showText("TIRAR",this.getX()+50,this.getY()+15);
        getWorld().showText("DETALLES",this.getX()+50,this.getY()+45);
    }
    
    public void changeOption(int option) {
        switch(option) {
            case 0:
                options.setLocation(this.getX()+50,this.getY()-15);
            break;
            case 1:
                options.setLocation(this.getX()+50,this.getY()+15);
            break;
            case 2:
                options.setLocation(this.getX()+50,this.getY()+45);
            break;
        }
        Greenfoot.delay(10);
    }
    
    public void executeOption(int option,int index) {
        switch(option) {
            case 0:
                useItem(index);
            break;
            case 1:
                throwItem(index);
            break;
            case 2:
                infoItem(index);
            break;
        }
        Greenfoot.delay(10);
    }
    
    public void useItem(int index) {
        if(temporalInventory.get(index).getClass() == Cure.class) {
            cure(index);
        }
        else {
            getWorld().addObject(textbox,getWorld().getWidth()/2,400);
            textbox.displayDescription("  ",Dialogues.LINE_USING_SPECIAL_ITEM);
            getWorld().removeObject(textbox);
        }
    }
    
    public void cure(int index) {
        if(((Game)getWorld()).player.getLives() != ((Game)getWorld()).player.getInitialLives()) {
            ((Game)getWorld()).player.addLife(((Cure)temporalInventory.get(index)).getLifeToRecover());
            ((Game)getWorld()).hud.updateLives(((Game)getWorld()).player.getLives());
            ((Game)getWorld()).player.removeItem(index);
        }
        else {
            getWorld().addObject(textbox,getWorld().getWidth()/2,400);
            textbox.displayDescription("  ",Dialogues.LINE_MAX_HEALT);
            getWorld().removeObject(textbox);
        }
    }
    
    public void throwItem(int index) {
        if(temporalInventory.get(index).getClass() != BandAid.class) {
            getWorld().addObject(textbox,getWorld().getWidth()/2,400);
            textbox.displayDescription("  ",Dialogues.LINE_THROWING_SPECIAL_ITEM);
            getWorld().removeObject(textbox);
        }
        else {
            ((Game)getWorld()).player.removeItem(index);
        }
    }
    
    public void infoItem(int index) {
        getWorld().addObject(textbox,getWorld().getWidth()/2,400);
        textbox.displayDescription("  ",temporalInventory.get(index).getDescription());
        getWorld().removeObject(textbox);
    }
    
    public void moveSelection(int direction) {
        switch(direction) {
            case 0:
                itemSelected.setLocation(itemSelected.getX()+70,itemSelected.getY());
            break;
            case 1:
                itemSelected.setLocation(itemSelected.getX()-70,itemSelected.getY());
            break;
            case 2:
                itemSelected.setLocation(itemSelected.getX(),itemSelected.getY()-70);
            break;
            case 3:
                itemSelected.setLocation(itemSelected.getX(),itemSelected.getY()+70);
            break;
        }
        Greenfoot.delay(10);
    }
    
    public void clearInventoryScreen() {
        getWorld().showText(" ",this.getX(),this.getY()-125);
        getWorld().showText(" ",this.getX(),this.getY());
        getWorld().removeObjects(getWorld().getObjects(SelectLight.class));
        getWorld().removeObjects(getWorld().getObjects(KeyObject.class));
    }
    
    public void clearOptionsScreen() {
        getWorld().showText(" ",this.getX(),this.getY()-60);
        getWorld().showText(" ",this.getX()+50,this.getY()-15);
        getWorld().showText(" ",this.getX()+50,this.getY()+15);
        getWorld().showText(" ",this.getX()+50,this.getY()+45);
        getWorld().removeObjects(getWorld().getObjects(SelectLight.class));
        getWorld().removeObjects(getWorld().getObjects(KeyObject.class));
    }
}
