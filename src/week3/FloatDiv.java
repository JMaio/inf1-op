package week3;
public class FloatDiv {
    public static void main(String args[]) {
        int age = Integer.parseInt(args[0]);
        int exposure = Integer.parseInt(args[1]);

        // change "250" to "250.0"
        double dose = ((exposure * 250.0) / age);

        System.out.format("Patient Age: %d%n", age);
        System.out.format("Days since bitten: %d%n", exposure);
        System.out.format("Dosage of antidote: %.3fmg%n", dose);
    }
}