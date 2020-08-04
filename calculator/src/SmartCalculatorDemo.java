import java.util.Scanner;

public class SmartCalculatorDemo {
    public static void main(String[] args) {
        int finalNumbers[] = new int[2];
        int sum = 0;
        System.out.println("Please enter the numbers you want to add");
        Scanner enter = new Scanner(System.in);
        String input = enter.nextLine();

        while (!input.equals("exit")) {
            input = input.trim();
            String numbers[] = input.split("\\s+");
            for (int i = 0; i < numbers.length; i++) {
                finalNumbers[i] = Integer.parseInt(numbers[i]);

            }
            for (int i = 0; i < finalNumbers.length; i++) {
                sum += finalNumbers[i];
            }
            System.out.println("Their sum is " + sum);
            sum = 0;
            System.out.println("Please enter the numbers you want to add");
            input = enter.nextLine();
        }
        System.out.println("Bye Bye!");
        System.exit(0);
    }
}
