import greenfoot.*;

public class ThirdLevel extends Level
{
    public ThirdLevel() {
        setImage(new GreenfootImage(1,1));
        
        Door door1A = new Door("PUERTA 01",0,0);
        door1A.setDestination('b',512,365);
        //door1A.setLocked(true);
        door1A.setDescription(dialogues.getLineLockedDoor());
        keyForniture.add(0,door1A);
        
        Door door8A = new Door("PUERTA 08",0,0);
        door8A.setDestination('a',385,300);
        //door8A.setLocked(true);
        door8A.setDescription(dialogues.getLineLockedDoor());
        keyForniture.add(1,door8A);
        
        Door door12A = new Door("PUERTA 12",0,2);
        door12A.setDestination('h',512,150);
        //door12A.setLocked(true);
        door12A.setDescription(dialogues.getLineLockedDoor());
        keyForniture.add(2,door12A);
        
        Door elevatorFirstFloor = new Door("PRIMER PISO",1,0);
        elevatorFirstFloor.setDestination('n',384,212);
        //elevatorFirstFloor.setLocked(true);
        elevatorFirstFloor.setDescription(dialogues.getLineElevatorNoWorks());
        keyForniture.add(3,elevatorFirstFloor);
        
        keyForniture.add(4,new Bookcase());
        keyForniture.get(4).setObject(new Key("PUERTA 08"));
        keyForniture.get(4).setDescription(dialogues.getLineFirstKey());
        
    }
    
    public void setLibrary() {
        
        for(i = 160; i< 896 ; i += 64) {
            getWorld().addObject(new Wall(1,0),i,86);
            
            for(j = 130 ; j < 440 ; j += 32){
                
                getWorld().addObject(new Floor(1),i,j);
            }
            
            getWorld().addObject(new Wall(1,2),i,getWorld().getHeight()-50);
        }
        
        for(i = 80; i< 464 ; i += 64) {
            getWorld().addObject(new Wall(1,1),125,i);
            getWorld().addObject(new Wall(1,1),getWorld().getWidth()-125,i);
        }
        
        getWorld().addObject(keyForniture.get(4),500,200);
        getWorld().addObject(keyForniture.get(1),352,103); //Puerta 8A

        Door door9A = new Door("PUERTA 09",0,0);
        door9A.setLocked(true);
        getWorld().addObject(door9A,673,103);
        
        getWorld().addObject(new Stool(),335,200);
        getWorld().addObject(new Stool(),360,175);
        getWorld().addObject(new Stool(),385,200);
    }
    
    public void setHall() {
        
        for(i = 64; i< 1000 ; i += 64) {
            getWorld().addObject(new Wall(0,0),i,183);
            
            for(j = 228 ; j < 330 ; j += 32) {
                
                getWorld().addObject(new Floor(0),i,j);
            }
            
            getWorld().addObject(new Wall(0,2),i,335);
        }
        
        for(i = 176; i< 330 ; i += 64) {
            getWorld().addObject(new Wall(0,1),30,i);
            getWorld().addObject(new Wall(0,1),getWorld().getWidth()-30,i);
        }
        
        getWorld().addObject(keyForniture.get(0),128,200); //Puerta 1A
        
        Door door2A = new Door("PUERTA 02",0,0);
        door2A.setLocked(true);
        door2A.setDescription(dialogues.getLineDoor2A());
        getWorld().addObject(door2A,256,200); //Puerta 2A
        
        Door door3A = new Door("PUERTA 03",0,0);
        door3A.setLocked(true);
        getWorld().addObject(door3A,384,200); //Puerta 3A
        
        Door door4A = new Door("PUERTA 04",0,0);
        door4A.setDestination('d',512,365);
        getWorld().addObject(door4A,512,200); //Puerta 4A
        
        Door door5A = new Door("PUERTA 05",0,0);
        door5A.setLocked(true);
        getWorld().addObject(door5A,640,200); //Puerta 5A
        
        Door door6A = new Door("PUERTA 06",0,2);
        door6A.setLocked(true);
        getWorld().addObject(door6A,128,328); //Puerta 6A
        
        Door door7A = new Door("PUERTA 07",0,2);
        door7A.setDestination('e',512,150);
        getWorld().addObject(door7A,256,328); //Puerta 7A
        
        Door door8B = new Door("PUERTA 08",0,2);
        door8B.setDestination('f',352,115);
        getWorld().addObject(door8B,384,328); //Puerta 8B
        
        Door door9B = new Door("PUERTA 09",0,2);
        door9B.setLocked(true);
        getWorld().addObject(door9B,512,328); //Puerta 9B
        
        Door door10A = new Door("PUERTA 10",0,2);
        door10A.setDestination('g',512,150);
        getWorld().addObject(door10A,640,328); //Puerta 10A
        
        Door door11A = new Door("PUERTA 11",0,2);
        door11A.setLocked(true);
        getWorld().addObject(door11A,768,328); //Puerta 11A
        
        getWorld().addObject(keyForniture.get(2),896,328); //Puerta 12A
        
        getWorld().addObject(keyForniture.get(3),768,200); //Elevador
        
        Door almacen = new Door("ALMACEN",0,0);
        almacen.setLocked(true);
        almacen.setDescription(dialogues.getLineWarehouse());
        getWorld().addObject(almacen,896,200); //Puerta Almacen
        
        Door doorStairs = new Door("ESCALERAS",0,1);
        doorStairs.setLocked(true);
        doorStairs.setDescription(dialogues.getLineStairsBlocked());
        getWorld().addObject(doorStairs,32,240); //Escaleras
    }
    
    public void setSmallRoom(int colorWall,int floorType){
        
        for(i = 415; i< 671 ; i += 64) {
            getWorld().addObject(new Wall(colorWall,0),i,170);
            
            for(j = 215 ; j < 343 ; j += 32) {
                //Piso
                getWorld().addObject(new Floor(floorType),i,j);
            }
            
            getWorld().addObject(new Wall(colorWall,2),i,323);
        }
        
        for(i = 164; i< 343 ; i += 64) {
            getWorld().addObject(new Wall(0,1),385,i);
            getWorld().addObject(new Wall(0,1),getWorld().getWidth()-385,i);
        }
    }
    
    public void setRoomOne() {
        setRoom(1,1);
        
        Door door1B = new Door("PUERTA 01",0,2);
        door1B.setDestination('a',128,215);
        getWorld().addObject(door1B,512,388); //Puerta 1B
        
        Door door2C = new Door("PUERTA 02",0,1);
        door2C.setDestination('c',265,260);
        getWorld().addObject(door2C,766,260); //Puerta2C
        
        Door bathroomDoor = new Door("DUCHA",0,0);
        bathroomDoor.setLocked(true);
        getWorld().addObject(bathroomDoor,350,135); //Baño
        
        Door closetDoor = new Door("ARMARIO",0,0);
        closetDoor.setLocked(true);
        getWorld().addObject(closetDoor,670,135); //Armario
    }
    
    public void setRoomTwo() {
        setRoom(1,1);
        
        Door door2B = new Door("PUERTA 02",0,2);
        door2B.setDestination('a',256,215);
        getWorld().addObject(door2B,512,388); //Puerta 2B
        
        Door bathroomDoor = new Door("DUCHA",0,0);
        bathroomDoor.setDestination('i',480,290);
        getWorld().addObject(bathroomDoor,350,135); //Baño
        
        Door closetDoor = new Door("ARMARIO",0,0);
        closetDoor.setLocked(true);
        getWorld().addObject(closetDoor,670,135); //Armario
    }
    
    public void setBathroomTwo() {
        setSmallRoom(2,2);
        
        Door door2C = new Door("PUERTA 02",0,2);
        door2C.setDestination('c',350,148);
        getWorld().addObject(door2C,480,318); //Puerta 2C
    }
    
    public void setRoomFour() {
        setRoom(1,1);
        
        Door door4B = new Door("PUERTA 04",0,2);
        door4B.setDestination('a',512,215);
        getWorld().addObject(door4B,512,388); //Puerta 4B
        
        Door bathroomDoor = new Door("DUCHA",0,0);
        bathroomDoor.setLocked(true);
        getWorld().addObject(bathroomDoor,350,135); //Baño
        
        Door closetDoor = new Door("ARMARIO",0,0);
        closetDoor.setLocked(true);
        getWorld().addObject(closetDoor,670,135); //Armario
    }
    
    public void setRoomSeven() {
        setRoom(1,1);
        
        Door door7B = new Door("PUERTA 07",0,0);
        door7B.setDestination('a',256,300);
        getWorld().addObject(door7B,512,135); //Puerta 7B
        
        Door bathroomDoor = new Door("DUCHA",0,2);
        bathroomDoor.setDestination('j',480,200);
        getWorld().addObject(bathroomDoor,350,390); //Baño
        
        Door closetDoor = new Door("ARMARIO",0,2);
        closetDoor.setDestination('k',544,200);
        getWorld().addObject(closetDoor,670,390); //Armario
    }
    
    public void setBathroomSeven() {
        setSmallRoom(2,2);
        
        Door door7C = new Door("PUERTA 07",0,0);
        door7C.setDestination('e',350,360);
        getWorld().addObject(door7C,480,185); //Habitación 7C
    }
    
    public void setClosetSeven() {
        setSmallRoom(2,2);
        
        Door door7D = new Door("PUERTA 07",0,0);
        door7D.setDestination('e',670,360);
        getWorld().addObject(door7D,544,185); //Habitación 7D
    }
    
    public void setRoomTen() {
        setRoom(1,1);
        
        Door door10B = new Door("PUERTA 10",0,0);
        door10B.setDestination('a',649,300);
        getWorld().addObject(door10B,512,135); //Puerta 10B
        
        Door bathroomDoor = new Door("DUCHA",0,2);
        bathroomDoor.setLocked(true);
        getWorld().addObject(bathroomDoor,350,390); //Baño
        
        Door closetDoor = new Door("ARMARIO",0,2);
        closetDoor.setLocked(true);
        getWorld().addObject(closetDoor,670,390); //Armario
    }
    
    public void setRoomTwelve() {
        setRoom(3,3);
        
        Door door12B = new Door("PUERTA 12",0,0);
        door12B.setDestination('a',896,300);
        getWorld().addObject(door12B,512,135); //Puerta 12B
        
        Door bathroomDoor = new Door("DUCHA",0,2);
        bathroomDoor.setLocked(true);
        getWorld().addObject(bathroomDoor,350,390); //Baño
        
        Door closetDoor = new Door("ARMARIO",0,2);
        closetDoor.setDestination('l',544,200);
        getWorld().addObject(closetDoor,670,390); //Armario
    }
    
    public void setClosetTwelve() {
        setSmallRoom(3,3);
        
        Door door12C = new Door("PUERTA 12",0,0);
        door12C.setDestination('h',670,360);
        getWorld().addObject(door12C,544,185); //Habitación 12C
    }
}
