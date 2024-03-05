
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        
        Statistics obj = new Statistics(); 
// Test your Multiplier class here

        // Multiplier multiplyByThree = new Multiplier(3);

        // System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        // Multiplier multiplyByFour = new Multiplier(4);

        // System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        // System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        // System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers:");
         
        while(true){
            int input =Integer.valueOf(scan.nextLine());
            if (input==-1){
                break;
            }  
            
        }
        
    }
}
