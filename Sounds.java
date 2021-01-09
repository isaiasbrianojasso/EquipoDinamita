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
    static GreenfootSound spider_scream = new GreenfootSound("./sounds/spider_scream.wav");
    static GreenfootSound spider_bite = new GreenfootSound("./sounds/spider_bite.wav");
    static GreenfootSound hit = new GreenfootSound("./sounds/spider_hit.wav");
    
    public static void Piano(){
        piano.play();
    }

    public static void StopPiano(){
        piano.stop();
    }

    public static void spider_background(){
        spider_background.playLoop();
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

    public static void zombie_grito(){
        zombie_grito.play();
    }

    public static void zombie_fondo(){
        zombie_fondo.play();
    }

    public static void fantasma_lamento(){
        fantasma_lamento.play();
    }

    public static void fantasma_mordida(){
        fantasma_mordida.play();
    }

    public static void fondo(){
        fondo.playLoop();
    }

    public static void Stopfondo(){
        fondo.stop();
    }
    
    public static void spiderScream(){
        spider_scream.play();
    }
    
    public static void spiderBite(){
        spider_bite.play();
    }
    
    public static void hit(){
        hit.play();
    }
}
