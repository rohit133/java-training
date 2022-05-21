package Loops.Partten;

import java.util.Scanner;

public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in);){

            int n = sc.nextInt();
            
            // Outter Loop
            for(int i=1;i<=n;i++){
                // inner loop for Spaces 
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // inner loop for Star 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
    
}
