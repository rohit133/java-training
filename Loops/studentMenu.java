package Loops;
import java.util.*;

public class studentMenu {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int userInput;
            do{
                

                int marks = sc.nextInt();
                if(marks>=90)
                    System.out.println("This is Good");
                else if(marks>=89 && marks >=60)
                    System.out.println("This is also Good");
                else if(marks>=59 && marks >=0)
                    System.out.println("This is Good as well");
                System.out.println("Do you Want to Continue");
                userInput = sc.nextInt();
            }while(userInput == 1);
        }

    }
    
}
