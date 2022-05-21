package Loops.Partten;

import java.util.Scanner;

public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            int n = sc.nextInt();

            // Outer loop
            for(int i=1; i<=n; i++){
                // Inner Loop
                for(int j=1; j<=n-i+1; j++){
                    System.out.print(j);
                }
                System.out.println();
            }

        }
    }
    
}
