import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CountingTest {
    public static void main(String[] args) throws FileNotFoundException {

        CountingMethods cm = new CountingMethods();
        List<Integer> listOfFigures = cm.readToList("data.csv");
        System.out.println(listOfFigures);
        Set<String> infoBack = new TreeSet<>();

        for (int i = 0; i < listOfFigures.size(); i++) {
        int counter = 0;
            for (int j = 0; j < listOfFigures.size(); j++) {
                if (listOfFigures.get(j).equals(listOfFigures.get(i))) counter++;
            }
            infoBack.add(String.valueOf(listOfFigures.get(i) + "  występuje " +counter +"\n"));
        }

        for (String s : infoBack) {
            System.out.println(s);
        }
    }
}