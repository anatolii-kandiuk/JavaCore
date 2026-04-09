import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        Scanner scan = new Scanner(System.in);
        double savings = 0;
        double debt = 0;
        int years = 0;
        String name = "";
        
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String decision = scan.nextLine();

        //Task 2 - Print this if the decision is "yes"
        switch (decision) {
            case "yes":
                // Task 3 - Pick up each value 
                System.out.println("\nGreat! In one line" +
                                    "\nHow much money do you have in your savings?" +
                                    "\nAnd, how much do you owe in credit card debt?");
                savings = scan.nextDouble();
                debt = scan.nextDouble();
                scan.nextLine(); // Consume the newline character
                
                // Task 4 - Pick up number of years
                System.out.println("\nHow many years have you worked for?");
                years = scan.nextInt();
                scan.nextLine();

                // Task 5 - Pick up the user's name
                System.out.println("What is your name?");
                name = scan.nextLine();
                
                break;
            case "no":
                //Task 2 - Print this if the decision was not "yes"
                System.out.println("\nOK. Have a nice day!");
                break;
            default:
                System.out.println("\nThat's not a valid answer.");
                break;
        }
        //Task 6 - Approve the mortgage if they meet the requirements (see article)
        //       - Otherwise, don't give them a mortgage.     
        if (savings >= 10000 && debt <= 5000 && years >= 2) {
            System.out.println("\nCongratulations " + name + " You have been approved!");
        } else {
            System.out.println("\nSorry, you are not eligible for a mortgage.");
        }
        scan.close();
    }
}
