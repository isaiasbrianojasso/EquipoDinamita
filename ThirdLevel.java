import greenfoot.*;

public class ThirdLevel extends Level
{
    public Enemigo_1 zombie = new Enemigo_1(1);
    public Enemigo_1 zombie2 = new Enemigo_1(3);
    public Enemigo_1 zombie3 = new Enemigo_1(4);

    public ThirdLevel() {
        setImage(new GreenfootImage(1,1));

        Door door1A = new Door("PUERTA 01",0,0);
        door1A.setDestination('b',512,365);
        door1A.setDescription(Dialogues.LINE_LOCKED_DOOR);
        keyForniture.add(0,door1A);

        Door door8A = new Door("PUERTA 08",0,0);
        door8A.setDestination('a',385,300);
        door8A.setLocked(true);
        door8A.setDescription(Dialogues.LINE_LOCKED_DOOR);
        keyForniture.add(1,door8A);

        Door door12A = new Door("PUERTA 12",0,2);
        door12A.setDestination('h',512,150);
        door12A.setDescription(Dialogues.LINE_LOCKED_DOOR);
        keyForniture.add(2,door12A);

        Door elevatorFirstFloor = new Door("PRIMER PISO",1,0);
        elevatorFirstFloor.setDestination('n',384,212);
        elevatorFirstFloor.setDescription(Dialogues.LINE_ELEVATOR_NO_WORKS);
        keyForniture.add(3,elevatorFirstFloor);

        keyForniture.add(4,new Bookcase());
        keyForniture.get(4).setObject(new Key("PUERTA 08"));
        keyForniture.get(4).setDescription(Dialogues.LINE_FIRST_KEY);

    }

    public void setLibrary() {

        roomName = "BIBLIOTECA";

        setRoom(159,86,1,1);

        getWorld().addObject(keyForniture.get(4),500,200);
        getWorld().addObject(keyForniture.get(1),352,103); //Puerta 8A

        Door door9A = new Door("PUERTA 09",0,0);
        door9A.setLocked(true);
        getWorld().addObject(door9A,673,103);
        Sounds.Piano();        
    }

    public void setHall() {

        roomName = "PASILLO 3ER PISO";

        setRoom(63,183,0,0);

        getWorld().addObject(keyForniture.get(0),128,200); //Puerta 1A

        Door door2A = new Door("PUERTA 02",0,0);
        door2A.setLocked(true);
        door2A.setDescription(Dialogues.LINE_DOOR_2A);
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
        getWorld().addObject(door6A,128,324); //Puerta 6A

        Door door7A = new Door("PUERTA 07",0,2);
        door7A.setDestination('e',512,150);
        getWorld().addObject(door7A,256,324); //Puerta 7A

        Door door8B = new Door("PUERTA 08",0,2);
        door8B.setDestination('f',352,115);
        getWorld().addObject(door8B,384,324); //Puerta 8B

        Door door9B = new Door("PUERTA 09",0,2);
        door9B.setLocked(true);
        getWorld().addObject(door9B,512,324); //Puerta 9B

        Door door10A = new Door("PUERTA 10",0,2);
        door10A.setDestination('g',512,150);
        getWorld().addObject(door10A,640,324); //Puerta 10A

        Door door11A = new Door("PUERTA 11",0,2);
        door11A.setLocked(true);
        getWorld().addObject(door11A,768,324); //Puerta 11A

        getWorld().addObject(keyForniture.get(2),896,324); //Puerta 12A

        getWorld().addObject(keyForniture.get(3),768,200); //Elevador

        Door almacen = new Door("ALMACEN",0,0);
        almacen.setLocked(true);
        almacen.setDescription(Dialogues.LINE_WAREHOUSE);
        getWorld().addObject(almacen,896,200); //Puerta Almacen

        Door doorStairs = new Door("ESCALERAS",0,1);
        doorStairs.setLocked(true);
        doorStairs.setDescription(Dialogues.LINE_STAIRS_BLOCKED);
        getWorld().addObject(doorStairs,30,240); //Escaleras
        getWorld().addObject(new Maceta_1(),980,200);//179
        getWorld().addObject(new Maceta_2(),956,210);//179

        Sounds.StopPiano();

    }

    public void setRoomOne() {

        roomName = "HABITACION 01";

        setRoom(287,118,1,1);

        Door door1B = new Door("PUERTA 01",0,2);
        door1B.setDestination('a',128,215);
        getWorld().addObject(door1B,512,388); //Puerta 1B

        Door door2C = new Door("PUERTA 02",0,1);
        door2C.setDestination('c',265,260);
        getWorld().addObject(door2C,766,260); //Puerta2C

        Door bathroomDoor = new Door("BAÑO",0,0);
        bathroomDoor.setLocked(true);
        getWorld().addObject(bathroomDoor,350,135); //Baño

        Door closetDoor = new Door("ARMARIO",0,0);
        closetDoor.setLocked(true);
        getWorld().addObject(closetDoor,670,135); //Armario
        enemigos();

        getWorld().addObject(bathroomDoor,350,135); //Baño
        getWorld().addObject(new Chimenea_1(),475,120);//chimenea 
        getWorld().addObject(new Maceta_1(),750,135);//maceta_1
        getWorld().addObject(new Maceta_2(),750,380);//maceta_1

    }

    public void enemigos(){
        getWorld().addObject(zombie,500,200);
        getWorld().addObject(zombie2,600,200);
        getWorld().addObject(zombie3,400,200);

    }

    public void remueve(){
        getWorld().removeObject(zombie);
        getWorld().removeObject(zombie2);
        getWorld().removeObject(zombie3);

    }

    public void setRoomTwo() {

        roomName = "HABITACION 02";

        setRoom(287,118,1,1);

        Door door2B = new Door("PUERTA 02",0,2);
        door2B.setDestination('a',256,215);
        getWorld().addObject(door2B,512,388); //Puerta 2B

        Door bathroomDoor = new Door("BAÑO",0,0);
        bathroomDoor.setDestination('i',480,290);
        getWorld().addObject(bathroomDoor,350,135); //Baño

        Door closetDoor = new Door("ARMARIO",0,0);
        closetDoor.setLocked(true);
        getWorld().addObject(closetDoor,670,135); //Armario
        enemigos();
        getWorld().addObject(new Mesa_1(),460,280);//mesa1
        getWorld().addObject(new Mesa_2(),560,200);//mesa2
        getWorld().addObject(new Mesa_3(),562,250);//mesa3
        getWorld().addObject(new Mesa_2(),560,350);//mesa2
        getWorld().addObject(new sillon_1(),480,170);//sillon
        getWorld().addObject(new sillon_2(),400,170);//sillon

    }

    public void setBathroomTwo() {

        roomName = "BAÑO 02";

        setRoom(415,180,2,2);

        Door door2C = new Door("PUERTA 02",0,2);
        door2C.setDestination('c',350,148);
        getWorld().addObject(door2C,480,325); //Puerta 2C
        getWorld().addObject(new Ventana(),475,170);//179
        getWorld().addObject(new lavado(),600,200);//179
        getWorld().addObject(new baño_espejo(),600,170);//179
        getWorld().addObject(new taza(),620,300);//179
        getWorld().addObject(new bañera(),419,190);//179

    }

    public void setRoomFour() {

        roomName = "HABITACION 04";

        setRoom(287,118,1,1);

        Door door4B = new Door("PUERTA 04",0,2);
        door4B.setDestination('a',512,215);
        getWorld().addObject(door4B,512,388); //Puerta 4B

        Door bathroomDoor = new Door("BAÑO",0,0);
        bathroomDoor.setLocked(true);
        getWorld().addObject(bathroomDoor,350,135); //Baño

        Door closetDoor = new Door("ARMARIO",0,0);
        closetDoor.setLocked(true);
        getWorld().addObject(closetDoor,670,135); //Armario
    }

    public void setRoomSeven() {

        roomName = "HABITACION 07";

        setRoom(287,118,1,1);

        Door door7B = new Door("PUERTA 07",0,0);
        door7B.setDestination('a',256,300);
        getWorld().addObject(door7B,512,135); //Puerta 7B

        Door bathroomDoor = new Door("BAÑO",0,2);
        bathroomDoor.setDestination('j',480,200);
        getWorld().addObject(bathroomDoor,350,390); //Baño

        Door closetDoor = new Door("ARMARIO",0,2);
        closetDoor.setDestination('k',544,200);
        getWorld().addObject(closetDoor,670,390); //Armario
    }

    public void setBathroomSeven() {

        roomName = "BAÑO 07";

        setRoom(415,180,2,2);

        Door door7C = new Door("PUERTA 07",0,0);
        door7C.setDestination('e',350,360);
        getWorld().addObject(door7C,480,195); //Habitación 7C
    }

    public void setClosetSeven() {

        roomName = "ARMARIO 07";

        setRoom(415,180,2,2);

        Door door7D = new Door("PUERTA 07",0,0);
        door7D.setDestination('e',670,360);
        getWorld().addObject(door7D,544,195); //Habitación 7D
    }

    public void setRoomTen() {

        roomName = "HABITACION 10";

        setRoom(287,118,1,1);

        Door door10B = new Door("PUERTA 10",0,0);
        door10B.setDestination('a',649,300);
        getWorld().addObject(door10B,512,135); //Puerta 10B

        Door bathroomDoor = new Door("BAÑO",0,2);
        bathroomDoor.setLocked(true);
        getWorld().addObject(bathroomDoor,350,390); //Baño

        Door closetDoor = new Door("ARMARIO",0,2);
        closetDoor.setLocked(true);
        getWorld().addObject(closetDoor,670,390); //Armario
    }

    public void setRoomTwelve() {

        roomName = "HABITACION 12";

        setRoom(287,118,3,3);

        Door door12B = new Door("PUERTA 12",0,0);
        door12B.setDestination('a',896,300);
        getWorld().addObject(door12B,512,135); //Puerta 12B

        Door bathroomDoor = new Door("BAÑO",0,2);
        bathroomDoor.setLocked(true);
        getWorld().addObject(bathroomDoor,350,390); //Baño

        Door closetDoor = new Door("ARMARIO",0,2);
        closetDoor.setDestination('l',544,200);
        getWorld().addObject(closetDoor,670,390); //Armario
    }

    public void setClosetTwelve() {

        roomName = "ARMARIO 12";

        setRoom(415,180,3,3);

        Door door12C = new Door("PUERTA 12",0,0);
        door12C.setDestination('h',670,360);
        getWorld().addObject(door12C,544,195); //Habitación 12C
    }
}
