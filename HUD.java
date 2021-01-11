import greenfoot.*;
import java.util.*;

public class HUD extends Actor
{
    private int timer = 0;
    private static int hora;
    private static int minuto;
    private static int segundos;
    private final int LIVES_X = 50;
    private final int LIVES_Y = 50;
    private final int TOTAL_LIVES;
    private int actualHudLife;
    private int actualHudBossLife;
    private TextBox textbox = new TextBox();
    private List<Life> playerLives = new ArrayList<Life>();
    private List<Life> bossLives = new ArrayList<Life>();
    
    public HUD(Player player) {
        setImage(new GreenfootImage(1,1));
        TOTAL_LIVES = player.getInitialLives();
        initializeLives();
        hora = 0;
        minuto = 0;
        segundos = 0;
    }
    
    public void act() {
        timer++;
        if(timer>=60){
            segundos++;
            if(segundos>=60)
            {
                minuto++;
                segundos=0;
            }
            if(minuto>=60){
                hora++;
                minuto=0;
            }
            timer=0;
        }
        getWorld().showText(""+hora+":"+minuto+":"+segundos,900, 100);
    }
    
    public void initializeLives() {
        
        actualHudLife = TOTAL_LIVES;
        
        for(int i = 0 ; i < (actualHudLife/2) ; i++ )
            playerLives.add(new Life(0));
        
        if(TOTAL_LIVES%2 != 0) {
            playerLives.add(new Life(0));
            (playerLives.get(actualHudLife/2)).setHalfHeart();
        }
    }
    
    public void initializeBossLives(int bossInitialLives) {
        
        actualHudBossLife = bossInitialLives;
        
        for(int i = 0 ; i < (actualHudBossLife/2) ; i++ )
            bossLives.add(new Life(1));
        
        if(TOTAL_LIVES%2 != 0) {
            bossLives.add(new Life(1));
            (bossLives.get(actualHudBossLife/2)).setHalfHeart();
        }
    }
    
    public void setLives() {
        int j = LIVES_X;
        int lives_spacing = 37;
        
        for (Life life : playerLives) {
            getWorld().addObject(life,j,LIVES_Y);
            j+=lives_spacing;
        }
    }
    
    public void setBossLives() {
        int j = (getWorld().getWidth()/2)-(actualHudBossLife*7);
        int lives_spacing = 37;
        
        for (Life life : bossLives) {
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
    
    public void updateLives(int lives) {
        
        if(actualHudLife < lives) {
            
            while(actualHudLife != lives) {
                (playerLives.get(actualHudLife/2)).setFullHeart();
                actualHudLife++;
            }
        }
        else {
            while(actualHudLife != lives) {
                actualHudLife--;
                (playerLives.get((actualHudLife/2))).setVoidHeart();
            }
        }
        
        if(actualHudLife%2 != 0)
            (playerLives.get(actualHudLife/2)).setHalfHeart();
    }
    
    public void updateBossLives(int lives) {
        
        if(lives%2 != 0) {
            (bossLives.get(lives/2)).setHalfHeart();
        }
        else {
            (bossLives.get(actualHudBossLife/2)).setVoidHeart();
        }
        actualHudBossLife--;
    }
    
    public void clearBossLives() {
        
        for (Life life : bossLives) {
            getWorld().removeObject(life);
        }
    }
    
    public String stop() {
        return hora+":"+minuto+":"+segundos;
    }
}
