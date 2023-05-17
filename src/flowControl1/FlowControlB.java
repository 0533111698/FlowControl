package flowControl1;

import java.util.Arrays;
import java.util.Scanner;

public class FlowControlB {
    public static void main(String[] args) {
four();
    }
    public static   void one(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please insert a number");
        int x=scanner.nextInt();
        for (int i = 0; i <x; i++) {
            System.out.println(" ");
            for (int j = 0; j <x; j++) {
                if (i==0||i==x-1)
                    System.out.print("*");
                else if (j==0||j==x-1)
                    System.out.print("*");
                else System.out.print(" ");
            }

        }
    }
    public static void tow(){
        char[]nameChar={'M','A','L','K','I',' ','G','E','F','N','E','R'};
        for (int i = 0; i <nameChar.length; i++) {
            int x=(int) (Math.random()* nameChar.length);
            char temp=nameChar[x];
            nameChar[x]=nameChar[i];
            nameChar[i]=temp;


        }
        System.out.println(Arrays.toString(nameChar));

//        char[]newName=new char[12];
//        int []index=new int[12];
//        boolean hasama=true;
//        for (int i = 0; i < name.length; i++) {
//            int x=(int) (Math.random()* (name.length));
//            index[i]=x;
//            for (int j = 0; j <i; j++) {
//                if (x==index[j]){
//                    hasama=false;
//                break;}
//                else{
//                    hasama=true;
//                }
//            }if (hasama==true)
//                newName[i]=name[x];
//            else i--;
//
//        }
//        for (int i = 0; i < newName.length; i++) {
//            System.out.print(newName[i]);
//
//        }


    }
    public static void three(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("please insert a number");
        int x=scanner.nextInt();
        for (int i = x; i >0; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);


            }System.out.println(" ");

        }
        for (int i = 2; i <=x; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(j);

            }
            System.out.println(" ");

        }
    }
    public static void four(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please insert a number");
        int x=scanner.nextInt();
        for (int i = 0; i <x; i++) {
            int[] loto=new int[6];
            for (int j = 0; j <6; j++) {
                loto[j]=(int) (Math.random()*38)+1;
                for (int k = 1; k <j; k++) {
                    if (loto[j]==loto[k])
                        j--;
                }
                }System.out.println(Arrays.toString(loto));




        }

    }
}
