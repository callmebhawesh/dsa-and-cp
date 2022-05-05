import java.util.Scanner;

public class Diamond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of rows");
        System.out.print("=> ");
        int rows = sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=rows; i>=0; i--){
            for (int j = 1; j<=rows; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}