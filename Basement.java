import greenfoot.*;

public class Basement extends Level
{
    private boolean isBattleStarted = false;
    private boolean bossIsDefeated = false;
    private Spider boss = new Spider();
    private Door doorEA = new Door("Sala este",0,1);
    
    public Basement()
    {
        setImage(new GreenfootImage(1,1));
    }
    
    public void act() {
        if(!isBattleStarted && ((Game)getWorld()).player.getX() < 700) {
            isBattleStarted = true;
            ((Game)getWorld()).hud.setBossLives();
            getWorld().addObject(boss,512,150);
            boss.startBattle();
        }
        
        if(boss.getActualLives() == 0 || bossIsDefeated) {
            bossIsDefeated = true;
            doorEA.setLocked(false);
            doorEA.setDestination('n',783,240);
        }
    }
    
    public void setBasement() {
        
        roomName = "SOTANO";
        
        setRoom(159,53,4,4);
        doorEA.setLocked(true);
        getWorld().addObject(doorEA,898,240);
        
        if(!bossIsDefeated) {
            ((Game)getWorld()).hud.initializeBossLives(boss.getLives());
            getWorld().addObject(boss,512,150);
        }
    }
}
