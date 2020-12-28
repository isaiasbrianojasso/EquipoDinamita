import greenfoot.*;
import java.util.*;

public abstract class Level extends Actor
{
    public Dialogues dialogues = new Dialogues();
    public List<Forniture> keyForniture = new ArrayList<Forniture>();
    public String roomName;
    public int i;
    public int j;
    
    public String getRoomName() {
        return roomName;
    }
    
    public void setRoom(int colorWall,int floorType){
        
        for(i = 286; i< 750 ; i += 64) {
            getWorld().addObject(new Wall(colorWall,0),i,118);
            
            for(j = 155 ; j < 380 ; j += 32) {
                
                getWorld().addObject(new Floor(floorType),i,j);
            }
            
            getWorld().addObject(new Wall(colorWall,2),i,395);
        }
        
        for(i = 110; i< 400 ; i += 64) {
            getWorld().addObject(new Wall(colorWall,1),250,i);
            getWorld().addObject(new Wall(colorWall,1),769,i);
        }
    }
    
    public void setBigLobby(int colorWall,int floorType) {
        
        for(i = 160; i< 896 ; i += 64) {
            getWorld().addObject(new Wall(colorWall,0),i,53);
            
            for(j = 90 ; j < 460 ; j += 32){
                
                getWorld().addObject(new Floor(floorType),i,j);
            }
            
            getWorld().addObject(new Wall(colorWall,2),i,getWorld().getHeight()-23);
        }
        
        for(i = 45; i< 460 ; i += 64) {
            getWorld().addObject(new Wall(colorWall,1),125,i);
            getWorld().addObject(new Wall(colorWall,1),899,i);
        }
    }
}
