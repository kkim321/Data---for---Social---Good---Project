import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

UserStory us = new UserStory("breed.txt", "age.txt", "color.txt", "size.txt" , "hc.txt", "af.txt");

// Print out using toString() method

// System.out.println(us);



 // Creates a variable to track the user's choice and sets it to "y"
    String choice = "y";

    // Repeats while the user's choice is not "n"
    while (!choice.equals("n")) {
      // Prompts user to choose which information to retrieve
      int option = us.giveUserOption();

      // Create if-statements for what you want to output based on choice
      if (option == 1) {
        us.findGoldenBySize();
      }

      if (option == 2) {
        us.findPoodleBySize();
      }

       if (option == 3) {
        us.findLabradorBySize();
      }
      // Asks the user if they want to search again
      choice = us.promptUserToContinue();
    }
    
    // Ends interaction
    System.out.println("Goodbye!");



    
    
    
  }
}