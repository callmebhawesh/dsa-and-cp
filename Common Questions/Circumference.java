import java.util.Scanner;

// write a function that takes in radius as input and return the circumference of the circle
public class Circumference {
    public static void main(String[] args){
        solution();
    }   
    public static double solution(){
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        try{
            System.out.println("Enter the radius of the circle");
            double radius = sc.nextDouble();
            double answer = 2*PI*radius;
            System.out.println("The circumference of the circle is "+answer);
            return answer;
        } finally{
            sc.close();
        }
    }
}
