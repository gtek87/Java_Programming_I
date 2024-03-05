import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Name: ");
            String name = String.valueOf(scanner.nextLine());
            if(name.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int dur = Integer.valueOf(scanner.nextLine());
            TelevisionProgram tv = new TelevisionProgram(name,dur);
            programs.add(tv);
        }
        System.out.println("Program's maximum duration? ");
        int maxDur = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram tele: programs){
            if(tele.getDuration()<=maxDur){
                System.out.println(tele.toString());
            }
        }
    }
}
