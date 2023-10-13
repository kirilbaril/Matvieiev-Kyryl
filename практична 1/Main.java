import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("enter inches");

        double inches = scanner.nextDouble();

        double meters = inches * 0.0254;

        System.out.println(inches + "inches =" + meters + " meters");

        scanner.close();


    }
}