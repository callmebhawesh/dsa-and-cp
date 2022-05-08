// write a program to enters the number till the users wants and at the end it should display the count of positive , negative, and zeros entered.

import java.util.Scanner;

public class UserOriented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the total numbers you want to check");
            int numbers = sc.nextInt();
            int count_positive = 0;
            int count_negative =0;
            int zero_numbers = 0;
            int[] eachNumbers = new int[100];
            System.out.println("Enter all numbers");

            for (int i=1; i<=numbers; numbers++){
                eachNumbers[i] = sc.nextInt();
                if (eachNumbers[i]>0){
                count_positive = count_positive+1;
            } else if (eachNumbers[i]<0) {
                count_negative = count_negative+1;
            }
            else {
                zero_numbers = zero_numbers+1;
            }
            }
            System.out.println("Total positive numbers are  "+count_positive);
            System.out.println("Total negative numbers are  "+count_negative);
            System.out.println("Total zero's are  "+zero_numbers);

            

        }
        finally {
            sc.close();
        }
    }
}
