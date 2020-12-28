import greenfoot.*;

public class Game extends World
{
    public Player player = new Player();
    public Basement basement = new Basement();
    public FirstLevel firstLevel = new FirstLevel();
    public SecondLevel secondLevel = new SecondLevel();
    public ThirdLevel thirdLevel = new ThirdLevel();
    public HUD hud = new HUD(player);
    public Inventory inventory = new Inventory();

    public Game()
    {
        super(1024, 480, 1);
        setActOrder(Floor.class,Wall.class,Forniture.class,Character.class,Inventory.class,SelectLight.class,KeyObject.class,TextBox.class,HUD.class);
        prepare();
        act();
    }

    public void prepare() {

        GreenfootImage background = new GreenfootImage(getWidth(),getHeight());
        background.setColor(Color.BLACK);
        background.fill();
        setBackground(background);

        addObject(hud,0,0);
        addObject(basement,0,0);
        addObject(firstLevel,0,0);
        addObject(secondLevel,0,0);
        addObject(thirdLevel,0,0);
        addObject(player,getWidth()/2,getHeight()/2);

        thirdLevel.setHall();
        hud.setHud();
        
    }

    public void act() {
        if(Greenfoot.isKeyDown("z")) {
            showInventory();
        }
    }
    
    public void changeRoom(char destinationRoom,int destinationX,int destinationY) {
        
        eraseRoom();
        switch(destinationRoom) {
            case 'a':
                thirdLevel.setHall();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'b':
                thirdLevel.setRoomOne();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'c':
                thirdLevel.setRoomTwo();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'd':
                thirdLevel.setRoomFour();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'e':
                thirdLevel.setRoomSeven();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'f':
                thirdLevel.setLibrary();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'g':
                thirdLevel.setRoomTen();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'h':
                thirdLevel.setRoomTwelve();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'i':
                thirdLevel.setBathroomTwo();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'j':
                thirdLevel.setBathroomSeven();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'k':
                thirdLevel.setClosetSeven();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'l':
                thirdLevel.setClosetTwelve();
                hud.setRoomName(thirdLevel.getRoomName());
            break;
            
            case 'm':
                firstLevel.setLobby();
                hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'n':
                firstLevel.setEastHall();
                hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'o':
                firstLevel.setWestHall();
                hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'p':
                firstLevel.setDinningRoom();
                hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'q':
                firstLevel.setKitchen();
                hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'r':
                secondLevel.setUniqueRoom();
                hud.setRoomName(secondLevel.getRoomName());
            break;
            case 's':
                player.setDirection(CharacterDirection.LEFT);
                player.setOriginalPosition();
                basement.setBasement();
                hud.setRoomName(basement.getRoomName());
            break;
        }
        player.setLocation(destinationX,destinationY);
    }
    
    public void eraseRoom() {
        removeObjects(getObjects(Forniture.class));
        removeObjects(getObjects(Floor.class));
        removeObjects(getObjects(Wall.class));
    }
    
    public void showInventory() {
        
        if (player.getX() < (getWidth()/2)) {
            addObject(inventory,3*(getWidth()/4),getHeight()/2);
        }
        else {
            addObject(inventory,getWidth()/4,getHeight()/2);
        }
        
        inventory.showInventoryList();
        inventory.checkInteractions(player.getInventory());
        removeObject(inventory);
        Greenfoot.delay(10);
    }
}
