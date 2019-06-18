import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingMethods {

    public List<Integer> readToList(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));

        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while (sc.hasNextLine()) {
            String lineData = sc.nextLine();
            String[] split = lineData.split(";");
            for (int i1 = 0; i1 < split.length; i1++) {
                list.add(Integer.valueOf((split[i1])));
            }
            i++;
        }
        return list;
    }

}
