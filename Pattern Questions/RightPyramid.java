import java.util.Scanner;

public class RightPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        for(int i=1; i<=userInput; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}