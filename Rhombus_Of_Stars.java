import java.util.Scanner;

public class Rhombus_Of_Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());
        Rhombus rhombus = new Rhombus(input);

        System.out.println(rhombus.getFigure());
    }

    public static class Rhombus {
        private final int n;

        public Rhombus(int n) {
            this.n = n;
        }
        public String getFigure(){
            return printTop() +
                    printMiddle() +
                    printBottom();
        }

        private String printBottom() {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < n; i++) {
                sb.append(repeatAndPrintString(i, " "))
                        .append(repeatAndPrintString(n - i, "* "))
                        .append(System.lineSeparator());
            }
            return sb.toString();
        }

        private String printMiddle() {
            return repeatAndPrintString(n, "* ") + System.lineSeparator();
        }

        private String printTop() {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < n; i++) {
                sb.append(repeatAndPrintString(n-i, " "))
                        .append(repeatAndPrintString(i, "* "))
                        .append(System.lineSeparator());
            }
            return sb.toString();
        }

        private String repeatAndPrintString(int count, String s) {
            return s.repeat(count);
        }


    }


}
