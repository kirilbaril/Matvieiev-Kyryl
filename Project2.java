import java.util.Scanner;

public class Project2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int min = number1;
        if(min > number2) {
            min = number2;
        }
        else if (min > number3) {
            min = number3;
        }
        else if (min > number4){
            min = number4;
        }
        System.out.println(min);
    }
}