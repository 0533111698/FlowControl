package dates;

public class Metoda22 {
    public static void main(String[] args) {
        zugiNumbers(2,50);
        zugiNumbers(52,100);
        zugiNumbers(100,200);


    }
    public static void zugiNumbers(int num, int num2){
        for (int i =num; i <=num2 ; i++) {
            if (i%2==0){System.out.print(i+" ");}

        }
    }
}
