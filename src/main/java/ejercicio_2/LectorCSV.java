package ejercicio_2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV implements Lector {

    private String filePath;

    public LectorCSV(String csvPath) {
        this.filePath = csvPath;
    }

    @Override
    public List<String[]> leer(){
       try {
           List<String[]> csvData = new ArrayList<String[]>();
           CSVReader reader = new CSVReader(new FileReader(this.filePath));
           String[] row = null;

           while ((row = reader.readNext()) != null) {
               csvData.add(row);
           }

           reader.close();
           csvData.remove(0);
           return csvData;
       }catch (Exception e){
           throw new RuntimeException("Error al leer el archivo CSV: " + e.getMessage());

       }
    }
}
