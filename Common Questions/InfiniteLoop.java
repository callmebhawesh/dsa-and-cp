import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {
        infinite();
    }

    static void infinite() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter any number greater than zero to start the loop");
        int n = sc.nextInt();
        if(n==0 || n<0){
            System.out.println("Please enter number greater than 0.");
        }
        while(n>0){
            System.out.println("loop is running"); 
        }   
        } finally {
            sc.close();
        }

    }
}
