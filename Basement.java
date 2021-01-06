import greenfoot.*;

public class Basement extends Level
{
    private boolean isBattleStarted = false;
    private boolean bossIsDefeated = false;
    private Spider boss = new Spider();
    private Door doorEA = new Door("Sala este",0,1);
    public Enemigo zombie1;
    public Enemigo zombie2;
    public Enemigo zombie3;
    public Basement()
    {
        setImage(new GreenfootImage(1,1));
    }

    public void act() {
        if(!isBattleStarted && ((Game)getWorld()).player.getX() < 700) {
            isBattleStarted = true;
            ((Game)getWorld()).hud.setBossLives();
            getWorld().addObject(boss,512,150);
        }

        if(boss.getActualLives() == 0 && !bossIsDefeated) {
            bossIsDefeated = true;
            doorEA.setLocked(false);
            doorEA.setDestination('n',783,240);
        }
    }

    public void setBasement() {

        roomName = "SOTANO";
        remueve();

        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(2,2);
        zombie3=new Enemigo(2,2);
        setRoom(159,53,4,4);
        doorEA.setLocked(true);
        getWorld().addObject(doorEA,898,240);
        getWorld().addObject(zombie2,400,200);//maceta2

        ((Game)getWorld()).hud.initializeBossLives(boss.getLives());
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta
    }

    public void remueve(){
        getWorld().removeObject(zombie1);
        getWorld().removeObject(zombie2);
        getWorld().removeObject(zombie3);
        // getWorld().removeObject(fantasma1);
        //getWorld().removeObject(fantasma2);

    }
}
