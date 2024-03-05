
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        int small = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number < small) {
                small = number;
            }   
        }
        System.out.println("Smallest number: " + small);
        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number == small) {
                
                System.out.println(small+" is at index "+i);
            }
        }
            
        
        
    }
}
