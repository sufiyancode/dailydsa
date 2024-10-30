import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2, 3, 4 ,5 ,6 ,7 , 8, 9, 23, 2,12, 12,54);
        multiple(4, 5, "sdklf", 3, 4, 5, 6, 7);
    }

    static void multiple(int a, int b, String c, int ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int... v){
        int soru = v[0];
        System.out.println(Arrays.toString(v));
        System.out.println(soru);
    }
}
