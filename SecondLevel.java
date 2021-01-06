import greenfoot.*;

public class SecondLevel extends Level
{
    public Enemigo zombie1;
    public Enemigo zombie2;
    public Enemigo zombie3;
    //   public Enemigo fantasm
    public SecondLevel()
    {
        setImage(new GreenfootImage(1,1));
    }

    public void setUniqueRoom() {
        remueve();

        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(3,2);
        zombie3=new Enemigo(4,2);

        roomName = "HABITACION ???";

        setRoom(287,118,1,1);

        Door door = new Door("PUERTA",0,1);
        door.setDestination('o',237,240);
        getWorld().addObject(door,766,240);
        getWorld().addObject(zombie2,400,200);//maceta2

    }

    public void remueve(){
        getWorld().removeObject(zombie1);
        getWorld().removeObject(zombie2);
        getWorld().removeObject(zombie3);
        // getWorld().removeObject(fantasma1);
        //getWorld().removeObject(fantasma2);

    }
}
