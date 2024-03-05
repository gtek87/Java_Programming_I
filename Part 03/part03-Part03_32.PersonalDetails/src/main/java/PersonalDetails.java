
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year =0;
        int lung =0;
        int count=0;
        String name= "";
        String name2="";
        while(true){
          String frase = String.valueOf(scanner.nextLine());
          if(frase.equals("")){
              break;
          }
           
          String [] list = frase.split(",");
          int len = list[0].length();
          if(len>lung){
              lung=len;
              name = String.valueOf(list[0]);
          } else if (len==lung) {
              name2=String.valueOf(list[0]);
          }
          count++;
          year=year + Integer.valueOf(list[1]);
        }
        double ave = year*1.0/count;
        System.out.print("Longest name: "+name); 
        if(!name2.equals("")){
            System.out.println(", "+name2); 
        }else{
            System.out.println("");
        }
        System.out.println("Average of the birth years: "+ave);
        


    }
}
