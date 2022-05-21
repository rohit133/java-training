package Loops;
import java.util.*;

public class Loops{
    public static void main(String[] args) {
        try (// print the Sum of First Natural Number
            Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();

                for (int i=1;i<=10;i++)
                {
                    System.out.println(n+ "*" +i+" = "+n*i);
                }
            }
    }
}
