import java.util.Scanner;

public class Diamond{
    public static void main(String[] args){


        int rows = 3;
//        upper half
        for (int i = 1; i<=rows; i++) {
            for (int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i-1); j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
//        lower half
        for (int i = rows; i>=1; i--) {
            for (int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i-1); j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}