import greenfoot.*;

public class Game extends World
{
    public Player player = new Player();
    public Enemigo_1 zombie = new Enemigo_1(2);

    public HUD hud = new HUD(player);
    private Basement basement = new Basement();
    private FirstLevel firstLevel = new FirstLevel();
    private SecondLevel secondLevel = new SecondLevel();
    private ThirdLevel thirdLevel = new ThirdLevel();
    private Inventory inventory = new Inventory();
    private Pause pause = new Pause();

    public Game()
    {
        super(1024, 480, 1);
        setActOrder(Floor.class,Wall.class,Forniture.class,Character.class,Inventory.class,Pause.class,SelectLight.class,KeyObject.class,TextBox.class,HUD.class);
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
        if(Greenfoot.isKeyDown(Keys.INVENTORY)) {
            showInventory();
        } else if(Greenfoot.isKeyDown(Keys.PAUSE)) {
            addObject(pause,getWidth()/2,getHeight()/2);
            pause.startPause();
        }
    }

    public void changeRoom(char destinationRoom,int destinationX,int destinationY) {

        eraseRoom();
        switch(destinationRoom) {
            case 'a':
            thirdLevel.remueve();
            thirdLevel.setHall();
            hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'b':
            thirdLevel.remueve();
            thirdLevel.setRoomOne();
            hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'c':
            thirdLevel.remueve();
            thirdLevel.setRoomTwo();
            hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'd':
            thirdLevel.remueve();
            thirdLevel.setRoomFour();
            hud.setRoomName(thirdLevel.getRoomName());

            break;
            case 'e':
            thirdLevel.remueve();
            thirdLevel.setRoomSeven();
            hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'f':
            thirdLevel.setLibrary();
            hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'g':
            thirdLevel.remueve();

            thirdLevel.setRoomTen();
            hud.setRoomName(thirdLevel.getRoomName());

            break;
            case 'h':
            thirdLevel.remueve();

            thirdLevel.setRoomTwelve();
            hud.setRoomName(thirdLevel.getRoomName());
            thirdLevel.remueve();

            break;
            case 'i':
            thirdLevel.remueve();

            thirdLevel.setBathroomTwo();
            hud.setRoomName(thirdLevel.getRoomName());

            break;
            case 'j':
            thirdLevel.remueve();

            thirdLevel.setBathroomSeven();
            hud.setRoomName(thirdLevel.getRoomName());

            break;
            case 'k':
            thirdLevel.remueve();

            thirdLevel.setClosetSeven();
            hud.setRoomName(thirdLevel.getRoomName());
            break;
            case 'l':
            thirdLevel.remueve();

            thirdLevel.setClosetTwelve();
            hud.setRoomName(thirdLevel.getRoomName());
            break;

            case 'm':
            thirdLevel.remueve();

            firstLevel.setLobby();
            hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'n':
            thirdLevel.remueve();

            firstLevel.setEastHall();
            hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'o':
            thirdLevel.remueve();

            firstLevel.setWestHall();
            hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'p':
            thirdLevel.remueve();

            firstLevel.setDinningRoom();
            hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'q':
            thirdLevel.remueve();

            firstLevel.setKitchen();
            hud.setRoomName(firstLevel.getRoomName());
            break;
            case 'r':
            thirdLevel.remueve();

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
