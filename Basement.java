import greenfoot.*;

public class Basement extends Level
{
    private boolean isBattleStarted = false;
    private BossSpider boss = new BossSpider();
    private Door doorEA = new Door("Sala este",0,1);
    private GameOver gameOver = new GameOver();
    
    public Basement()
    {
        setImage(new GreenfootImage(1,1));
    }
    
    public void act() {
        if(!isBattleStarted && ((Game)getWorld()).player.getX() < 700) {
            ((Game)getWorld()).hud.setBossLives();
            boss.startBattle();
            isBattleStarted = true;
        }
        
        if(boss.isDefeated()) {
            getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2);
            gameOver.startGameOver();
        }
    }
    
    public void setBasement() {
        
        roomName = "SOTANO";
        
        setRoom(159,53,4,4);
        doorEA.setLocked(true);
        getWorld().addObject(doorEA,898,240);
        
        ((Game)getWorld()).hud.initializeBossLives(boss.getTotalLives());
        getWorld().addObject(boss,512,150);
    }
}