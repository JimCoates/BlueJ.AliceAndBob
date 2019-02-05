/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
        Scanner scanner1 = new Scanner( System.in);
        System.out.print("Enter your first name:");
        String name = scanner1.nextLine();
        
        if (name.equals("Alice")) {
            System.out.println("Hello Alice");
        } 
        else if (name.equals("Bob")) {
            System.out.println("Hello Bob");
        } 
        else {
            System.out.println("Sorry you are not Alice or Bob, goodbye");
        }
        
    }
}

