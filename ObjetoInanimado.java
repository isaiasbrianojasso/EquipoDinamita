import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baño here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjetoInanimado extends Forniture
{

    //boleano si es movable o no ... opcion es la opcion deseada
    public  ObjetoInanimado(boolean  movable,int opcion) {
        this.movable=movable;
        DEFAULT_DESCRIPTION = "No parece haber nada interesante";
        switch(opcion){
            case 1:
            setImage(new GreenfootImage("./images/forniture/ventana_1.png"));  
            break;
            case 2:
            setImage(new GreenfootImage("./images/forniture/chimenea_1.png"));
            break;
            case 3:
            setImage(new GreenfootImage("./images/forniture/maceta_1.png"));
            break;
            case 4:
            setImage(new GreenfootImage("./images/forniture/maceta_2.png"));
            break;
            case 5:
            setImage(new GreenfootImage("./images/forniture/mesa_1.png"));
            break;
            case 6:
            setImage(new GreenfootImage("./images/forniture/mesa_2.png"));//
            break;
            case 7:
            setImage(new GreenfootImage("./images/forniture/mesa_3.png"));
            break;
            case 8:

            setImage(new GreenfootImage("./images/forniture/piano_1.png"));
            break; 
            case 9:

            setImage(new GreenfootImage("./images/forniture/tapete_1.png"));
            break;
            case 10:

            setImage(new GreenfootImage("./images/forniture/ventana_1.png"));
            break;
            case 11:

            setImage(new GreenfootImage("./images/forniture/ventana_lloviendo.gif"));
            break;
            case 12:

            setImage(new GreenfootImage("./images/forniture/bañera.png"));
            break;
            case 13:

            setImage(new GreenfootImage("./images/forniture/baño_espejo.png"));
            break;
            case 14:

            setImage(new GreenfootImage("./images/forniture/lavado.png"));
            break;
            case 15:

            setImage(new GreenfootImage("./images/forniture/sillon_1.png"));
            break;
            case 16:

            setImage(new GreenfootImage("./images/forniture/sillon_2.png"));
            break;
            case 17:

            setImage(new GreenfootImage("./images/forniture/sillon_3.png"));
            break;  
            case 18:

            setImage(new GreenfootImage("./images/forniture/sillon_4.png"));
            break;  
            case 19:

            setImage(new GreenfootImage("./images/forniture/taza.png"));
            break; 
            
            //aqui me quede

            case 20:
            setImage(new GreenfootImage("./images/forniture/libros_1.png"));
            break;  
            case 21:

            setImage(new GreenfootImage("./images/forniture/libros_2.png"));
            break;
            
            case 22:
            setImage(new GreenfootImage("./images/forniture/panel_1.png"));
            break;
            case 23:

            setImage(new GreenfootImage("./images/forniture/panel_2.png"));
            break;
            case 24:

            setImage(new GreenfootImage("./images/forniture/panel_3.png"));
            break;
            case 25:

            setImage(new GreenfootImage("./images/forniture/cuadro_1.png"));
            break;  
            case 26:

            setImage(new GreenfootImage("./images/forniture/cuadro_2.png"));
            break;
            case 27:

            setImage(new GreenfootImage("./images/forniture/maceta_2.png"));
            break;
            case 28:

            setImage(new GreenfootImage("./images/forniture/maceta_2.png"));
            break;
            case 29:

            setImage(new GreenfootImage("./images/forniture/maceta_2.png"));
            break;
            case 30:

            setImage(new GreenfootImage("./images/forniture/maceta_2.png"));
            break;
            case 31:

            setImage(new GreenfootImage("./images/forniture/maceta_2.png"));
            break;

        }
    } 
}
