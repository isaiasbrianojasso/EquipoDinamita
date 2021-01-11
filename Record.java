import greenfoot.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Record
{
    private List<String> recordsList;
    
    public Record()
    {
        try {
            recordsList = Files.readAllLines(Paths.get("Records.txt"));
        } catch(IOException Ex) {
            recordsList = new ArrayList<String>();
        }
    }

    public void escribeRecords(){
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("Records.txt"))) {
            for(String recordLine : recordsList) {
                writer.write(recordLine);
                writer.newLine();
            }
        } catch(IOException Ex) {
            System.out.println("Error saving records");
        }
    }

    public void add(String newRecord){
        boolean isAdded = false;
        int index = 1;
        
        for(String record : recordsList) {
            if(Integer.parseInt((newRecord.replaceAll(":",""))) < Integer.parseInt(record.replaceAll(":",""))) {
                recordsList.add(index-1,newRecord);
                isAdded = true;
                break;
            }
            index++;
        }
        
        if(!isAdded && recordsList.size() < 5)
            recordsList.add(newRecord);
    }

    public List<String> getList(){
        return recordsList;
    }

}
