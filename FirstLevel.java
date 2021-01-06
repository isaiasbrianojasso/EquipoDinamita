import greenfoot.*;

public class FirstLevel extends Level
{    public Enemigo zombie1;
    public Enemigo zombie2;
    public Enemigo zombie3;
    public FirstLevel()
    {
        setImage(new GreenfootImage(1,1));

        Door doorStairs = new Door("ESCALERAS",0,1);
        doorStairs.setDestination('r',756,240);
        doorStairs.setDescription(Dialogues.LINE_STAIRS_BLOCKED);
        keyForniture.add(doorStairs);

        Door elevatorThirdFloor = new Door("TERCER PISO",1,0);
        elevatorThirdFloor.setDestination('a',768,212);
        elevatorThirdFloor.setDescription(Dialogues.LINE_ELEVATOR_NO_WORKS);
        keyForniture.add(elevatorThirdFloor);
    }

    public void setLobby() {
        remueve(); 
        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(2,2);
        zombie3=new Enemigo(2,2);

        roomName = "SALON PRINCIPAL";

        setRoom(159,53,3,1);

        Door doorEA = new Door("SALA ESTE",0,1);
        doorEA.setDestination('n',235,240);
        getWorld().addObject(doorEA,897,240);

        Door doorWA = new Door("SALA OESTE",0,1);
        doorWA.setDestination('o',780,240);
        getWorld().addObject(doorWA,125,240);
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta
    }

    public void setEastHall() {
        remueve();

        zombie1=new Enemigo(2,2);
        zombie2=new Enemigo(2,2);
        zombie3=new Enemigo(1,2);
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

        Door doorBasement = new Door("SOTANO",0,1);
        doorBasement.setDestination('s',885,240);
        getWorld().addObject(doorBasement,800,240); //Sotano
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta
    }

    public void setWestHall() {
        remueve();

        zombie1=new Enemigo(2,2);
        zombie2=new Enemigo(2,2);
        zombie3=new Enemigo(2,2);
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
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta

    }

    public void setDinningRoom() {
        remueve();

        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(3,2);
        zombie3=new Enemigo(4,2);

        roomName = "COMEDOR";

        setRoom(255,119,3,3);

        Door doorDinningRoom1B = new Door("COMEDOR",0,0);
        doorDinningRoom1B.setDestination('o',384,300);
        getWorld().addObject(doorDinningRoom1B,384,136); //Comedor 1B

        Door doorDinningRoom2B = new Door("COMEDOR",0,0);
        doorDinningRoom2B.setDestination('o',640,300);
        getWorld().addObject(doorDinningRoom2B,640,136); //Comedor 2B
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta
    }

    public void setKitchen() {
        remueve();

        zombie1=new Enemigo(1,2);
        roomName = "COCINA";

        setRoom(255,119,2,2);

        Door doorKitchen1B = new Door("COCINA",0,2);
        doorKitchen1B.setDestination('o',384,230);
        getWorld().addObject(doorKitchen1B,384,388); //Cocina 1B

        Door doorKitchen2B = new Door("COCINA",0,2);
        doorKitchen2B.setDestination('o',640,230);
        getWorld().addObject(doorKitchen2B,640,388); //Cocina 2B
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta
    }

    public void remueve(){
        getWorld().removeObject(zombie1);
        getWorld().removeObject(zombie2);
        getWorld().removeObject(zombie3);
        // getWorld().removeObject(fantasma1);
        //getWorld().removeObject(fantasma2);

    }
}
