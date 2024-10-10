import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Nth term: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        int sum = a + b;


        int count = 2;


        while (count < n) {
            int next = a + b;
            sum += next;
            b = next;
            count++;
        }


        System.out.println("Sum of Fibonacci series up to term " + n + " is: " + sum);
    }
}


