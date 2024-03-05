
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] parti;
         
         
        while(true){
          String frase = String.valueOf(scanner.nextLine());
          if(frase.equals("")){
              break;
          }
          if(frase.contains("av")){
              parti = frase.split(" ");
              for(String word: parti){
                  System.out.println(word);
                  }
          }
           
        }

    }
}
