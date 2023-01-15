import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Lab2
        C5 = C=A+B
        C7 = long
        C11 = Знайти середнє значення елементів матриці
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        System.out.print("n = ");
        int n = input.nextInt();
        System.out.println("Enter the maximum number of columns of the matrix:");
        System.out.print("m = ");
        int m = input.nextInt();

        long[][] A = new long[n][];
        long[][] B = new long[n][];
        long[][] C = new long[n][];

        for (int i = 0; i < n; i++) {
            A[i] = new long[1 + (int) (Math.random() * m)];
        }

        for (int i = 0; i < n; i++) {
            B[i] = new long[1 + (int) (Math.random() * m)];
        }

        System.out.println("Jagged Array A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = -10 + (int) (Math.random() * 20);
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("Jagged Array B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = -10 + (int) (Math.random() * 20);
                System.out.printf("%5d", B[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Array C (A+B):");
        for (int i = 0; i < n; i++) {
            if (A[i].length > B[i].length) {
                C[i] = new long[A[i].length];
                for (int j = 0; j < B[i].length; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                    System.out.printf("%5d", C[i][j]);
                }
                for (int j = B[i].length; j < C[i].length; j++) {
                    C[i][j] = A[i][j];
                    System.out.printf("%5d", C[i][j]);
                }
                System.out.println();
            } else {
                C[i] = new long[B[i].length];
                for (int j = 0; j < A[i].length; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                    System.out.printf("%5d", C[i][j]);
                }
                for (int j = A[i].length; j < C[i].length; j++) {
                    C[i][j] = B[i][j];
                    System.out.printf("%5d", C[i][j]);
                }
                System.out.println();
            }
        }

        System.out.println();

        double avr = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < C[i].length; j++) {
                avr += C[i][j];
            }
        }
        System.out.println("Average of matrix C: " + avr / (n * m));
    }
}
