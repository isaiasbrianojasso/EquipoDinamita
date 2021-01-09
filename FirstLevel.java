import greenfoot.*;

public class FirstLevel extends Level
{
    public FirstLevel()
    {
        setImage(new GreenfootImage(1,1));
        
        Door doorStairs = new Door("ESCALERAS",0,1);
        doorStairs.setDestination('r',756,240);
        doorStairs.setLocked(true);
        doorStairs.setDescription(Dialogues.LINE_STAIRS_BLOCKED);
        keyForniture.add(doorStairs);
        
        Door elevatorThirdFloor = new Door("TERCER PISO",1,0);
        elevatorThirdFloor.setDestination('a',768,212);
        elevatorThirdFloor.setLocked(true);
        elevatorThirdFloor.setDescription(Dialogues.LINE_SECOND_ELEVATOR_NO_WORKS);
        keyForniture.add(elevatorThirdFloor);
        
        Door doorBasement = new Door("SOTANO",0,1);
        doorBasement.setDestination('s',885,240);
        doorBasement.setLocked(true);
        doorBasement.setDescription(Dialogues.LINE_NO_FLASHLIGHT_BATE);
        keyForniture.add(doorBasement);
        
        keyForniture.add(new ObjetoInanimado(false,33));
        keyForniture.get(3).setObject(new ElevatorButton("TERCER PISO"));
        keyForniture.get(3).setDescription(Dialogues.LINE_SECOND_ELEVATORBUTTON);
        
        keyForniture.add(new ObjetoInanimado(false,6));
        keyForniture.get(4).setObject(new Key("PUERTA 12"));
        keyForniture.get(4).setDescription(Dialogues.LINE_THIRD_KEY);
        
        keyForniture.add(new ObjetoInanimado(false,36));
        keyForniture.get(5).setObject(new PillBottle());
        keyForniture.get(5).setDescription(Dialogues.LINE_2);
        
        keyForniture.add(new ObjetoInanimado(false,5));
        keyForniture.get(6).setObject(new BandAid());
        keyForniture.get(6).setDescription(Dialogues.LINE_4);
        
        keyForniture.add(new ObjetoInanimado(false,33));
        keyForniture.get(7).setObject(new BandAid());
        keyForniture.get(7).setDescription(Dialogues.LINE_5);
    }

    public void setLobby() {
        
        roomName = "SALON PRINCIPAL";
        
        setRoom(159,53,3,1);
        
        Door doorEA = new Door("SALA ESTE",0,1);
        doorEA.setDestination('n',235,240);
        getWorld().addObject(doorEA,897,240);
        
        Door doorWA = new Door("SALA OESTE",0,1);
        doorWA.setDestination('o',780,240);
        getWorld().addObject(doorWA,125,240);
        
        getWorld().addObject(new ObjetoInanimado(false,23),512,130); //Piano
        //Estatuas
        getWorld().addObject(new ObjetoInanimado(false,47),572,130);
        getWorld().addObject(new ObjetoInanimado(false,47),440,130);
        getWorld().addObject(new ObjetoInanimado(false,46),632,300);
        getWorld().addObject(new ObjetoInanimado(false,46),380,230);
        getWorld().addObject(new ObjetoInanimado(false,46),800,200);
        getWorld().addObject(new ObjetoInanimado(false,46),200,320);
        getWorld().addObject(new ObjetoInanimado(false,46),260,120);
        getWorld().addObject(new ObjetoInanimado(false,46),450,400);
        getWorld().addObject(new ObjetoInanimado(false,46),820,380);
        //Luces
        getWorld().addObject(new ObjetoInanimado(false,48),191,55);
        getWorld().addObject(new ObjetoInanimado(false,48),319,55);
        getWorld().addObject(new ObjetoInanimado(false,48),447,55);
        getWorld().addObject(new ObjetoInanimado(false,48),575,55);
        getWorld().addObject(new ObjetoInanimado(false,48),703,55);
        getWorld().addObject(new ObjetoInanimado(false,48),831,55);
        
        getWorld().addObject(Phantom1A,200,100);
        getWorld().addObject(Zombie1A,780,400);
        getWorld().addObject(Zombie2A,640,100);
        getWorld().addObject(Zombie2B,512,350);
    }

    public void setEastHall() {
        
        roomName = "PASILLO ESTE 1ER PISO";
        
        setRoom(255,183,0,0);
        
        Door almacen = new Door("ALMACEN",0,0);
        almacen.setLocked(true);
        getWorld().addObject(almacen,576,200); //Puerta Almacen
        
        getWorld().addObject(keyForniture.get(1),384,200); //Elevador
        
        Door doorMisterious = new Door("???",0,2);
        doorMisterious.setLocked(true);
        getWorld().addObject(doorMisterious,512,324); //Puerta pendiente
        
        
        Door doorLobby = new Door("LOBBY",0,1);
        doorLobby.setDestination('m',880,240);
        getWorld().addObject(doorLobby,220,240); //Lobby
        
        checkWeaponInInventory();
        getWorld().addObject(keyForniture.get(2),800,240); //Sotano
        
        //Cuadros
        getWorld().addObject(new ObjetoInanimado(false,41),300,190);
        getWorld().addObject(new ObjetoInanimado(false,42),480,190);
        getWorld().addObject(new ObjetoInanimado(false,47),705,210);
    }

    public void setWestHall() {
        
        roomName = "PASILLO OESTE 1ER PISO";
        
        setRoom(255,183,0,0);
        
        Door doorKitchen1A = new Door("COCINA",0,0);
        doorKitchen1A.setDestination('q',384,365);
        getWorld().addObject(doorKitchen1A,384,200); //Cocina 1A
        
        
        Door doorKitchen2A = new Door("COCINA",0,0);
        doorKitchen2A.setLocked(true);
        doorKitchen2A.setDescription(Dialogues.LINE_DOOR_KITCHEN_2A);
        getWorld().addObject(doorKitchen2A,640,200); //Cocina 2A
        
        
        Door doorDinningRoom1A = new Door("COMEDOR",0,2);
        doorDinningRoom1A.setDestination('p',384,150);
        getWorld().addObject(doorDinningRoom1A,384,324); //Comedor 1A
        
        Door doorDinningRoom2A = new Door("COMEDOR",0,2);
        doorDinningRoom2A.setDestination('p',640,150);
        getWorld().addObject(doorDinningRoom2A,640,324); //Comedor 2A
        
        Door doorLobby = new Door("LOBBY",0,1);
        doorLobby.setDestination('m',145,240);
        getWorld().addObject(doorLobby,800,240); //Lobby
        
        getWorld().addObject(keyForniture.get(0),220,240); //Escaleras
        
        //Cuadros
        getWorld().addObject(new ObjetoInanimado(false,41),300,190);
        getWorld().addObject(new ObjetoInanimado(false,42),725,190);
        getWorld().addObject(new ObjetoInanimado(false,47),512,210);
        
    }

    public void setDinningRoom() {
        
        roomName = "COMEDOR";
        
        setRoom(255,119,3,3);
        
        Door doorDinningRoom1B = new Door("COMEDOR",0,0);
        doorDinningRoom1B.setDestination('o',384,300);
        getWorld().addObject(doorDinningRoom1B,384,136); //Comedor 1B
        
        Door doorDinningRoom2B = new Door("COMEDOR",0,0);
        doorDinningRoom2B.setDestination('o',640,300);
        getWorld().addObject(doorDinningRoom2B,640,136); //Comedor 2B
        
        //Mesas
        getWorld().addObject(new ObjetoInanimado(false,9),370,270);
        getWorld().addObject(new ObjetoInanimado(false,9),650,270);
        //Sillas
        getWorld().addObject(new ObjetoInanimado(true,26),370,220);
        getWorld().addObject(new ObjetoInanimado(true,26),650,220);
        getWorld().addObject(new ObjetoInanimado(true,27),370,320);
        getWorld().addObject(new ObjetoInanimado(true,27),650,320);
        getWorld().addObject(new ObjetoInanimado(true,28),320,270);
        getWorld().addObject(new ObjetoInanimado(true,28),600,270);
        getWorld().addObject(new ObjetoInanimado(true,29),420,270);
        getWorld().addObject(new ObjetoInanimado(true,29),700,270);
        //Estantes
        getWorld().addObject(new ObjetoInanimado(false,33),292,144);
        getWorld().addObject(keyForniture.get(3),740,144);
        getWorld().addObject(new ObjetoInanimado(false,36),240,300);
        getWorld().addObject(keyForniture.get(5),790,300);
        
        getWorld().addObject(Zombie2A,512,160);
        getWorld().addObject(Zombie3A,700,370);
        getWorld().addObject(Zombie3B,300,370);
    }
    
    public void setKitchen() {
        
        roomName = "COCINA";
        
        setRoom(255,119,2,2);
        
        Door doorKitchen1B = new Door("COCINA",0,2);
        doorKitchen1B.setDestination('o',384,230);
        getWorld().addObject(doorKitchen1B,384,388); //Cocina 1B
        
        Door doorKitchen2B = new Door("COCINA",0,2);
        doorKitchen2B.setDestination('o',640,230);
        getWorld().addObject(doorKitchen2B,640,388); //Cocina 2B
        
        //Cocineta
        getWorld().addObject(new ObjetoInanimado(false,5),240,175);
        getWorld().addObject(new ObjetoInanimado(false,5),240,225);
        getWorld().addObject(new ObjetoInanimado(false,5),240,275);
        getWorld().addObject(new ObjetoInanimado(false,6),285,160);
        getWorld().addObject(new ObjetoInanimado(false,7),280,150); //Fregadero
        getWorld().addObject(keyForniture.get(4),348,160);
        getWorld().addObject(new ObjetoInanimado(false,8),395,160); //Estufa
        getWorld().addObject(new ObjetoInanimado(false,6),443,160);
        getWorld().addObject(new ObjetoInanimado(false,6),505,160);
        getWorld().addObject(new ObjetoInanimado(false,4),552,145); //Refrigerador
        getWorld().addObject(new ObjetoInanimado(false,5),581,175);
        getWorld().addObject(keyForniture.get(6),581,225);
        getWorld().addObject(new ObjetoInanimado(false,5),581,275);
        //Estantes
        getWorld().addObject(keyForniture.get(7),750,144);
        getWorld().addObject(new ObjetoInanimado(false,33),660,144);
        
        getWorld().addObject(new ObjetoInanimado(false,9),700,270); //Mesa
        //Sillas
        getWorld().addObject(new ObjetoInanimado(true,26),700,220);
        getWorld().addObject(new ObjetoInanimado(true,27),700,320);
        getWorld().addObject(new ObjetoInanimado(true,28),650,270);
        getWorld().addObject(new ObjetoInanimado(true,29),750,270);
        
        getWorld().addObject(Zombie3A,512,180);
        getWorld().addObject(Zombie2A,730,180);
        getWorld().addObject(Zombie3B,270,280);
    }
    
    public void checkWeaponInInventory() {
        boolean BateIsIn = false;
        boolean FlashlightIsIn = false;
        
        for (KeyObject inventoryObject : ((Game)getWorld()).player.getInventory()) {
            
            if(inventoryObject instanceof Bate)
                BateIsIn = true;
            else if(inventoryObject instanceof Flashlight)
                FlashlightIsIn = true;
        }
        
        if(BateIsIn)
            ((Door)keyForniture.get(2)).setLocked(false);
        else if(FlashlightIsIn)
            ((Door)keyForniture.get(2)).setDescription(Dialogues.LINE_NO_BATE);
    }
}
