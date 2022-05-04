// write a function to print the sum of all odd numbers from 1 to n

import java.util.Scanner;

public class SumOdd{
    public static void main(String[] args){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        for(int i=1; i<=number; i++){
            if((i % 2) == 1) {
                sum += i;
            }
        }
        System.out.println("The sum of number from 1 to "+ number + " is "+ sum);
    }
}