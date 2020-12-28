import greenfoot.*;

public class FirstLevel extends Level
{
    public FirstLevel()
    {
        setImage(new GreenfootImage(1,1));
        
        Door doorKitchen2A = new Door("COCINA",0,0);
        doorKitchen2A.setLocked(true);
        doorKitchen2A.setDescription(dialogues.getLineDoorKitchen2A());
        keyForniture.add(0,doorKitchen2A);
        
        Door doorStairs = new Door("ESCALERAS",0,1);
        doorStairs.setDestination('r',756,240);
        doorStairs.setDescription(dialogues.getLineStairsBlocked());
        keyForniture.add(1,doorStairs);
        
        Door elevatorThirdFloor = new Door("TERCER PISO",1,0);
        elevatorThirdFloor.setDestination('a',768,212);
        //elevatorThirdFloor.setLocked(true);
        elevatorThirdFloor.setDescription(dialogues.getLineElevatorNoWorks());
        keyForniture.add(2,elevatorThirdFloor);
    }
    
    public void setLobby() {
        
        roomName = "SALA PRINCIPAL";
        
        setBigLobby(3,1);
        
        Door doorEA = new Door("SALA ESTE",0,1);
        doorEA.setDestination('n',235,240);
        getWorld().addObject(doorEA,897,240);
        
        Door doorWA = new Door("SALA OESTE",0,1);
        doorWA.setDestination('o',780,240);
        getWorld().addObject(doorWA,125,240);
    }
    
    public void setHall() {
        
        for(i = 256; i< 832 ; i += 64) {
            getWorld().addObject(new Wall(0,0),i,183);
            
            for(j = 228 ; j < 330 ; j += 32) {
                
                getWorld().addObject(new Floor(0),i,j);
            }
            
            getWorld().addObject(new Wall(0,2),i,335);
        }
        
        for(i = 176; i< 330 ; i += 64) {
            getWorld().addObject(new Wall(0,1),224,i);
            getWorld().addObject(new Wall(0,1),getWorld().getWidth()-224,i);
        }
    }
    
    public void setBigRoom(int colorWall,int floorType) {
        
        for(i = 256; i< 832 ; i += 64) {
            getWorld().addObject(new Wall(colorWall,0),i,119);
            
            for(j = 164 ; j < 394 ; j += 32) {
                
                getWorld().addObject(new Floor(floorType),i,j);
            }
            
            getWorld().addObject(new Wall(colorWall,2),i,399);
        }
        
        for(i = 112; i< 394 ; i += 64) {
            getWorld().addObject(new Wall(colorWall,1),224,i);
            getWorld().addObject(new Wall(colorWall,1),getWorld().getWidth()-224,i);
        }
    }
    
    public void setWestHall() {
        
        roomName = "PASILLO OESTE 1ER PISO";
        
        setHall();
        
        Door doorKitchen1A = new Door("COCINA",0,0);
        doorKitchen1A.setDestination('q',384,365);
        getWorld().addObject(doorKitchen1A,384,200); //Cocina 1A
        
        getWorld().addObject(keyForniture.get(0),640,200); //Cocina 2A
        
        
        Door doorDinningRoom1A = new Door("COMEDOR",0,2);
        doorDinningRoom1A.setDestination('p',384,150);
        getWorld().addObject(doorDinningRoom1A,384,330); //Comedor 1A
        
        Door doorDinningRoom2A = new Door("COMEDOR",0,2);
        doorDinningRoom2A.setDestination('p',640,150);
        getWorld().addObject(doorDinningRoom2A,640,330); //Comedor 2A
        
        Door doorLobby = new Door("LOBBY",0,1);
        doorLobby.setDestination('m',145,240);
        getWorld().addObject(doorLobby,796,240); //Lobby
        
        getWorld().addObject(keyForniture.get(1),224,240); //Escaleras
        
    }
    
    public void setEastHall() {
        
        roomName = "PASILLO ESTE 1ER PISO";
        
        setHall();
        
        Door almacen = new Door("ALMACEN",0,0);
        almacen.setLocked(true);
        getWorld().addObject(almacen,576,200); //Puerta Almacen
        
        getWorld().addObject(keyForniture.get(2),384,200); //Elevador
        
        Door doorMisterious = new Door("???",0,2);
        doorMisterious.setLocked(true);
        getWorld().addObject(doorMisterious,512,330); //Puerta pendiente
        
        
        Door doorLobby = new Door("LOBBY",0,1);
        doorLobby.setDestination('m',880,240);
        getWorld().addObject(doorLobby,224,240); //Lobby
        
        Door doorBasement = new Door("SOTANO",0,1);
        doorBasement.setDestination('s',885,240);
        getWorld().addObject(doorBasement,796,240); //Sotano
        
    }
    
    public void setDinningRoom() {
        
        roomName = "COMEDOR";
        
        setBigRoom(3,3);
        
        Door doorDinningRoom1B = new Door("COMEDOR",0,0);
        doorDinningRoom1B.setDestination('o',384,300);
        getWorld().addObject(doorDinningRoom1B,384,136); //Comedor 1B
        
        Door doorDinningRoom2B = new Door("COMEDOR",0,0);
        doorDinningRoom2B.setDestination('o',640,300);
        getWorld().addObject(doorDinningRoom2B,640,136); //Comedor 2B
    }
    
    public void setKitchen() {
        
        roomName = "COCINA";
        
        setBigRoom(2,2);
        
        Door doorKitchen1B = new Door("COCINA",0,2);
        doorKitchen1B.setDestination('o',384,230);
        getWorld().addObject(doorKitchen1B,384,395); //Cocina 1B
        
        Door doorKitchen2B = new Door("COCINA",0,2);
        doorKitchen2B.setDestination('o',640,230);
        getWorld().addObject(doorKitchen2B,640,395); //Cocina 2B
    }
}
