

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        

        //System.out.print("Search for? ");
        int input1 = Integer.valueOf(scanner.nextLine());
         
        int num = 0; 
        boolean bo =false;
        for (int i = 0;i< array.length;i++) {
            if (input1==array[i]){
                System.out.println(input1 + " is at index "+i+".");
                bo = true;
            }
            
        }
        if (!bo) {
            System.out.println(input1 + " was not found.");
        }
        
        
    }

}
