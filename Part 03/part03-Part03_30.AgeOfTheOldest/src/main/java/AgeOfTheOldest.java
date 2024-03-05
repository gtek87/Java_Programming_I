
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age =0;
        while(true){
          String frase = String.valueOf(scanner.nextLine());
          if(frase.equals("")){
              break;
          }
          String [] list = frase.split(",");
          if(Integer.valueOf(list[1])>=age){
              age=Integer.valueOf(list[1]);    
          }
        }
        System.out.println("Age of the oldest: "+age); 

    }
}
