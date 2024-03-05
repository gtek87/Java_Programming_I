
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age =0;
        String older ="";
        while(true){
          String frase = String.valueOf(scanner.nextLine());
          if(frase.equals("")){
              break;
          }
          String [] list = frase.split(",");
          if(Integer.valueOf(list[1])>=age){
              age = Integer.valueOf(list[1]);
              older= String.valueOf(list[0]);
          }
        }
        System.out.println("Name of the oldest: "+older); 


    }
}
