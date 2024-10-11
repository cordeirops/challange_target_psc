import java.util.Scanner;
public class aFirst {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Informe um número: ");
            int num = sc.nextInt();

            if (isFibonacci(num)) {
                System.out.println(num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(num + " não pertence à sequência de Fibonacci.");
            }
        }

        public static boolean isFibonacci(int n) {
            int a = 0, b = 1;
            if (n == 0 || n == 1) {
                return true;
            }
            int sum = 0;
            while (sum < n) {
                sum = a + b;
                a = b;
                b = sum;
            }
            return sum == n;
        }
    }
