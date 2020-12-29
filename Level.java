import greenfoot.*;
import java.util.*;

public abstract class Level extends Actor
{
    protected List<Forniture> keyForniture = new ArrayList<Forniture>();
    protected String roomName;
    private int i;
    private int j;
    
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
