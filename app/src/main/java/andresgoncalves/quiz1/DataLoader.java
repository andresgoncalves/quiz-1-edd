package andresgoncalves.quiz1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class DataLoader {
    
    private DataLoader() {}
    
    public static List<Series> load(File file) throws IOException {
        List<Series> list = new List<Series>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            Series series = null;
            for(String line = reader.readLine(); line != null; line = reader.readLine()) {
                if(line.startsWith("%")) {
                    String[] data = line.replace("%", "").split("/");                   
                    int type = 
                        data[2].contains("infantil") ? Series.KIDS :
                        data[2].contains("adulto") ? Series.ADULTS :
                        Series.ALL;
                    series = new Series(data[0], data[1], type);
                    list.append(series);
                }
                else if(series != null && !line.isBlank()) {
                    String[] data = line.split("/");
                    series.getEpisodes().append(new Episode(data[0], data[1]));
                }
            }
        }
        return list;
    }
}
