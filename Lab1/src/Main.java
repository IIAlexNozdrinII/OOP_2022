import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Lab1
        C2 = -
        C3 = 0
        C5 = %
        C7 = char
        */

        final int C = 0;
        Scanner input = new Scanner(System.in);
        int a, b, n, m;
        System.out.println("Enter lower limit \"a\" and \"b\":");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Enter upper limit \"n\" and \"m\":");
        n = input.nextInt();
        m = input.nextInt();

        if (n < a) {
            System.out.println("Please enter correct value of \"n\"!");
            n = input.nextInt();
        }
        if (m < b) {
            System.out.println("Please enter correct value of \"m\"!");
            m = input.nextInt();
        }

        if (b <= 0 && m >= 0 || a <= C && C <= n) {
            System.out.println("Error! (Division by zero)");
        } else {
            double res = 0;
            int den;
            for (char i = (char) a; i <= n; i++) {
                den = i - C;
                for (char j = (char) b; j <= m; j++) {
                    res += (double) (i % j) / den;
                }
            }
            System.out.println("Result = " + res);
        }
    }
}
