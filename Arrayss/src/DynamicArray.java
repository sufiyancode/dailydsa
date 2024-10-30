import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(47);
        list.add(37);
        list.add(27);
        list.add(17);
        list.add(37);
        list.add(54);
        list.add(24);
        list.add(34);
        list.add(53);

        list.set(0, 34);

        list.remove(3);
        


        System.out.println(list);

    }
}
