package Loops;
import java.util.Scanner;


public class SolidRectangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Outer Loop
            for(int i=1;i<=n;i++){
                // inner loop
                for(int j=1;j<=m;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}