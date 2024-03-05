
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        System.out.println("Which file should have its contents printed?");
        Scanner scann = new Scanner(System.in);
        String reserch = String.valueOf(scann.nextLine());
        try (Scanner scanner = new Scanner(Paths.get(reserch))) {
            

    // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
