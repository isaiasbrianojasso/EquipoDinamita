import greenfoot.*;

public class ThirdLevel extends Level
{
    public ThirdLevel() {
        setImage(new GreenfootImage(1,1));
        
        Door door1A = new Door("PUERTA 01",0,0);
        door1A.setDestination('b',512,365);
        door1A.setLocked(true);
        door1A.setDescription(Dialogues.LINE_LOCKED_DOOR);
        keyForniture.add(door1A);
        
        Door door8A = new Door("PUERTA 08",0,0);
        door8A.setDestination('a',385,300);
        door8A.setLocked(true);
        door8A.setDescription(Dialogues.LINE_LOCKED_DOOR);
        keyForniture.add(door8A);
        
        Door door12A = new Door("PUERTA 12",0,2);
        door12A.setDestination('h',512,150);
        door12A.setLocked(true);
        door12A.setDescription(Dialogues.LINE_LOCKED_DOOR);
        keyForniture.add(door12A);
        
        Door elevatorFirstFloor = new Door("PRIMER PISO",1,0);
        elevatorFirstFloor.setDestination('n',384,212);
        elevatorFirstFloor.setLocked(true);
        elevatorFirstFloor.setDescription(Dialogues.LINE_FIRST_ELEVATOR_NO_WORKS);
        keyForniture.add(elevatorFirstFloor);
        
        keyForniture.add(new ObjetoInanimado(false,21));
        keyForniture.get(4).setObject(new Key("PUERTA 08"));
        keyForniture.get(4).setDescription(Dialogues.LINE_FIRST_KEY);
        
        keyForniture.add(new ObjetoInanimado(false,33));
        keyForniture.get(5).setObject(new Key("PUERTA 01"));
        keyForniture.get(5).setDescription(Dialogues.LINE_SECOND_KEY);
        
        keyForniture.add(new ObjetoInanimado(false,35));
        keyForniture.get(6).setObject(new ElevatorButton("PRIMER PISO"));
        keyForniture.get(6).setDescription(Dialogues.LINE_FIRST_ELEVATORBUTTON);
        
        keyForniture.add(new ObjetoInanimado(false,1));
        keyForniture.get(7).setObject(new Flashlight());
        keyForniture.get(7).setDescription(Dialogues.LINE_FLASHLIGHT);
        
        keyForniture.add(new ObjetoInanimado(false,20));
        keyForniture.get(8).setObject(new Bate());
        keyForniture.get(8).setDescription(Dialogues.LINE_BATE);
        
        keyForniture.add(new ObjetoInanimado(false,12));
        keyForniture.get(9).setObject(new BandAid());
        keyForniture.get(9).setDescription(Dialogues.LINE_1);
        
        keyForniture.add(new ObjetoInanimado(false,19));
        keyForniture.get(10).setObject(new BandAid());
        keyForniture.get(10).setDescription(Dialogues.LINE_2);
        
        keyForniture.add(new ObjetoInanimado(false,31));
        keyForniture.get(11).setObject(new PillBottle());
        keyForniture.get(11).setDescription(Dialogues.LINE_3);
        
        keyForniture.add(new ObjetoInanimado(false,36));
        keyForniture.get(12).setObject(new BandAid());
        keyForniture.get(12).setDescription(Dialogues.LINE_4);
        
        keyForniture.add(new ObjetoInanimado(false,40));
        keyForniture.get(13).setObject(new BandAid());
        keyForniture.get(13).setDescription(Dialogues.LINE_1);
        
        keyForniture.add(new ObjetoInanimado(false,37));
        keyForniture.get(14).setObject(new PillBottle());
        keyForniture.get(14).setDescription(Dialogues.LINE_5);
        
        keyForniture.add(new ObjetoInanimado(false,24));
        keyForniture.get(15).setObject(new BandAid());
        keyForniture.get(15).setDescription(Dialogues.LINE_3);
        
        keyForniture.add(new ObjetoInanimado(false,35));
        keyForniture.get(16).setObject(new BandAid());
        keyForniture.get(16).setDescription(Dialogues.LINE_4);
    }

    public void setLibrary() {
        Sounds.Stopfondo();
        Sounds.Piano();

        roomName = "BIBLIOTECA";

        setRoom(159,86,1,1);

        getWorld().addObject(keyForniture.get(1),352,103); //Puerta 8A

        Door door9A = new Door("PUERTA 09",0,0);
        door9A.setLocked(true);
        getWorld().addObject(door9A,673,103);
        
        getWorld().addObject(new ObjetoInanimado(false,23),512,260); //Piano
        getWorld().addObject(new ObjetoInanimado(false,11),512,90); //Pizarron
        getWorld().addObject(new ObjetoInanimado(false,44),512,115); //Planta
        
        //Escritorios
        getWorld().addObject(new ObjetoInanimado(false,20),140,150);
        getWorld().addObject(new ObjetoInanimado(false,21),140,260);
        getWorld().addObject(new ObjetoInanimado(false,22),140,370);
        getWorld().addObject(new ObjetoInanimado(false,22),885,150);
        getWorld().addObject(new ObjetoInanimado(false,20),885,260);
        getWorld().addObject(keyForniture.get(4),885,370);
        getWorld().addObject(new ObjetoInanimado(false,16),250,120);
        getWorld().addObject(new ObjetoInanimado(false,17),460,120);
        getWorld().addObject(new ObjetoInanimado(false,18),565,120);
        getWorld().addObject(keyForniture.get(10),775,120);
        
        // sillas
        getWorld().addObject(new ObjetoInanimado(true,29),165,145);
        getWorld().addObject(new ObjetoInanimado(true,29),165,255);
        getWorld().addObject(new ObjetoInanimado(true,29),165,365);
        getWorld().addObject(new ObjetoInanimado(true,28),860,145);
        getWorld().addObject(new ObjetoInanimado(true,28),860,255);
        getWorld().addObject(new ObjetoInanimado(true,28),860,365);
        getWorld().addObject(new ObjetoInanimado(true,27),250,140);
        getWorld().addObject(new ObjetoInanimado(true,27),460,140);
        getWorld().addObject(new ObjetoInanimado(true,27),565,140);
        getWorld().addObject(new ObjetoInanimado(true,27),775,140);
        
        //Libreros
        getWorld().addObject(keyForniture.get(9),280,270);
        getWorld().addObject(new ObjetoInanimado(false,12),745,270);
        getWorld().addObject(new ObjetoInanimado(false,14),670,270);
        getWorld().addObject(new ObjetoInanimado(false,15),355,270);
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
        
        //Plantas
        getWorld().addObject(new ObjetoInanimado(false,45),65,215);
        getWorld().addObject(new ObjetoInanimado(false,45),320,215);
        getWorld().addObject(new ObjetoInanimado(false,44),705,215);
        getWorld().addObject(new ObjetoInanimado(false,45),960,215);
    }

    public void setRoomOne() {
        
        roomName = "HABITACION 01";
        
        setRoom(287,118,1,1);
        
        Door door1B = new Door("PUERTA 01",0,2);
        door1B.setDestination('a',128,215);
        getWorld().addObject(door1B,512,388); //Puerta 1B
        
        Door door2C = new Door("PUERTA 02",0,1);
        door2C.setDestination('c',265,260);
        getWorld().addObject(door2C,768,260); //Puerta2C
        
        Door bathroomDoor = new Door("BAÑO",0,0);
        bathroomDoor.setLocked(true);
        getWorld().addObject(bathroomDoor,350,135); //Baño
        
        Door closetDoor = new Door("ARMARIO",0,0);
        closetDoor.setLocked(true);
        getWorld().addObject(closetDoor,670,135); //Armario
        
        //Camas
        getWorld().addObject(new ObjetoInanimado(false,25),600,170);
        getWorld().addObject(new ObjetoInanimado(false,25),424,170);
        //Estantes
        getWorld().addObject(new ObjetoInanimado(false,30),292,144);
        getWorld().addObject(keyForniture.get(11),740,144);
        getWorld().addObject(new ObjetoInanimado(false,36),273,260);
        getWorld().addObject(new ObjetoInanimado(true,36),758,260);
        //Lamparas
        getWorld().addObject(new ObjetoInanimado(false,38),570,150);
        getWorld().addObject(new ObjetoInanimado(false,38),450,150);
        getWorld().addObject(Zombie3A,512,160);
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
        
        //Estantes
        getWorld().addObject(new ObjetoInanimado(false,33),295,200);
        getWorld().addObject(new ObjetoInanimado(false,34),360,210);
        getWorld().addObject(new ObjetoInanimado(false,36),410,240);
        getWorld().addObject(new ObjetoInanimado(false,33),430,280);
        getWorld().addObject(new ObjetoInanimado(false,35),490,288);
        getWorld().addObject(new ObjetoInanimado(false,35),560,275);
        getWorld().addObject(new ObjetoInanimado(false,34),630,280);
        getWorld().addObject(keyForniture.get(12),690,240);
        getWorld().addObject(new ObjetoInanimado(false,47),680,280);
        getWorld().addObject(new ObjetoInanimado(false,33),500,140);
        getWorld().addObject(new ObjetoInanimado(false,35),580,150);
    }

    public void setBathroomTwo() {
        
        roomName = "BAÑO 02";
        
        setRoom(415,180,2,2);
        
        Door door2C = new Door("PUERTA 02",0,2);
        door2C.setDestination('c',350,148);
        getWorld().addObject(door2C,480,325); //Puerta 2C
        
        getWorld().addObject(new ObjetoInanimado(false,50),512,190);//Ventana
        getWorld().addObject(new ObjetoInanimado(false,0),600,180);//baño_espejo
        getWorld().addObject(keyForniture.get(7),420,200);//bañera
        getWorld().addObject(new ObjetoInanimado(false,2),605,210);//lavado
        getWorld().addObject(new ObjetoInanimado(false,3),625,300);//taza
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
        
        getWorld().addObject(new ObjetoInanimado(false,24),580,170); //Cama
        getWorld().addObject(new ObjetoInanimado(false,38),520,150); //Lampara
        getWorld().addObject(new ObjetoInanimado(false,20),758,300); //Escritorio
        getWorld().addObject(keyForniture.get(13),420,140); //Ropero
        
        //Estantes
        getWorld().addObject(new ObjetoInanimado(false,30),740,144);
        getWorld().addObject(new ObjetoInanimado(false,36),273,240);
        
        getWorld().addObject(new ObjetoInanimado(true,26),730,280); //Silla
        getWorld().addObject(new ObjetoInanimado(true,39),270,320); //Taburete
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
        
        getWorld().addObject(new ObjetoInanimado(false,24),400,170); //Cama
        getWorld().addObject(new ObjetoInanimado(false,38),450,150); //Lampara
        getWorld().addObject(new ObjetoInanimado(false,20),758,200); //Escritorio
        getWorld().addObject(new ObjetoInanimado(false,13),660,140); //Librero
        getWorld().addObject(new ObjetoInanimado(false,43),590,145); //Planta
        //Estantes
        getWorld().addObject(keyForniture.get(14),310,155);
        getWorld().addObject(new ObjetoInanimado(false,36),273,280);
        getWorld().addObject(new ObjetoInanimado(false,36),758,300);
        
        getWorld().addObject(new ObjetoInanimado(true,26),280,340); //Silla
        
        getWorld().addObject(Zombie1A,720,160);
        getWorld().addObject(Zombie1B,300,170);
    }

    public void setBathroomSeven() {
        
        roomName = "BAÑO 07";
        
        setRoom(415,180,2,2);
        
        Door door7C = new Door("PUERTA 07",0,0);
        door7C.setDestination('e',350,360);
        getWorld().addObject(door7C,480,195); //Habitación 7C
        
        getWorld().addObject(new ObjetoInanimado(false,0),600,180);//baño_espejo
        getWorld().addObject(new ObjetoInanimado(false,1),420,200);//bañera
        getWorld().addObject(new ObjetoInanimado(false,2),605,210);//lavado
        getWorld().addObject(new ObjetoInanimado(false,3),625,300);//taza
    }

    public void setClosetSeven() {
        
        roomName = "ARMARIO 07";
        
        setRoom(415,180,2,2);
        
        Door door7D = new Door("PUERTA 07",0,0);
        door7D.setDestination('e',670,360);
        getWorld().addObject(door7D,544,195); //Habitación 7D
        
        //Estantes
        getWorld().addObject(keyForniture.get(5),450,200);
        getWorld().addObject(new ObjetoInanimado(false,31),610,200);
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
        
        //Camas
        getWorld().addObject(keyForniture.get(15),600,170);
        getWorld().addObject(new ObjetoInanimado(false,24),424,170);
        //Estantes
        getWorld().addObject(keyForniture.get(6),292,144);
        getWorld().addObject(new ObjetoInanimado(false,33),740,144);
        getWorld().addObject(new ObjetoInanimado(false,36),758,300);
        //Lamparas
        getWorld().addObject(new ObjetoInanimado(false,38),370,150);
        getWorld().addObject(new ObjetoInanimado(false,38),640,150);
        
        getWorld().addObject(Zombie3A,700,340);
        getWorld().addObject(Zombie3B,300,340);
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
        
        //Estantes
        getWorld().addObject(new ObjetoInanimado(false,33),295,200);
        getWorld().addObject(new ObjetoInanimado(false,34),360,210);
        getWorld().addObject(new ObjetoInanimado(false,35),430,300);
        getWorld().addObject(keyForniture.get(16),560,275);
        getWorld().addObject(new ObjetoInanimado(false,34),630,280);
        getWorld().addObject(new ObjetoInanimado(false,36),690,240);
        getWorld().addObject(new ObjetoInanimado(false,46),640,170);
        getWorld().addObject(new ObjetoInanimado(false,46),300,300);
        getWorld().addObject(new ObjetoInanimado(false,46),740,325);
        
        getWorld().addObject(Phantom1A,720,260);
        getWorld().addObject(Phantom1B,290,260);
    }

    public void setClosetTwelve() {
        
        roomName = "ARMARIO 12";
        
        setRoom(415,180,3,3);
        
        Door door12C = new Door("PUERTA 12",0,0);
        door12C.setDestination('h',670,360);
        getWorld().addObject(door12C,544,195); //Habitación 12C
        
        getWorld().addObject(new ObjetoInanimado(false,37),450,220); //Estante
        getWorld().addObject(new ObjetoInanimado(false,14),600,200); //Librero
        getWorld().addObject(keyForniture.get(8),398,270); //Escritorio
        
        getWorld().addObject(new ObjetoInanimado(true,27),440,310); //Silla
        getWorld().addObject(new ObjetoInanimado(true,39),600,280); //Taburete
    }
}
