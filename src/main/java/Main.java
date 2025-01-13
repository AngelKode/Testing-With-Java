import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double radius, area, circumference;

        //Ask user the radius
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: \n");
        radius = input.nextDouble();

        if (radius < 0) {
            System.out.print("Circumference: Radius must be positive\n");
            System.out.print("Area: Radius must be positive\n");
        }else{
            //Do calculations
            circumference = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius, 2);

            System.out.printf("Circumference: %.4f\n",circumference);
            System.out.printf("Area: %.4f\n",area);
        }

    }
}
