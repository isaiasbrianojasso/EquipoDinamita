import greenfoot.*;

public class ObjetoInanimado extends Forniture
{
    public  ObjetoInanimado(boolean  movable,int opcion) {
        
        this.movable=movable;
        
        switch(opcion){
            case 0:
                setImage(new GreenfootImage("./images/forniture/bathroom_mirror.png"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/forniture/bathroom_shower.png"));
                DEFAULT_DESCRIPTION = "Una bañera vacía";
            break;
            case 2:
                setImage(new GreenfootImage("./images/forniture/bathroom_sink.png"));
                DEFAULT_DESCRIPTION = "No se ha usado en mucho tiempo";
            break;
            case 3:
                setImage(new GreenfootImage("./images/forniture/bathroom_toilet.png"));
                DEFAULT_DESCRIPTION = "Parece un poco sucio";
            break;
            case 4:
                setImage(new GreenfootImage("./images/forniture/kitchen_fridge.png"));
                DEFAULT_DESCRIPTION = "No hay nada dentro";
            break;
            case 5:
                setImage(new GreenfootImage("./images/forniture/kitchen_kitchenette_1.png"));
                DEFAULT_DESCRIPTION = "Está vacío";
            break;
            case 6:
                setImage(new GreenfootImage("./images/forniture/kitchen_kitchenette_2.png"));
                DEFAULT_DESCRIPTION = "No hay nada";
            break;
            case 7:
                setImage(new GreenfootImage("./images/forniture/kitchen_sink.png"));
                DEFAULT_DESCRIPTION = "No creo que sirva";
            break;
            case 8:
                setImage(new GreenfootImage("./images/forniture/kitchen_stove.png"));
                DEFAULT_DESCRIPTION = "Se siente tibio";
            break;
            case 9:
                setImage(new GreenfootImage("./images/forniture/dinning_table.png"));
                DEFAULT_DESCRIPTION = "Esta mesa ha sufrido rasguños";
            break;
            case 11:
                setImage(new GreenfootImage("./images/forniture/library_blackboard.png"));
            break;
            case 12:
                setImage(new GreenfootImage("./images/forniture/library_bookcase_1.png"));
                DEFAULT_DESCRIPTION = "No parece haber nada interesante";
            break;
            case 13:
                setImage(new GreenfootImage("./images/forniture/library_bookcase_2.png"));
                DEFAULT_DESCRIPTION = "Parece haber mucho polvo";
            break;
            case 14:
                setImage(new GreenfootImage("./images/forniture/library_bookcase_3.png"));
                DEFAULT_DESCRIPTION = "Solo libros aburridos";
            break;
            case 15:
                setImage(new GreenfootImage("./images/forniture/library_bookcase_4.png"));
                DEFAULT_DESCRIPTION = "Hay unas pequeñas huellas";
            break;
            case 16:
                setImage(new GreenfootImage("./images/forniture/library_desk_1.png"));
                DEFAULT_DESCRIPTION = "Una pila de libros y otras cosas";
            break;
            case 17:
                setImage(new GreenfootImage("./images/forniture/library_desk_2.png"));
                DEFAULT_DESCRIPTION = "No parece que haya algo útil aquí";
            break;  
            case 18:
                setImage(new GreenfootImage("./images/forniture/library_desk_3.png"));
                DEFAULT_DESCRIPTION = "Las letras de este papel son indescifrables";
            break;
            case 19:
                setImage(new GreenfootImage("./images/forniture/library_desk_4.png"));
                DEFAULT_DESCRIPTION = "Nada interesante";
            break; 
            case 20:
                setImage(new GreenfootImage("./images/forniture/library_desk_5.png"));
                DEFAULT_DESCRIPTION = "Esta carta parace se muy antigua";
            break;
            case 21:
                setImage(new GreenfootImage("./images/forniture/library_desk_6.png"));
                DEFAULT_DESCRIPTION = "Más libros y papeles";
            break;
            case 22:
                setImage(new GreenfootImage("./images/forniture/library_desk_7.png"));
                DEFAULT_DESCRIPTION = "Nadie a tocado esto en mucho tiempo";
            break;
            case 23:
                setImage(new GreenfootImage("./images/forniture/library_piano.png"));
                DEFAULT_DESCRIPTION = "Está sonando pero... como?";
            break;
            case 24:
                setImage(new GreenfootImage("./images/forniture/room_bed_1.png"));
                DEFAULT_DESCRIPTION = "Una cama polvorienta";
            break;
            case 25:
                setImage(new GreenfootImage("./images/forniture/room_bed_2.png"));
                DEFAULT_DESCRIPTION = "Está vacía";
            break;
            case 26:
                setImage(new GreenfootImage("./images/forniture/room_chair_1.png"));
            break;
            case 27:
                setImage(new GreenfootImage("./images/forniture/room_chair_2.png"));
            break;
            case 28:
                setImage(new GreenfootImage("./images/forniture/room_chair_3.png"));
            break;
            case 29:
                setImage(new GreenfootImage("./images/forniture/room_chair_4.png"));
            break;
            case 30:
                setImage(new GreenfootImage("./images/forniture/room_forniture_1.png"));
                DEFAULT_DESCRIPTION = "Un cristal sucio, no parece haber nada más";
            break;
            case 31:
                setImage(new GreenfootImage("./images/forniture/room_forniture_2.png"));
                DEFAULT_DESCRIPTION = "Nada por aquí";
            break;
            case 32:
                setImage(new GreenfootImage("./images/forniture/room_forniture_3.png"));
                DEFAULT_DESCRIPTION = "Está vacío";
            break;
            case 33:
                setImage(new GreenfootImage("./images/forniture/room_forniture_4.png"));
                DEFAULT_DESCRIPTION = "El interior está sucio... y vacío";
            break;
            case 34:
                setImage(new GreenfootImage("./images/forniture/room_forniture_5.png"));
                DEFAULT_DESCRIPTION = "Nada por aquí";
            break;
            case 35:
                setImage(new GreenfootImage("./images/forniture/room_forniture_6.png"));
                DEFAULT_DESCRIPTION = "Debería revisar otro sitio";
            break;
            case 36:
                setImage(new GreenfootImage("./images/forniture/room_forniture_7.png"));
                DEFAULT_DESCRIPTION = "Nada interesante";
            break;
            case 37:
                setImage(new GreenfootImage("./images/forniture/room_forniture_8.png"));
                DEFAULT_DESCRIPTION = "Solo polvo y... nada más";
            break;
            case 38:
                setImage(new GreenfootImage("./images/forniture/room_lamp.png"));
                DEFAULT_DESCRIPTION = "No parece que funcione";
            break;
            case 39:
                setImage(new GreenfootImage("./images/forniture/room_stool.png"));
            break;
            case 40:
                setImage(new GreenfootImage("./images/forniture/room_wardrobe.png"));
                DEFAULT_DESCRIPTION = "No parece que haber algo más que ropa vieja";
            break;
            case 41:
                setImage(new GreenfootImage("./images/forniture/paint_1.png"));
            break;
            case 42:
                setImage(new GreenfootImage("./images/forniture/paint_2.png"));
            break;
            case 43:
                setImage(new GreenfootImage("./images/forniture/plant_1.png"));
                DEFAULT_DESCRIPTION = "Cómo es que sigue verde?";
            break;
            case 44:
                setImage(new GreenfootImage("./images/forniture/plant_2.png"));
                DEFAULT_DESCRIPTION = "Parece... delicada";
            break;
            case 45:
                setImage(new GreenfootImage("./images/forniture/plant_3.png"));
                DEFAULT_DESCRIPTION = "Creo que le falta agua";
            break;
            case 46:
                setImage(new GreenfootImage("./images/forniture/statue_1.png"));
                DEFAULT_DESCRIPTION = "Verlo me da escalofríos";
            break;
            case 47:
                setImage(new GreenfootImage("./images/forniture/statue_2.png"));
                DEFAULT_DESCRIPTION = "Sus ojos parecen seguirme";
            break;
            case 48:
                setImage(new GreenfootImage("./images/forniture/chandelier.png"));
            break;
            case 50:
                setImage(new GreenfootImage("./images/forniture/window.png"));
            break;
        }
        description = DEFAULT_DESCRIPTION;
    } 
}
