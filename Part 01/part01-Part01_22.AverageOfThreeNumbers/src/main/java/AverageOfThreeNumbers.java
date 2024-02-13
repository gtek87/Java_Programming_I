
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());// Write your program here
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());// Write your program here
        double ave = ((first + second + third)*1.0)/3;
        System.out.println( "The average is " + ave);

    }
}
