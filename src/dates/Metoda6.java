package dates;

public class Metoda6 {
    public static void main(String[] args) {
       printRectangle(6,5);
    }
    public static void printNto1(int n){
        for (int i =n; i >0; i--) {
            System.out.print(i+" ");

        }
        System.out.println("\n");
    }
    public static void printRectangle(int width,int height){
        int n=width;
        for (int i = 0; i <height; i++) {
            printNto1(n);

        }

    }
}
