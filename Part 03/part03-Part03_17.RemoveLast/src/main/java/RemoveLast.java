
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    public static void removeLast(ArrayList<String> strings){
        
        if (!strings.isEmpty()) {

            int last = strings.size() - 1;

            strings.remove(last);

        }
        
        
    }
}
