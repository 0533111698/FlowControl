package dates;

import java.util.Scanner;

public class metoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plaese insert a number");
        prime(scanner.nextInt());

    }



    public static void prime(int num) {
        boolean isprime=true;
        for (int i = 2; i <num; i++) {
            if (num%i==0) {
                isprime = false;
                break;
            }

        }System.out.println(isprime? "the num is prime": "the num is not prime");


    }
}
