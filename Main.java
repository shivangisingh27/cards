//Name: Shivangi Singh
//prn no: 21070126085
//java assignment 3

//importing scanner and i/o packages
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Card> deck = Card.createDeck();
        int choice;
        do {
            System.out.println("1. Print the deck");
            System.out.println("2. Deal cards");
            System.out.println("3. Sort the deck");
            System.out.println("4. Search for a card");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
             //storing the choice entered by the user
        //switch case to perform operations based on the input given by the user.
        //there are three case in which we choose and perform operations such
            switch (choice) {
                case 1:
                    Card.printDeck(deck);
                    break;
                case 2:
                    int numCards = scanner.nextInt();
                    Card.dealCards(deck, numCards);
                    break;
                case 3:
                   
                    Card.sortDeck(deck);
                    System.out.println("Deck sorted!");
                    break;
                case 4:
                    // Prompt the user for the rank and suit of the card to
                    //search for
                    System.out.print("Enter the rank of the card (0-12): ");
                    int rank = scanner.nextInt();
                    System.out.print("Enter the suit of the card (0-3): ");
                    int suit = scanner.nextInt();
                    Card card = new Card(rank, suit);
                    // Use the findCard method to search for the card 
                    //in the deck and store its index in a variable
                    int index = Card.findCard(deck, card);
                    if (index == -1) {
                    System.out.println("Card not found in the deck!");
                    //displaying the result.
                    } else {
                    System.out.println("Card found at index " + index + " in the deck.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
             }
            System.out.println();
            } while (choice != 0);
        scanner.close();
    }
}