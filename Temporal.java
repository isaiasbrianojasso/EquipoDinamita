import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Temporal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Temporal extends Actor
{
     String tiempo;
    public Temporal(String tiempo){
        this.tiempo=tiempo;
    }

    public Temporal(){
        this.tiempo=tiempo;
    }

    public void setTiempo(String tiempo){
        this.tiempo=tiempo;

    }

    public String getTiempo(){
        return tiempo;
    }

}
