import greenfoot.*;
import java.util.*;

public class Sounds  
{
    static GreenfootSound piano = new GreenfootSound("./sounds/moon.wav");
    static GreenfootSound viento = new GreenfootSound("./sounds/viento.wav");

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
}
