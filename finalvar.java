public class  finalvar{
    public static void main(String[] args) {
        // normal variable
        int a =  2;
        System.out.println(a);
        a = 3;
        System.out.println(a);

        // final variable
        final int b = 6;
        System.out.println(b);
        //b = 3;
        System.out.println(b);
        System.out.println("no final variable changes");
    }
}