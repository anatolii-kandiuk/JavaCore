import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userCard = randomCard();
        String computerCard = randomCard();
        String dealerCard = randomCard();
        int userMatches = 0;
        int computerMatches = 0;

        // Task 2: Explain the rules 
        System.out.println("Let's play Pokerito. Type anything when you're ready.\n" + //
                        "It's like Poker, but a lot simpler.\n" + //
                        "   • There are two players, you and the computer.\n" + //
                        "   • The dealer will give each player one card.\n" + //
                        "   • Then, the dealer will draw five cards (the river)\n" + //
                        "   • The player with the most river matches wins!\n" + //
                        "   • If the matches are equal, everyone's a winner!\n" + //
                        "   • Ready? Type anything if you are.\n");
        scan.nextLine();

        // Task 3: Present the users with a card
        System.out.println("Here's your card: \n" + userCard);
        System.out.println("Here's the computer's card:\n" + computerCard);

        // Task 4 - Draw five cards
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        for (int i = 1; i <= 5; i++) {
            scan.nextLine();
            System.out.println("Card " + i + "\n\n" + dealerCard);
            
            if (userCard.equals(dealerCard)) {
                userMatches += 1;
            } 
            if (computerCard.equals(dealerCard)) {
                computerMatches += 1;
            }

            dealerCard = randomCard();
        }

        // Task 5 - Get the winner
        System.out.println("Your number of matches: " + userMatches);
        System.out.println("Computer number of matches: " + computerMatches);
        
        if (userMatches > computerMatches) {
            System.out.println("You win!");
        } else if (userMatches < computerMatches) {
            System.out.println("The computer wins!");
        } else {
            System.out.println("Everyone wins!");
        }
        scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
    private static String randomCard() {
        switch (randomNumber()) {
            case 1:
                return "   _____\n"+
                       "  |A _  |\n"+ 
                       "  | ( ) |\n"+
                       "  |(_'_)|\n"+
                       "  |  |  |\n"+
                       "  |____V|\n";
            case 2:
                return "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";                
            case 3:
                return "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";
            case 4:     
                return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
            case 5:
                return "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            case 6:
                return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
            case 7:
                return "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            case 8:
                return "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
                return "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            case 10:
                return "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
                
            case 11:
                return "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";  
            case 12:
                return "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default:
                return null;    
        }
    }

    /**
     * Function name: randomNumber -- random number between 1 and 13
     * @return randomNumber (int)
     *
     */
    private static int randomNumber() {
        return (int)((Math.random() * 13) + 1);
    }
}
