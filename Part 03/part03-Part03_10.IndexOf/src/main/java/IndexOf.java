
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.print("Search for? ");
                break;
            }

            list.add(input);
        }

        System.out.println("");
        
        int input2 = Integer.valueOf(scanner.next());
        
        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number == input2) {
                System.out.println(input2+" is at index "+i);
            }
        }
            
                
    }
}
