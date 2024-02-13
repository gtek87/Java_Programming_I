
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());// Write your program here
        
        int sum = first + second;
        int diff = first - second;
        int mol = first * second;
        double div = first*1.0 / second;
        
        
        System.out.println( first +" + " + second + " = " + sum);
        System.out.println( first +" - " + second + " = " + diff);
        System.out.println( first +" * " + second + " = " + mol);
        System.out.println( first +" / " + second + " = " + div);
    }
}
