package dates;

public class Metoda8 {
    public static void main(String[] args) {
        int results=minMax(8,12);
        System.out.println(results);

    }
    public static int minMax(int min, int max){
        int num=(int) (Math.random()*(max-min+1))+min;
        return num;

    }
}
