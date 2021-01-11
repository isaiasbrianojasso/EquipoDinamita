import greenfoot.*;
import java.awt.Robot;

public class GameOver extends Actor
{
    private SelectLight options = new SelectLight(1);
    private GreenfootImage OPTIONS_BOX = new GreenfootImage("./images/hud/options_box.png");
    
    public GameOver() {
        setImage(OPTIONS_BOX);
    }
    
    public void startGameOver() {
        
        getWorld().showText("GAME OVER",this.getX(),this.getY()-60);
        getWorld().showText("Presiona Esc para salir",this.getX(),this.getY());
        getWorld().addObject(options,this.getX(),this.getY());
        
        Greenfoot.delay(10);
        
        while(!Greenfoot.isKeyDown(Keys.PAUSE)) {
            Greenfoot.delay(1);
        }
        
        Sounds.Stopspider_background();
        
        if(((Game)getWorld()).player.getLives() != 0) {
            Record rec =new Record();
            rec.add(new Temporal(((Game)getWorld()).hud.stop()));
            rec.escribeRecords();
        }
        
        
        Greenfoot.setWorld (new Menu());
    }
}
