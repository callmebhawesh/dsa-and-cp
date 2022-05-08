// Write a function to find the factorial fo n numbers

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter any number to find it's factorial");
            Long number = sc.nextLong();
            if (number == 0) {
                System.out.println("The factorial of 0 is 0");
            } else {
                Long total = 1l;
                for (Long i = 2l; i <= number; i++) {
                    total = total * i;
                }
                System.out.println("The factorial of " + number + " is " + total);
            }

            
        } finally {
            sc.close();
        }
        return;
    }
}
