package exercises;

import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first side of Rectangle: ");

        double firstSide = in.nextDouble();

        System.out.print("Enter second side of Rectangle: ");

        double secondSide = in.nextDouble();

        System.out.println("The area of the rectangle is " + firstSide * secondSide);
    }
}
