import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       
       int secretNuber = 3;
       int number = scan.nextInt();
        
       while (number != secretNuber ) {
            System.out.print("Guess again: ");
            number = scan.nextInt();
       }

       System.out.println("You got it!");
       scan.close();
    }

}
