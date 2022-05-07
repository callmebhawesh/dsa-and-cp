import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter any number to find it's factorial");
            int number = sc.nextInt();
            for (int i = 1; i <= number; i++) {

            }
        } finally {
            sc.close();
        }
    }
}