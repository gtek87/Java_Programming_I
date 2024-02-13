
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            if (num>0){
                sum = sum + num;
                counter = counter +1;
            }  
        }
        if (sum==0){
            System.out.println("Cannot calculate the average" );
        } else{
            ave = sum*1.0/counter;
            System.out.println(ave);  
        }
         
    }
}
