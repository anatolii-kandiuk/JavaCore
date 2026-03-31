//import Scanner

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions. 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String username = scanner.nextLine();
                           
        System.out.println("\nHi " + username + "! I'm Javabot. Where are you from?");
        String home = scanner.nextLine();
                        
        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm " + (400 / age) + " times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        String language = scanner.nextLine();

        System.out.println("\n" + language + ", that's great! Nice chatting with you " + username + ". I have to log off now. See ya!");
        
        //close scanner. 
        scanner.close();
        
    }
}
