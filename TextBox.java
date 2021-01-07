import greenfoot.*;

public class TextBox extends Actor
{
    private GreenfootImage TEXT_BOX = new GreenfootImage("./images/hud/text_box.png");
    private GreenfootImage ROOM_NAME_BOX = new GreenfootImage("./images/hud/room_name_box.png");
    
    public TextBox() {
        setImage(TEXT_BOX);
    }
    
    public void displayRoomName(String name) {
        setImage(ROOM_NAME_BOX);
        showText("",name);
    }
    
    public void displayDescription(String title, String description) {
        showText(title,description);
        waitToConfirm();
        eraseText();
    }
    
    public void receiveObject(KeyObject object) {
        showText("   ",object.getName() + " RECIBIDO!");
        waitToConfirm();
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
    
    public void waitToConfirm() {
        Greenfoot.delay(10);
        while(!Greenfoot.isKeyDown(Keys.CONFIRMATION)) {
            Greenfoot.delay(1);
        }
    }
}
