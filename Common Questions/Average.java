// Enter 3 numbers from the user and make a function to print their average.

import java.util.Scanner;

public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("We can print the average of 3 numbers.");
        System.out.println();
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        double b = sc.nextDouble();
        System.out.println("Enter the third number");
        double c = sc.nextDouble();
        System.out.println("The average of "+ a + ", " + b + ", " + c + " is "+ average(a, b, c));
        return;
    }
    public static double average(double a, double b, double c){
        return (a+b+c)/3;
    }
}