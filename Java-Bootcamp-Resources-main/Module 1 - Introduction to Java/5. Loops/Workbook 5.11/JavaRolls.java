import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int diceRoll;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();

        System.out.println("Great, here are the rules:");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        scan.nextLine();

        while (true) {
            diceRoll = rollDice();
            System.out.print("You rolled a " + diceRoll + "\n");

            if (diceRoll == 6) {
                System.out.println("End of game.");
                break;
            } else if (diceRoll == 4) {
                System.out.println("Zero points. Keep rolling.");
                continue;
            } else {
                System.out.println("One point. Keep rolling");
                score += 1;
            }
            scan.nextLine();
        }

        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }
    }
        /**
     * Function name: rollDice -- rolls a dice between 1 and 6
     * @return randomNumber (int)
     *
     */
    private static int rollDice() {
        return (int)((Math.random() * (7 - 1)) + 1);
    }

}
