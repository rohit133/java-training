package Loops.Partten;

import java.util.Scanner;

public class triangle01 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            int n = sc.nextInt();
             // Outter Loop
            for(int i=1; i<=n; i++){
                // Inner Loop
                for(int j=1; j<=i; j++){
                    if((i+j)%2 == 0){
                        System.out.print("1"+" ");
                    }else{
                        System.out.print("0"+" ");
                    }
                }
                System.out.println();
            }
        }
    }
    
}
