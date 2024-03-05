 
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File? ");
        String file = scanner.nextLine();
        int age =0; 
        try (Scanner scan = new Scanner(Paths.get(file))){
            
            while(scan.hasNextLine()){
                String list = scan.nextLine();
                String[] parts = list.split(",");
                String name = parts[0];
                age = Integer.valueOf(parts[1]);
                if(age!=1){
                    System.out.println(name +", age: "+age+" years");
                }else{
                    System.out.println(name +", age: "+age+" year");
                }
                
            }
             
        }
         catch (Exception e) {
             System.out.println("Reading the file " + file + " failed.");
         }
        

        

 
    }
}
