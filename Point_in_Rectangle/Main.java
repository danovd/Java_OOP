package Point_in_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] coordinates = readArray(sc);

        Point pointA = new Point(coordinates[0], coordinates[1]);
        Point pointC = new Point(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(pointA, pointC);

        int n = Integer.parseInt(sc.nextLine());

        while(n-- > 0){
            int [] tokens = readArray(sc);

            Point p = new Point(tokens[0], tokens[1]);
            boolean isInside = rectangle.contains(p);
            System.out.println(isInside);
        }

    }
    public static int[] readArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
