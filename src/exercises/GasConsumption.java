package exercises;

import java.util.Scanner;

public class GasConsumption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter # of miles driven: ");

        int miles = in.nextInt();

        System.out.print("Enter # of gallons consumed: ");

        int gallons = in.nextInt();

        System.out.println("The MPG is " + miles/gallons);
    }
}
