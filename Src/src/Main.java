import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        List<Diagnostiker> diagnostikersList = readTsv("Src/src/fallakten.tsv");

        System.out.println(diagnostikersList);

        StartWith(diagnostikersList, 'J' );


    }

    private static List<Diagnostiker> readTsv(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        String[] headers = lines.get(0).split("\t");
        List<Diagnostiker> diagnostikers = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String[] values = lines.get(i).split("\t");
            diagnostikers.add(new Diagnostiker(
                    Integer.parseInt(values[0]),
                    values[1],
                    values[2],
                    values[3],
                    values[4],
                    values[5]
                ));
        }
        return diagnostikers;
    }

    public static void StartWith(List<Diagnostiker> diagnostikers, char letter){
        List<Diagnostiker> filteredList = new ArrayList<>();
        for(Diagnostiker p : diagnostikers){
            if(p.getPatient() != null && p.getPatient().charAt(0) == letter){
                System.out.println(p);
            }
        }
    }


}