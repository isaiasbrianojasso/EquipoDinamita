import greenfoot.*;
import java.util.*;

public class Sounds  
{
    static GreenfootSound piano = new GreenfootSound("./sounds/moon.wav");
    static GreenfootSound viento = new GreenfootSound("./sounds/viento.wav");
    static GreenfootSound zombie_mordida = new GreenfootSound("./sounds/zombie_mordida.wav");
    static GreenfootSound zombie_grito = new GreenfootSound("./sounds/zombie_grito.wav");
    static GreenfootSound zombie_fondo = new GreenfootSound("./sounds/zombie_fondo.wav");
    static GreenfootSound fantasma_lamento = new GreenfootSound("./sounds/fantasma_lamento.wav");
    static GreenfootSound fantasma_mordida = new GreenfootSound("./sounds/fantasma_mordida.wav");
    static GreenfootSound fondo = new GreenfootSound("./sounds/fondo.wav");
    static GreenfootSound spider_background = new GreenfootSound("./sounds/spider_background.wav");

    public static void Piano(){
        piano.play();

    }

    public static void StopPiano(){
        piano.stop();

    }

    public static void spider_background(){
        spider_background.play();

    }

    public static void Stopspider_background(){
        spider_background.stop();

    }

    public static void Viento(){
        viento.play();

    }

    public static void StopViento(){
        viento.stop();

    }

    public static void zombie_mordida(){
        zombie_mordida.play();

    }

    public static void Stopzombie_mordida(){
        zombie_mordida.stop();

    }

    public static void zombie_grito(){
        zombie_grito.play();

    }

    public static void Stopzombie_grito(){
        zombie_grito.stop();

    }

    public static void zombie_fondo(){
        zombie_fondo.play();

    }

    public static void Stopzombie_fondo(){
        zombie_fondo.stop();

    }

    public static void fantasma_lamento(){
        fantasma_lamento.play();

    }

    public static void Stopfantasma_lamento(){
        fantasma_lamento.stop();

    }

    public static void fantasma_mordida(){
        fantasma_mordida.play();

    }

    public static void Stopfantasma_mordida_fondo(){
        fantasma_mordida.stop();

    }

    public static void fondo(){
        fondo.play();

    }

    public static void Stopfondo(){
        fondo.stop();

    }
}
