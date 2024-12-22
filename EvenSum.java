
public class EvenSum {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 200; i += 2) {
            sum += i;
        }
        System.out.println("Sum of first 100 even numbers: " + sum);
    }
}
