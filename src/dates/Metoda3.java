package dates;

public class Metoda3 {
    public static void main(String[] args) {
        f1();
        System.out.println("------");
        f2();
        System.out.println("------");
        f3();
        System.out.println("------");

    }
    public  static void f3(){
        System.out.println("f3");
    }

    public static void f2(){
        System.out.println("f2");
        f3();
    }

    public static void f1(){
        System.out.println("f1");
        f2();
    }

}
