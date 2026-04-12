package ejercicio_2;


import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {


        private static final Map<String, Integer> COLUMNAS = new HashMap<>();

        static {
            COLUMNAS.put("permalink", 0);
            COLUMNAS.put("company_name", 1);
            COLUMNAS.put("number_employees", 2);
            COLUMNAS.put("category", 3);
            COLUMNAS.put("city", 4);
            COLUMNAS.put("state", 5);
            COLUMNAS.put("funded_date", 6);
            COLUMNAS.put("raised_amount", 7);
            COLUMNAS.put("raised_currency", 8);
            COLUMNAS.put("round", 9);
        }

        public static List<Map<String, String>> where(Map<String, String> options)
                throws IOException {

            List<String[]> csvData = leerCSV();

            List<String[]> filtrado = filtrar(csvData, options);

            return mapearResultado(filtrado);
        }

        // 🔹 Leer CSV
        private static List<String[]> leerCSV() throws IOException {
            List<String[]> data = new ArrayList<>();

            CSVReader reader = new CSVReader(new FileReader("src/main/resources/data.csv"));
            String[] row;

            while ((row = reader.readNext()) != null) {
                data.add(row);
            }

            reader.close();
            data.remove(0); // eliminar encabezado

            return data;
        }

        // 🔹 Filtrar dinámicamente
        private static List<String[]> filtrar(List<String[]> data, Map<String, String> options) {
            List<String[]> resultado = new ArrayList<>();

            for (String[] fila : data) {
                boolean coincide = true;

                for (String key : options.keySet()) {
                    Integer index = COLUMNAS.get(key);

                    if (index == null || !fila[index].equals(options.get(key))) {
                        coincide = false;
                        break;
                    }
                }

                if (coincide) {
                    resultado.add(fila);
                }
            }

            return resultado;
        }


        private static List<Map<String, String>> mapearResultado(List<String[]> data) {
            List<Map<String, String>> output = new ArrayList<>();

            for (String[] fila : data) {
                Map<String, String> mapped = new HashMap<>();

                for (String key : COLUMNAS.keySet()) {
                    mapped.put(key, fila[COLUMNAS.get(key)]);
                }

                output.add(mapped);
            }

            return output;
        }

}