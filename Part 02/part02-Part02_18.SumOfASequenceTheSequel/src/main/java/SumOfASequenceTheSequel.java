
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int num2 = Integer.valueOf(scanner.nextLine());
        int sum = 0; 
        for (int i=num;i<=num2;i++){
            sum = sum +i;    
        }
        System.out.println("The sum is "+sum);

    }
}
