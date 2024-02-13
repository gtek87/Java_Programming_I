
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum=0;
        double ave = 0;
        while (true){
             
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num==0){
                break;
            } 
            sum = sum + num;
            counter = counter +1;
           
        }
        ave = sum*1.0/counter;
        System.out.println("Average of the numbers: "+ave);
         

    }
}
