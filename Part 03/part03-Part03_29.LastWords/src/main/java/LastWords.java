
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
          String frase = String.valueOf(scanner.nextLine());
          if(frase.equals("")){
              break;
          }
          String [] list = frase.split(" ");
           
          System.out.println(list[list.length -1]); 
        }


    }
}
