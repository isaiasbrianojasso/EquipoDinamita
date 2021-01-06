import greenfoot.*;

public class Basement extends Level
{
    private boolean isBattleStarted = false;
    private BossSpider boss = new BossSpider();
    private Door doorEA = new Door("Sala este",0,1);
    
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
            doorEA.setLocked(false);
            doorEA.setDestination('n',783,240);
        }
    }
    
    public void setBasement() {
        
        roomName = "SOTANO";
        
        setRoom(159,53,4,4);
        doorEA.setLocked(true);
        getWorld().addObject(doorEA,898,240);
        
        if(!boss.isDefeated()) {
            ((Game)getWorld()).hud.initializeBossLives(boss.getTotalLives());
            getWorld().addObject(boss,512,150);
        } else {
            doorEA.setLocked(false);
            doorEA.setDestination('n',783,240);
        }
    }
}