package dates;

import java.util.Scanner;

public class MaarachimNewSubject {
    public static void main(String[] args) {


//
//        int[]nums=new int[100];
//        for (int i = 0; i <100; i++) {
//           nums[i]=(int) (Math.random()*100)+1;
////           System.out.println(nums[i]);
//           if (nums[i]%2==0){
//            System.out.println(nums[i]);
//           }
//        }
//        int sum=0;
//        int average=1;
//        int[]nums=new int[50];
//        for (int i = 0; i <50; i++) {
//            nums[i]=(int) (Math.random()*100)+1;
//            sum=sum+nums[i];
////            System.out.println(nums[i]);
//        }average=sum/50;
//        System.out.println(average);
//        for (int i = 0; i <50; i++) {
//            if (nums[i]>average){
//                System.out.println(nums[i]);
//
//        }
//        }
//        int[] nums=new int[60];
//        int sum=0;
//        for (int i = 0; i <60; i++) {
//            nums[i]=(int) (Math.random()*100);
//            sum=sum+nums[i];
//            System.out.println(i);
//
//        }System.out.println(sum);
//        for (int i = 0; i <50 ; i++) {
//            if (sum/2==nums[i]){
//                System.out.println(i);
//            }
//
//        }
        //עמוד 48 תרגיל 4
//        int[] nums=new int[30];
//        for (int i = 0; i <20; i++) {
//            nums[i]=(int)(Math.random()*30)+1;
//            System.out.print(nums[i]+" ");
//
//        }
//        for (int i = 20; i <30; i++) {
//         nums[i]=0;
//
//        }
//        System.out.println(" ");
//        for (int i = 0; i <10; i++) {
//
//        nums[i+20]=nums[i]+nums[i+10]-nums[i];
//        nums[i+10]=nums[i+10]+nums[i]-nums[i+10];
//        nums[i]=nums[i+20];
//        }
//        for (int i = 0; i <20; i++) {
//            System.out.print(nums [i]+" ");
//
//        }
        //עמוד 49 תרגיל 5
//        int[] nums = new int[12];
//        for (int i = 0; i < 6; i++) {
//            nums[i] = (int) (Math.random() * 30);
//            System.out.print(nums[i] + " ");
//        }
//        for (int i = 6; i < 12; i++) {
//            nums[i] = 0;
//            System.out.print(nums[i] + " ");
//
//        }
//        System.out.println(" ");
//        for (int i = 0; i < 6; i++) {
//            nums[i + 6] = nums[i];
//            System.out.print(nums[i + 6] + " ");
//        }
//        for (int i = 0; i <6; i++) {
//            if (nums[i+6]%2==0){
//                nums[i]=nums[i+6];
//                nums[i+6]=0;
//            }else {nums[i]=0;}
//        }
//        System.out.println(" ");
//        for (int i = 0; i <12; i++) {
//            if (nums[i]!=0){
//            System.out.print(nums[i]+" ");}

//        }//תרגיל 6
//        int[]nuns=new int[6];
//        for (int i = 0; i <6; i++) {
//            nuns[i]=(int) (Math.random()*30)+1;
//            System.out.print(nuns[i]+" ");
//
//        }
//        System.out.println(" ");
//        int j=5;
//        for (int i = 0; i <3 ; i++) {
//            nuns[i]= nuns[i]+nuns[i+j];
//            nuns[i+j]=nuns[i]- nuns[i+j];
//            nuns[i]=nuns[i]-nuns[i+j];
//            j-=2;
//        }
//
//        Random rand=new Random();
//        int letter=0;
//        int number=0;
//        int symbol=0;
//        char[]arr=new char[50];
//
//        for (int i = 0; i <50; i++) {
//            arr[i]=(char) (Math.random()*90)+26;
//            System.out.print(arr[i]+" ");


//        }
//        int[]nums= {3,5,7,8,9,9,8,7,5,3};
//        int end= nums.length-1;
//        boolean filandrom=true;
//        int half= nums.length/2;
//
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums [i]!=nums[end-i]){
//                filandrom=false;
//                break;
//            }else{filandrom=true;
//
//        }
//        }System.out.println(filandrom? "filandrom": "not filandrom");
        //האם הסיסמא חזקה?
//        char[]chars=new char[8];
//
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Please insert a charter");
//        for (int i = 0; i < chars.length; i++) {
//
//            chars[i]=scanner.next().charAt(0);
//
//        }
//        int digit=0;
//        int letter=0;
//        int bigLetter=0;
//        int symbol=0;
//
//        for (int i = 0; i < chars.length; i++) {
//
//            if (chars[i]>'0'&&chars[i]<='9' ){
//                digit++;
//            } else if (chars[i]>='a'&&'a'<='z') {
//                letter++;
//
//            } else if (chars[i]>'A'&&chars[i]<'Z') {
//                bigLetter++;
//
//            } else {
//                symbol++;
//
//            }
//
//        }System.out.println("SYMBOL= "+symbol+"bigletter= "+bigLetter+" lettrt= "+letter+"digit= "+digit);
//        if (symbol>0&&letter>0&&bigLetter>0&&digit>0){System.out.println("Strong passwword");
//        }else {System.out.println("please enter again");}
//בדיקה ללא מערך
//        String password=scanner.next();
//        for (int i = 0; i <password.length(); i++) {
//            char chr=password.charAt(i);

//        }








    }


}







