
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int value = 0;
        if (number1>=number2){
            if(number1>=number3){
                value = number1;
            } else{
                value = number3;
            }
        } else if (number2>=number1){
            if(number2>=number3){
                value= number2;
            } else{
                value= number3;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
