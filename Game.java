import greenfoot.*;

public class Game extends World
{
    private Player player = new Player();
    private Basement basement = new Basement();
    private FirstLevel firstLevel = new FirstLevel();
    private SecondLevel secondLevel = new SecondLevel();
    private ThirdLevel thirdLevel = new ThirdLevel();

    public Game()
    {
        super(1024, 480, 1);
        setActOrder(Floor.class,Wall.class,Forniture.class,Character.class);
        prepare();
        act();
    }

    public void prepare() {

        GreenfootImage background = new GreenfootImage(getWidth(),getHeight());
        background.setColor(Color.BLACK);
        background.fill();
        setBackground(background);

        addObject(basement,0,0);
        addObject(firstLevel,0,0);
        addObject(secondLevel,0,0);
        addObject(thirdLevel,0,0);
        addObject(player,getWidth()/2,getHeight()/2);

        thirdLevel.setHall();
        
    }

    public void act() {
        
    }
    
    public void changeRoom(char destinationRoom,int destinationX,int destinationY) {
        
        eraseRoom();
        switch(destinationRoom) {
            case 'a':
                thirdLevel.setHall();
            break;
            case 'b':
                thirdLevel.setRoomOne();
            break;
            case 'c':
                thirdLevel.setRoomTwo();
            break;
            case 'd':
                thirdLevel.setRoomFour();
            break;
            case 'e':
                thirdLevel.setRoomSeven();
            break;
            case 'f':
                thirdLevel.setLibrary();
            break;
            case 'g':
                thirdLevel.setRoomTen();
            break;
            case 'h':
                thirdLevel.setRoomTwelve();
            break;
            case 'i':
                thirdLevel.setBathroomTwo();
            break;
            case 'j':
                thirdLevel.setBathroomSeven();
            break;
            case 'k':
                thirdLevel.setClosetSeven();
            break;
            case 'l':
                thirdLevel.setClosetTwelve();
            break;
            
            case 'm':
                firstLevel.setLobby();
            break;
            case 'n':
                firstLevel.setEastHall();
            break;
            case 'o':
                firstLevel.setWestHall();
            break;
            case 'p':
                firstLevel.setDinningRoom();
            break;
            case 'q':
                firstLevel.setKitchen();
            break;
            case 'r':
                secondLevel.setUniqueRoom();
            break;
            case 's':
                player.setDirection(CharacterDirection.LEFT);
                player.setOriginalPosition();
                basement.setBasement();
            break;
        }
        player.setLocation(destinationX,destinationY);
    }
    
    public void eraseRoom() {
        removeObjects(getObjects(Forniture.class));
        removeObjects(getObjects(Floor.class));
        removeObjects(getObjects(Wall.class));
    }
}
