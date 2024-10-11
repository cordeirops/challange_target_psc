import java.util.Scanner;
public class bSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = sc.nextLine();

        int count = countA(input);
        System.out.println("A letra 'a' aparece " + count + " vezes na string.");
    }
        public static int countA(String input) {
            int count = 0;
            for (char c : input.toCharArray()) {
                if (c == 'a' || c == 'A') {
                    count++;
                }
            }
            return count;
        }
    }

