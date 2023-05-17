package dates;

public class Metoda5 {
    public static void main(String[] args) {
      printTriangle(4);

    }

    private static void printNote1(int n){

        for (int i = 1; i <=n; i++) {

            System.out.print(i+" ");
        }
        System.out.println("\n");


    }
    public static void printTriangle(int length){
        for (int i = 0; i <=length; i++) {
            int n=length;
            n=n-i;
           printNote1(n);


        }
    }
}
