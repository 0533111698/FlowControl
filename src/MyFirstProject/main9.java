package MyFirstProject;

import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number; enter -999 tu end");
        int num=scanner.nextInt();
        while (num!=-999){
            int sum=0;
            for (int i = 0; i <num; i++) {
                if (num%i==0){
                    sum=sum+i;
                }

            }System.out.println(sum);
        }

    }
}



