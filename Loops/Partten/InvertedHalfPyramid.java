package Loops.Partten;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in);){

            int n = sc.nextInt();
            
            // Outter Loop
            for(int i=n; i>=1 ;i--){
                // Inner Loop
                for(int j=1; j<=i ;j++){
                    System.out.print("*");
                }
            System.out.println();
            }
        }
    }
    
}
