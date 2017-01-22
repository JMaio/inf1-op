package week3;
public class ArithmeticSeries {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int i = 1;
        int k = 0;


        while (i <= n) {
            k += i;
            i++;
        }

        System.out.println(k);
        
    }
    
}
