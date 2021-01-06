import greenfoot.*;
import java.util.*;

public class Sounds  
{
    static GreenfootSound piano = new GreenfootSound("./sounds/moon.wav");
    static GreenfootSound viento = new GreenfootSound("./sounds/viento.wav");
    static GreenfootSound zombiesound = new GreenfootSound("./sounds/zombie.wav");

    public static void Piano(){
        piano.play();

    }

    public static void StopPiano(){
        piano.stop();

    }

    public static void Viento(){
        viento.play();

    }

    public static void StopViento(){
        viento.stop();

    }
    /*
      public static void Zombiesound(){
        zombiesound.play();

    }

    public static void Stopzombiesound(){
        zombiesound.stop();

    }*/

}
