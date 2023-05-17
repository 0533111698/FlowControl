package dates;

public class Metoda7 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Please insert 3 numbers");
        double result= addFive((short) 1,(short) 2,(short) 3,(short) 5,(short) 5);
        System.out.println(result);

    }


    public static double addFive(short a, short b, short c, short d,short e) {
        double average=(double)(a+b+c+d+e)/5.0;
        return average;


    }
}
