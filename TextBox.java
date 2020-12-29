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
        waitToConfirm();
        eraseText();
    }
    
    public void receiveObject(KeyObject object) {
        showText("   ",object.getName() + " recibido!");
        waitToConfirm();
        eraseText();
    }
    
    public void showText(String name, String text) {
        getWorld().showText(name,this.getX(),this.getY()-50);
        getWorld().showText(text,this.getX(),this.getY());
    }
    
    public void eraseText() {
        getWorld().showText("    ",this.getX(),this.getY()-50);
        getWorld().showText("    ",this.getX(),this.getY());
    }
    
    public void waitToConfirm() {
        Greenfoot.delay(10);
        while(!Greenfoot.isKeyDown(Keys.CONFIRMATION)) {
            Greenfoot.delay(1);
        }
    }
}
