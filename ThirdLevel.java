import greenfoot.*;

public class ThirdLevel extends Level
{
    public Enemigo zombie1;
    public Enemigo zombie2;
    public Enemigo zombie3;
    //   public Enemigo fantasma1 = new Enemigo(2,2);
    //    public Enemigo fantasma2 = new Enemigo(2,2);
    //  public Enemigo fantasma3 = new Enemigo(2,2);

    public ThirdLevel() {
        setImage(new GreenfootImage(1,1));
        Sounds.fondo();        

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
        remueve();
        Sounds.Stopfondo();        

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
        remueve();
        roomName = "PASILLO 3ER PISO";
        Sounds.fondo();        

        Sounds.StopPiano();        

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
        getWorld().addObject(new ObjetoInanimado(false,3),980,200);//maceta1
        getWorld().addObject(new ObjetoInanimado(false,4),956,210);//maceta2

    }

    public void setRoomOne() {
        remueve();

        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(3,2);
        zombie3=new Enemigo(4,2);
        Sounds.zombie_fondo();        
        Sounds.zombie_grito();        

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
        getWorld().addObject(new ObjetoInanimado(false,3),750,135);//maceta1
        getWorld().addObject(new ObjetoInanimado(false,4),750,380);//maceta2
        getWorld().addObject(zombie1,500,200);//maceta2
        getWorld().addObject(zombie2,600,200);//maceta2
        getWorld().addObject(zombie3,400,200);//maceta2
        //Sounds.Zombiesound();        
        // Sounds.Zombiesound();        
        //  Sounds.Zombiesound();        

    }

    public void setRoomTwo() {
        remueve();
        zombie1=new Enemigo(2,2);
        zombie2=new Enemigo(2,2);
        zombie3=new Enemigo(2,2);

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
        getWorld().addObject(new ObjetoInanimado(false,5),460,280);//Mesa_1
        getWorld().addObject(new ObjetoInanimado(true,6),560,200);//Mesa_2
        getWorld().addObject(new ObjetoInanimado(true,7),562,250);//Mesa_3
        getWorld().addObject(new ObjetoInanimado(true,6),560,350);//Mesa_2
        getWorld().addObject(new ObjetoInanimado(false,15),480,170);//sillon_1
        getWorld().addObject(new ObjetoInanimado(false,16),400,170);//sillon_2

        getWorld().addObject(zombie1,500,200);//fantasma
        getWorld().addObject(zombie2,600,200);//fantasma
        getWorld().addObject(zombie3,400,200);//fantasma

    }

    public void setBathroomTwo() {
        remueve();

        roomName = "BAÑO 02";

        setRoom(415,180,2,2);

        Door door2C = new Door("PUERTA 02",0,2);
        door2C.setDestination('c',350,148);
        getWorld().addObject(door2C,480,325); //Puerta 2C
        getWorld().addObject(new ObjetoInanimado(false,10),475,170);//Ventana
        getWorld().addObject(new ObjetoInanimado(false,14),600,200);//lavado
        getWorld().addObject(new ObjetoInanimado(false,13),600,170);//baño_espejo
        getWorld().addObject(new ObjetoInanimado(false,19),620,300);//taza
        getWorld().addObject(new ObjetoInanimado(false,12),419,190);//bañera

    }

    public void setRoomFour() {
        remueve();

        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(3,2);
        zombie3=new Enemigo(4,2);
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
        getWorld().addObject(zombie3,400,200);//maceta2
    }

    public void setRoomSeven() {
        remueve();

        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(3,2);
        zombie3=new Enemigo(4,2);
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
        getWorld().addObject(zombie2,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta2
    }

    public void setBathroomSeven() {
        remueve();

        roomName = "BAÑO 07";

        setRoom(415,180,2,2);

        Door door7C = new Door("PUERTA 07",0,0);
        door7C.setDestination('e',350,360);
        getWorld().addObject(door7C,480,195); //Habitación 7C
    }

    public void setClosetSeven() {
        remueve();

        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(3,2);
        zombie3=new Enemigo(4,2);
        roomName = "ARMARIO 07";

        setRoom(415,180,2,2);

        Door door7D = new Door("PUERTA 07",0,0);
        door7D.setDestination('e',670,360);
        getWorld().addObject(door7D,544,195); //Habitación 7D
        getWorld().addObject(zombie1,400,200);//maceta2
    }

    public void setRoomTen() {
        remueve();

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
        remueve();

        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(3,2);
        zombie3=new Enemigo(4,2);
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
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie1,400,200);//maceta2
    }

    public void setClosetTwelve() {
        remueve();

        zombie1=new Enemigo(1,2);
        zombie2=new Enemigo(3,2);
        zombie3=new Enemigo(4,2);
        roomName = "ARMARIO 12";

        setRoom(415,180,3,3);

        Door door12C = new Door("PUERTA 12",0,0);
        door12C.setDestination('h',670,360);
        getWorld().addObject(door12C,544,195); //Habitación 12C
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie1,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta2
        getWorld().addObject(zombie2,400,200);//maceta2
    }

    public void remueve(){
        getWorld().removeObject(zombie1);
        getWorld().removeObject(zombie2);
        getWorld().removeObject(zombie3);
        // getWorld().removeObject(fantasma1);
        //getWorld().removeObject(fantasma2);

    }

}
