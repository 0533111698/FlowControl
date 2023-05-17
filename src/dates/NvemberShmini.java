package dates;

import java.util.Scanner;

public class NvemberShmini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //7 בום
        System.out.println("Please enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int a = 0;
        boolean bingo = false;
        if (num1 > num2) {
            a = num1;
            num1 = num2;
            num2 = a;
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
        //האם מספר פילנדרום
//        System.out.println("please enter a number");
//        int num=scanner.nextInt();
//        int firstnum=num;
//        int temp=0;
//        while (num>0){
//            temp=temp+(num%10);
//            temp*=10;
//            num/=10;
//        }temp/=10;
//        System.out.println(temp);
//        if (temp==firstnum)System.out.println("the num is filandrom");
//        else System.out.println("the num is not filandrom");

        // סכום מחלקים
//
//        System.out.println("please enter a number, and enter -999 tu end");
//        int num=scanner.nextInt();
//        while (num!=-999){
//            int sum=0;
//            for (int i =1; i <=num; i++) {
//                if (num%i==0){
//                    sum=sum+i;
//
//                }
//
//            }System.out.println(sum);
//            System.out.println("please enter a number, and enter -999 tu end");
//            num=scanner.nextInt();
//        }

        ///הדפסת כוכביות
//        System.out.println("please insert a lenght and rochav");
//        int govah=scanner.nextInt();
//        int rochav=scanner.nextInt();
//        for (int i = 0; i <govah; i++) {
//            System.out.println(" ");
//            for (int j = 0; j <rochav; j++) {
//                System.out.print("*");

        //הדפסת משולש
//        System.out.println("please enter a number");
//        int n=scanner.nextInt();
//        for (int i = n; i >0; i--) {
//            System.out.println("");
//            for (int j =i-1; j >=0; j--) {
//                System.out.print("*");
//
//            }
//
//        }
        // משולש ספרות
//        System.out.println("please enter a number");
//        int n=scanner.nextInt();
//        for (int i = n; i >0 ; i--) {
//            System.out.println("");
//            int a=1;
//            for (int j = i-1; j >=0 ; j--) {
//                System.out.print(a++);
//
//            }
//
//        }
        //סכום ספרות
//        int globalSum=0;
//        for (int i = 0; i <3; i++) {
//            System.out.println("please enter a number");
//            int num=scanner.nextInt();
//            int sum=0;
//            globalSum=globalSum+num;
//            while (num>0){
//                sum=sum+num%10;
//
//                num/=10;
//
//
//            }globalSum=globalSum+sum;
//            System.out.println(sum);
//
//        }System.out.println(globalSum);
        //להפוך מהקטן לגדול
//        System.out.println("please enter a number");
//        int num=scanner.nextInt();
//        for (int i = 0; i <=9 ; i++) {
//            int temp=num;
//            while ( temp!=0){
//            if (temp%10==i){
//                System.out.print(i);
//            }
//                temp=temp/10;
//            }
//
//
//        }
        //ממצוע עד זקיף שלילי
//        int average=0;
//        int sum=0;
//        int i=0;
//        System.out.println("Please enter a number");
//        int num=scanner.nextInt();
//        while (num>0){
//           i++;
//            sum=sum+num;
//            System.out.println("please insert a number");
//            num=scanner.nextInt();
//        }System.out.println(sum/=i);

//
//        boolean isprime = true;
//        System.out.println("please insert a number");
//        int n = scanner.nextInt();
//        if (n == 1) {
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
//            } else System.out.println("the number is prime");
//        }
//    }
////                                             // בדוק קטן שווה תלוי אם המספר הראשון נחשב לאפס או אחדסדרת פיבוציני
//        //i=0 1 2 3 4 5  6   7   8  9
//        //f=1 1 2 3 5 8 13  21  34  55
//        System.out.println("please insert a number");
//        int num=scanner.nextInt();
//        int a=1;
//        int b=1;
//        int temp=0;
//        for (int i = 2; i <=num; i++) {
//        temp=a;
//        a=b;
//        b=b+temp;


//        }System.out.println(b);
    }
}
