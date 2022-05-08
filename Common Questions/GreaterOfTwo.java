
// write a function which takes in 2 numbers and returns the greater of those two
import java.util.Scanner;

public class GreaterOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of a");
            int a = sc.nextInt();
            System.out.println("Enter the value of b");
            int b = sc.nextInt();
            if(a>b){
                System.out.println("The value of a is greater which is " + a);
            } else{
                System.out.println("The value of b is greater then a which is " + b);
            }
        } finally {
            sc.close();
        }
    }
}
