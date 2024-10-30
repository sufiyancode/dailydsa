public class Shadowing {
   static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x = 20; // the class variable at line 2 is shadowed by this line
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
