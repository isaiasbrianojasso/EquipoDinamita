import greenfoot.*;

public class TextBox extends Actor
{
    private GreenfootImage background = new GreenfootImage("./images/extras/text_box.png");
    
    public TextBox() {
        setImage(background);
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
        getWorld().showText(name,this.getX(),this.getY()-50);
        getWorld().showText(text,this.getX(),this.getY());
    }
    
    public void eraseText() {
        getWorld().showText("    ",this.getX(),this.getY()-50);
        getWorld().showText("    ",this.getX(),this.getY());
    }
    
    public void waitToPressX() {
        Greenfoot.delay(10);
        while(!Greenfoot.isKeyDown("x")) {
            Greenfoot.delay(1);
        }
    }
}
