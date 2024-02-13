
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Value of the gift?");
        int x = Integer.valueOf(scan.nextLine());
 
        
        if (x<5000) {
            System.out.println("No tax!");
        } else if (x<25000) {
            double tax = (100 + (x - 5000)*0.08);
            System.out.println("Tax: "+ tax);
             
        } else if (x<55000) {
            double tax = (1700 + (x - 25000)*0.10);
            System.out.println("Tax: "+ tax);
        } else if (x<200000) {
            double tax = (4700 + (x - 55000)*0.12);
            System.out.println("Tax: "+ tax);
        } else if (x<1000000) {
            double tax = (22100 + (x - 200000)*0.15);
            System.out.println("Tax: "+ tax);
        } else if (x>1000000) {
            double tax = (142100 + (x - 1000000)*0.17);
            System.out.println("Tax: "+ tax);
        }

    }
}
