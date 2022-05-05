import java.util.Scanner;

public class Gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        solution(a, b);
    }
    public static double solution(int a, int b){
        System.out.println("The GCD of "+a+" and "+b+" is " );
        
    }
}
