import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter minutes");

        long minutes = scanner.nextLong();

        long years = minutes / (24 * 60 * 365);
        long days = (minutes %(60 * 24 * 365)) / (60*24);



        System.out.println(minutes + " minutes = " + days + " days and " + years + " years");

        scanner.close();
    }
}
