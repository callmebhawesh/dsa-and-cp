// write a function that takes in age as a input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        check();
    }

    static boolean check() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your age");
            int age = sc.nextInt();
            if (age>18) {
                System.out.println("You're elgible to vote.");
                return true;
            } else {
                System.out.println("You're not eligible to vote.");
                return false;
            }
        } finally {
            sc.close();
        }
    }
}
