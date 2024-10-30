import java.util.ArrayList;
import java.util.Scanner;

public class MultiDynamicArr {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i <4; i++) {  // [[],[],[],[]]
            list.add(new ArrayList<>());

        }

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 5; j++) {  // [[0, 1, 2, 3, 4],[],[],[]]
                list.get(i).add(j);
            }
        }


        System.out.println(list);
    }
}
