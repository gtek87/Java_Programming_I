
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
        ArrayList<Integer> capo = new ArrayList<>();
        int lun = numbers.size();
        for (int i=lun-1;i>=0;i--){
            capo.add(numbers.get(i));   
        }
        for (int x=0;x<lun;x++){
            System.out.println(capo.get(x));
        }

    }
}
