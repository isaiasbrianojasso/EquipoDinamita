import greenfoot.*;
import java.util.*;

public class Game extends World
{
    private Player player = new Player();
    private Dialogues dialogues = new Dialogues();
    private List<Forniture> keyForniture = new ArrayList<Forniture>();
    
    public Game()
    {
        super(1024, 480, 1);
        prepare();
    }
    
    public void prepare() {
        GreenfootImage background = new GreenfootImage(getWidth(),getHeight());
        background.setColor(Color.BLACK);
        background.fill();
        setBackground(background);
        
        setKeyFornitures();
        
        thirdFloor();
        addObject(player,100,100);
    }
    
    public void thirdFloor() {
        
        libraryRoom();
        
    }
    
    public void libraryRoom() {
        
        //Muros y piso
        int i,j;
        for(i = 64; i< 1000 ; i += 64) {
            addObject(new Wall(0),i,58);
            
            for(j = 113 ; j < 440 ; j += 32){
                //Piso
                addObject(new Floor(0),i,j);
            }
            
            addObject(new Wall(2),i,getHeight()-38);
        }
        
        for(i = 40; i< 430 ; i += 43) {
            addObject(new Wall(1),30,i);
            addObject(new Wall(1),getWidth()-30,i);
        }
        
        addObject(keyForniture.get(0),200,200);
        addObject(keyForniture.get(1), 500,200);
        addObject(keyForniture.get(2),getWidth()/3,74);
        
        addObject(new Door(125),getWidth()/2,74);
        addObject(new Stool(),335,200);
        addObject(new Stool(),360,175);
        addObject(new Stool(),385,200);
    }
    
    public void setKeyFornitures(){
        
        // Aquí van todos los muebles que tendrán dentro objetos clave
        // Tambien las puertas que estén bloqueadas
        
        keyForniture.add(0,new Bed());
        keyForniture.get(0).setObject(new BandAid());
        keyForniture.get(0).setDescription(dialogues.getLine1());
        
        keyForniture.add(1,new Bookcase());
        keyForniture.get(1).setObject(new Key(124));
        keyForniture.get(1).setDescription(dialogues.getLine2());
        
        Door door = new Door(124);
        door.setLocked(true);
        keyForniture.add(2,door);
    }
}
