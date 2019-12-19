

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        final double PI = 3.1416;
        Scanner keyboard = new Scanner(System.in);
        double radius, area, circumference;
        System.out.print("Enter radius of a circle: ");
        radius = keyboard.nextDouble();
        System.out.print("\n");
        area = PI * radius * radius;
        System.out.println("Area: " + area + "\n\n");
        circumference = 2.0 * PI * radius;
        System.out.println("Circumference: " + circumference);
    }//main
} // Circle2
