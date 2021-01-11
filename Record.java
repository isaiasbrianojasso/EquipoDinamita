import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;
import java.util.ArrayList;
/**
 * Write a description of class Record here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Record extends Actor
{
    private File file;
    private FileWriter escritor;
    private BufferedWriter bufer;
    private PrintWriter salida;
    private ArrayList<Player>  records;
   private  ArrayList<Temporal> temp= new ArrayList<Temporal>() ;
    

    public  Record()
    {
        records = new ArrayList<Player>();
        file = new File ("/Users/joseisaiasbrianojasso 1/Desktop/Records.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException ex){}
        }
        else {
            this.leeRecords();
        }
    }
 
    public void escribeRecords(){
        PrintWriter escritor;
        String num;
        BufferedWriter bw;
        PrintWriter s;
        try{
            escritor = new PrintWriter(file);
            bw = new BufferedWriter(escritor);
            s = new PrintWriter(bw);

            for(Temporal i : temp)
            {
                s.println(i.tiempo);
                //System.out.println(i.tiempo);
            }
            s.close();
            bw.close();
        }catch(IOException e){}

    }
   public void muestra_record(){
     
     for(Temporal i : temp)
            {
                
                System.out.println(i.tiempo);
            }
    
    }
    private void leeRecords(){

        Temporal persona;
        String nombre = "";
        int puntos = 0;
        String texto = "";
        FileReader lector = null;
        String linea = "";
        try {
            lector = new FileReader(file);
            BufferedReader bl = new BufferedReader(lector);
            while ((linea = bl.readLine()) != null) {
                persona = new Temporal();
                texto = linea;
                persona.setTiempo(texto);
                //System.out.println(texto);
                temp.add(persona);
            }   

        } catch (IOException e) {

        } finally {
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void add(Temporal p){        
        temp.add(p);
        //this.escribeRecords();
    }

    public ArrayList<Temporal> escribeTabla(){
        return temp;
    }

}
