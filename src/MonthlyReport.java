import java.util.ArrayList;
//Считывание месячных отчётов
public class MonthlyReport {
    private String fileName;

    void getMonthReport() {
        FileReader fileReader = new FileReader();
        for (int i = 1; i <= 3; i++) {
            fileName = "m.20210" + i + ".csv";
            ArrayList<String> lines = fileReader.readFileContents(fileName);
            for (String line : lines) {
                year = Integer.parseInt(fileName.substring(2, 6));
                //String[] lineContents = line.split(",");

            }
        }
    }
}
