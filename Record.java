import greenfoot.*;
import java.util.*;
import java.io.*;

public class Record
{
    private File file;
    private FileWriter escritor;
    private BufferedWriter bufer;
    private PrintWriter salida;
    private ArrayList<Temporal> temp= new ArrayList<Temporal>() ;
    
    public  Record()
    {
        file = new File ("Records.txt");
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
                s.println(i.tiempo);
            
            s.close();
            bw.close();
        }catch(IOException e){}

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

    public void add(Temporal newRecord){
        boolean isAdded = false;
        int index = 1;
        
        for(Temporal record : temp) {
            if(Integer.parseInt((newRecord.getTiempo()).replaceAll(":","")) < Integer.parseInt((record.getTiempo()).replaceAll(":",""))) {
                temp.add(index,newRecord);
                isAdded = true;
                break;
            }
            index++;
        }
        
        if(!isAdded && temp.size() < 5)
            temp.add(newRecord);
    }
    
    public void checkAdd(int index, Temporal newRecord) {
        
    }

    public ArrayList<Temporal> escribeTabla(){
        return temp;
    }

}
