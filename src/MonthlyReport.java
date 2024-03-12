import java.util.ArrayList;
import java.util.HashMap;
//Считывание месячных отчётов
public class MonthlyReport {
  public HashMap<Integer, ArrayList<MonthData>> months = new HashMap<>();
    public ArrayList<MonthData> month;
    public HashMap<Integer,Integer> sumMonths = new HashMap<>();

    void getMonthReport() {
        for (int i = 1; i <= 3; i++) {
            FileReader fileReader = new FileReader();
          String fileName = "m.20210" + i + ".csv";
            ArrayList<String> lines = fileReader.readFileContents(fileName);
            month = new ArrayList<>();
            for (int j = 1; j < lines.size(); j++) {
                String[] splitText = lines.get(j).split(",");
                MonthData data = new MonthData(splitText[0],
                        Boolean.parseBoolean(splitText[1]),
                        Integer.parseInt(splitText[2]),
                        Integer.parseInt(splitText[3]));

                month.add(data);
            }

            // Записываем в хеш - список
            months.put(i, month);
//            System.out.println(months);
        }
        transformMonthReport(months);
        System.out.println("Месячные отчеты успешно считаны");
    }

    public void transformMonthReport(HashMap<Integer, ArrayList<MonthData>> months) {

        for (int i = 1; i <= months.size(); i++){
            int sumTrue = 0;
            int sumFalse = 0;
            for(int j = 0; j < months.get(i).size(); j++){
                if(months.get(i).get(j).getExpense()){
                    sumTrue += months.get(i).get(j).getQuantity()*
                               months.get(i).get(j).getUnitPrice();

                } else {
                    sumFalse += months.get(i).get(j).getQuantity()*
                                months.get(i).get(j).getUnitPrice();
                }
            }
            sumMonths.put(-i, sumTrue);
            sumMonths.put(i, sumFalse);
        }
//        System.out.println(sumMonths);
    }
}