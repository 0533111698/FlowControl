package dates;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        double sum = 0;
//        int i = 0;
//        System.out.println("Please insert a number");
//        int num = scanner.nextInt();
//        while (num >= 0) {
//            i++;
//            sum = sum + num;
//            System.out.println("please insert a number");
//            num = scanner.nextInt();
//        }
//        double average = (sum /= i);
//        System.out.println("the average is: " + (average));

//                    //תרגיל 2
//        boolean isprime = true;
//        System.out.println("please insert a number");
//        int n = scanner.nextInt();
//        if (n == 1 || n == (-1)) {
//            System.out.println("the number is not prime");
//        } else {
//
//            for (int i = 2; i < Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    isprime = false;
//                    break;
//                }
//            }
//            if (isprime == false) {
//                System.out.println("The number is not prime");
//            } else System.out.println("The number is prime");
//        }

                //7 בום
        System.out.println("Please enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int temp = 0;
        boolean bingo = false;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " " + num2);
        for (int i = num1; i <= num2; i++) {
            int x = i;
            while (x > 0) {
                if (x % 10 == 7 || x % 7 == 0) {
                    bingo = true;
                    break;
                } else {
                    bingo = false;
                    x = x / 10;
                }
            }
            if (bingo == true) System.out.println("boom");
            else if (bingo == false)
                System.out.println(i);

        }
    }
}
