import java.util.ArrayList;
//Годовой отчёт
public class YearlyReport {
    private String fileName;
    // Тут тоже нужна переменная, в которой будет храниться годовой отчет.
    void getYearReport() {
        FileReader fileReader = new FileReader();
        fileName = "y.2021.csv";
        ArrayList<String> lines = fileReader.readFileContents(fileName);
        // переменную months лучше вынести из метода
        ArrayList<YearData> year = new ArrayList<>();
        for (int k = 1; k < lines.size(); k++) {
            String[] lineContents = lines.get(k).split(",");
            YearData data = new YearData(Integer.parseInt(lineContents[0]),
                    Integer.parseInt(lineContents[1]),
                    Boolean.parseBoolean(lineContents[1]));
            // Записываем в список
            year.add(data);
        }
        System.out.println(year);
    }
}
