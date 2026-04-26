package ejercicio_2;



import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Recaudacion {


    public static final String COMPANY_NAME = "company_name";
    public static final String CITY = "city";
    public static final String STATE = "state";
    public static final String ROUND = "round";
    public static final String PERMALINK = "permalink";
    public static final String NUMBER_EMPLOYEES = "number_employees";
    public static final String CATEGORY = "category";
    public static final String FUNDED_DATE = "funded_date";
    public static final String RAISED_AMOUNT = "raised_amount";
    public static final String RAISED_CURRENCY = "raised_currency";
    public static final int INDICE_COMPANY_NAME = 1;
    public static final int INDICE_CITY = 4;
    public static final int INDICE_STATE = 5;
    public static final int INDICE_ROUND = 9;
    public static final int INDICE_PERMALINK = 0;
    public static final int INDICE_NUMBER_EMPLOYESS = 2;
    public static final int INDICE_FUNDED_DATE = 6;
    public static final int INDICE_CATEGORY = 3;
    public static final int INDICE_RAISED_AMOUNT = 7;
    public static final int INDICE_RAISED_CURRENCY = 8;
    List<String[]> csvData;


    public Recaudacion(LectorCSV lector) {
        this.csvData=lector.leerCVS();
    }
    public List<Map<String, String>> where(Map<String, String> options)
            throws IOException {

        filtrarPor(options, COMPANY_NAME, INDICE_COMPANY_NAME);

        filtrarPor(options, CITY, INDICE_CITY);

        filtrarPor(options, STATE, INDICE_STATE);

        filtrarPor(options, ROUND, INDICE_ROUND);

        return mapearResultado();
    }

    private List<Map<String, String>> mapearResultado() {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        csvData.forEach(csvDatum -> {
            Map<String, String> mapped = new HashMap<>();
            mapped.put(PERMALINK, csvDatum[INDICE_PERMALINK]);
            mapped.put(COMPANY_NAME, csvDatum[INDICE_COMPANY_NAME]);
            mapped.put(NUMBER_EMPLOYEES, csvDatum[INDICE_NUMBER_EMPLOYESS]);
            mapped.put(CATEGORY, csvDatum[INDICE_CATEGORY]);
            mapped.put(CITY, csvDatum[INDICE_CITY]);
            mapped.put(STATE, csvDatum[INDICE_STATE]);
            mapped.put(FUNDED_DATE, csvDatum[INDICE_FUNDED_DATE]);
            mapped.put(RAISED_AMOUNT, csvDatum[INDICE_RAISED_AMOUNT]);
            mapped.put(RAISED_CURRENCY, csvDatum[INDICE_RAISED_CURRENCY]);
            mapped.put(ROUND, csvDatum[INDICE_ROUND]);
            output.add(mapped);
        });
        return output;
    }

    private void filtrarPor(Map<String, String> options, String nombreColumna, int indice) {
        if (options.containsKey(nombreColumna)) {
            List<String[]> results = csvData.stream()
                    .filter(csvDatum -> csvDatum[indice].equals(options.get(nombreColumna)))
                    .collect(Collectors.toList());

            csvData = results;
        }
    }


}