import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList()  ;
        while(true){
            String input = String.valueOf(scanner.nextLine());
            
            if (input.contentEquals("end")){
                break;
            }
            list.add(input);
        }
        System.out.println(list.size());

    }
}
