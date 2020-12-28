import greenfoot.*;
import java.util.*;

public class HUD extends Actor
{
    private final int LIVES_X = 50;
    private final int LIVES_Y = 50;
    private final int TOTAL_LIVES;
    private int actualHudLife;
    private TextBox textbox = new TextBox();
    private List<Life> lives = new ArrayList<Life>();
    
    public HUD(Player player) {
        setImage(new GreenfootImage(1,1));
        TOTAL_LIVES = player.getInitialLives();
        initializeLives();
    }
    
    public void initializeLives() {
        
        actualHudLife = TOTAL_LIVES;
        
        for(int i = 0 ; i < (actualHudLife/2) ; i++ )
            lives.add(new Life());
        
        if(TOTAL_LIVES%2 != 0) {
            lives.add(new Life());
            (lives.get(actualHudLife/2)).setHalfHeart();
        }
    }
    
    public void setLives() {
        int j = LIVES_X;
        int lives_spacing = 37;
        
        for (Life life : lives) {
            getWorld().addObject(life,j,LIVES_Y);
            j+=lives_spacing;
        }
    }
    
    public void setRoomName(String roomName) {
        textbox.displayRoomName(roomName);
    }
    
    public void setHud() {
        setLives();
        getWorld().addObject(textbox,860,50);
        setRoomName("???");
    }
    
    public void updateLives(int playerLives) {
        
        if(playerLives%2 != 0) {
            
            (lives.get(playerLives/2)).setHalfHeart();
            
            if(playerLives < actualHudLife)
                actualHudLife--;
            else
                actualHudLife++;
        }
        else {
            if(playerLives < actualHudLife) {
                (lives.get(actualHudLife/2)).setVoidHeart();
                actualHudLife--;
            }
            else {
                (lives.get(actualHudLife/2)).setFullHeart();
                actualHudLife++;
            }
        }
    }
}
