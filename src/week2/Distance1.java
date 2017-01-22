package week2;
public class Distance1 {

    public static void main (String[] args) {

        int n0 = Integer.parseInt(args[0]);
        int n1 = Integer.parseInt(args[1]);

        System.out.println(Math.max(n0, n1) - Math.min(n0, n1));

    }

}
