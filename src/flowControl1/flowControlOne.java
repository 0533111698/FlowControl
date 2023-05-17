package flowControl1;

import java.util.Scanner;

public class flowControlOne {
    public static void main(String[] args) {
        one();

    }public  static void one(){
        int[]arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int) (Math.random()*10)+1;
                for (int j = 0; j <i; j++) {
                    if (arr[i]==arr[j]){
                        arr[i]=(int) (Math.random()*10)+1;
                        j=-1;

                    }


                }System.out.println(arr[i]);



            }
        int max=1;
        int min=10;
        int counter=0;
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (arr[i]>=max){
                max=arr[i];
            }  if (arr[i]<=min) {
                min=arr[i];

            }  if (arr[i]>5) {
                counter++;

            }


        }System.out.println("max= "+max+",  min= "+min+", "+counter+" numbers bigger than 5,"+" average is: "+sum/5.0);







    }
    public static void tow(){
        int []arr=new int[10] ;
        int counter1=0;
        int counter2=0;
        int counter3=0;
        int counter4=0;
        int counter5=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int) (Math.random()*5+1);
            System.out.print(arr[i]+" ");
            switch (arr[i]){
                case 1:counter1++;
                    break;
                case 2:counter2++;
                    break;
                case 3:counter3++;
                    break;
                case 4:counter4++;
                    break;
                case 5:counter5++;
                    break;
                default:System.out.println("Un supported operation");
            }
//            if (arr[i]==1)
//                counter1++;
//            else if (arr[i]==2) {
//                counter2++;
//            } else if (arr[i]==3) {
//                counter3++;
//            } else if (arr[i]==4) {
//                counter4++;
//            } else if (arr[i]==5) {
//                counter5++;
//            }

        }
        System.out.println("\n"+" 1-"+counter1+"\n"+" 2-"+counter2+"\n"+" 3-"+counter3+"\n"+" 4-"+counter4+"\n"+" 5-"+counter5);
    }
    public static void three(){
        int num=(int) (Math.random()*10+1);
        System.out.println(num);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please guess a number");

        for (int i = 0; i <3; i++) {

            int a=scanner.nextInt();
            if (a==num){
                System.out.println("Bingo");
            break;}
            else if (i!=2)System.out.println("Ho no, please insert another number");
            else System.out.println("Ho no, good bye");


        }
    }


}
