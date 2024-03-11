import java.util.ArrayList;
import java.util.HashMap;

//Годовой отчёт
public class YearlyReport {
    private String fileName;
    public HashMap<Integer, YearData> years = new HashMap<>();
    void getYearReport() {
        FileReader fileReader = new FileReader();
        String year = "2021";
        fileName = "y.2021.csv";
        ArrayList<String> lines = fileReader.readFileContents(fileName);
        for (int i = 1; i < lines.size(); i++) {
            String[] lineContents = lines.get(i).split(",");
            int hashMapKey = Integer.parseInt(lineContents[0]);
            if (Boolean.parseBoolean(lineContents[2])) {
                hashMapKey = -hashMapKey;
            }
            years.put(hashMapKey, new YearData(hashMapKey,
                                        Integer.parseInt(lineContents[1]),
                                        Boolean.parseBoolean(lineContents[2]),
                                        year));
        }
        System.out.println(years);
    }
}
