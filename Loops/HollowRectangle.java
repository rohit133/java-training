package Loops;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            int n = sc.nextInt();
            int m = sc.nextInt();


            // Outter Loop
            for(int i =1;i<=n;i++){
                // Inner Loop
                for(int j=1;j<=m;j++){
                    // Cell ->(i,j)
                    if(i == 1 || j == 1 || i == n || j == m){
                        System.out.print("*");
                    }else
                    {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }

        }
    }
    
}
