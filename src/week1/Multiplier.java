package week1;
public class Multiplier {

    public static void main (String[] args) {

        int n0 = Integer.parseInt(args[0]);
        int n1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);
        int f = n0 * n1 * n2;

        System.out.println(n0 + " * " + n1 + " * " + n2 + " = "  + f);

    }

}
