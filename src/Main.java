import java.util.Scanner;

public class Main {

    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter number");
        int n = inputNumber.nextInt();
        int ans = 0;
        for (int i = 0; i <= n; i++) {

            ans = fib(i);
            System.out.print(ans + " ");

        }
    }

}
