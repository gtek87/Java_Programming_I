
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1+number2+number3+number4;
        return sum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int a = number1;
        int b = number2;
        int c = number3;
        int d = number4;
        int somma = sum(a,b,c,d);
        double ave = somma*1.0/4;
        return ave;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
