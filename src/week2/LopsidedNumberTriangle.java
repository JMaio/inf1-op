package week2;
public class LopsidedNumberTriangle {

    public static void main(String[] args) {

        for (int line_num = 1; line_num <= 9; line_num++) {

            String line = "";

            for (int char_num = 1; char_num <= line_num; char_num++) {

                line += line_num;

            }

            System.out.println(line);

        }

    }

}
