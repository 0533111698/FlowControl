package dates;

import java.util.Scanner;

public class Metoda9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("3 NUMBERS");
        int result=threeNumbers(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println(result);

    }

    public static int threeNumbers(int a, int b, int c){
        int max=0;
        if (a>=b&&a>=c){
            max=a;
        } else if (b>a&&b>=c) {
            max=b;
        } else  {
            max=c;
        }
        return max;
    }
}
