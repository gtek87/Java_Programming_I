import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> libri = new ArrayList<>(); 
        Scanner scann = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String title = String.valueOf(scann.nextLine());
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pag = Integer.valueOf(scann.nextLine());
             
            System.out.println("Publication year: ");
            int yea = Integer.valueOf(scann.nextLine());
            
            Book volume = new Book(title,pag,yea);
            libri.add(volume);
        }
        System.out.println("What information will be printed? ");
        String info = String.valueOf(scann.nextLine());
        if (info.contains("name")){
            for(Book copie: libri){
                System.out.println(copie.getTitle());
            }
        } else if(info.contains("everything")){
            for(Book copie: libri){
                System.out.println(copie.toString());
            }
        }

    }
}
