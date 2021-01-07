import greenfoot.*;

public class TextBox extends Actor
{
    public TextBox() {
        setImage(new GreenfootImage("./images/hud/text_box.png"));
    }
    
    public void displayRoomName(String name) {
        setImage(new GreenfootImage("./images/hud/room_name_box.png"));
        showText("",name);
    }
    
    public void displayDescription(String title, String description) {
        showText(title,description);
        waitToPressX();
        eraseText();
    }
    
    public void receiveObject(KeyObject object) {
        showText("   ",object.getName() + " recibido!");
        waitToPressX();
        eraseText();
    }
    
    public void showText(String name, String text) {
        getWorld().showText(name,this.getX(),this.getY()-40);
        getWorld().showText(text,this.getX(),this.getY());
    }
    
    public void eraseText() {
        getWorld().showText("    ",this.getX(),this.getY()-40);
        getWorld().showText("    ",this.getX(),this.getY());
    }
    
    public void waitToPressX() {
        Greenfoot.delay(10);
        while(!Greenfoot.isKeyDown("x")) {
            Greenfoot.delay(1);
        }
    }
}
