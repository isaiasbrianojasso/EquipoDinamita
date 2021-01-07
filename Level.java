import greenfoot.*;
import java.util.*;

public abstract class Level extends Actor
{
    protected List<Forniture> keyForniture = new ArrayList<Forniture>();
    protected String roomName;
    private int i;
    private int j;
    
    protected Enemigo Phantom1A = new Enemigo(0);
    protected Enemigo Phantom1B = new Enemigo(0);
    protected Enemigo Zombie1A = new Enemigo(1);
    protected Enemigo Zombie1B = new Enemigo(1);
    protected Enemigo Zombie2A = new Enemigo(2);
    protected Enemigo Zombie2B = new Enemigo(2);
    protected Enemigo Zombie3A = new Enemigo(3);
    protected Enemigo Zombie3B = new Enemigo(3);
    
    public String getRoomName() {
        return roomName;
    }
    
    public void setRoom(int X,int Y,int colorWall,int floorType) {
        
        for(i = X+1; i <= getWorld().getWidth()-X ; i += 64) {
            getWorld().addObject(new Wall(colorWall,0),i,Y);
            
            for(j = Y+36 ; j < getWorld().getHeight()-Y+32 ; j += 32){
                
                getWorld().addObject(new Floor(floorType),i,j);
            }
            
            getWorld().addObject(new Wall(colorWall,2),i,getWorld().getHeight()-Y+32);
        }
        
        for(i = Y-8; i< getWorld().getHeight()-Y+32 ; i += 64) {
            getWorld().addObject(new Wall(colorWall,1),X-35,i);
            getWorld().addObject(new Wall(colorWall,1),getWorld().getWidth()-(X-35),i);
        }
    }
}
