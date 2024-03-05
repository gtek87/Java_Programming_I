import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList <String>  list = new ArrayList <>();
        int counter = 0; 
        try (Scanner scan = new Scanner(Paths.get(file))){
            
            while(scan.hasNextLine()){
         
                list.add(scan.nextLine());    
            }
             
            for (String voci : list){
                int numero = Integer.valueOf(voci);
                if(numero<=upperBound && numero>=lowerBound){
                    counter += 1;
                }
            }
            System.out.println("Numbers: "+ counter);
             
              
        }
         catch (Exception e) {
             System.out.println("Reading the file " + file + " failed.");
         }
    }

}
