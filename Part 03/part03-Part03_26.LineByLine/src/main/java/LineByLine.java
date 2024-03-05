
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] parti;
         
         
        while(true){
          String frase = String.valueOf(scanner.nextLine());
          if(frase.equals("")){
              break;
          }
          parti = frase.split(" ");
          for(String word: parti){
                System.out.println(word);
            } 
        }
    }
}
