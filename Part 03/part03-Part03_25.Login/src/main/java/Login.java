
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String mail = String.valueOf(scanner.nextLine());
        
        if (mail.equals("alex") || mail.equals ("emma")){
            
            if (mail.equals("alex")){
                System.out.print("Enter password: ");
                String pass = String.valueOf(scanner.nextLine());
                if (pass.equals("sunshine")){
                    System.out.print("You have successfully logged in!");
                }else{
                    System.out.print("Incorrect username or password!");
                }
            }else if(mail.equals("emma")){
                
                System.out.print("Enter password: ");
                String pass = String.valueOf(scanner.nextLine());
                if (pass.equals("haskell")){
                    System.out.print("You have successfully logged in!");
                }else{
                    System.out.print("Incorrect username or password!");
                }
                
            }else{
                System.out.println("Incorrect username or password!");
            }
              
        }else{
            System.out.println("Incorrect username or password!");
        }

    }
}
