import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices
      
       // STEP #1: Describe the current scenario
       System.out.println("You are at the Rockefeller Center.");
       // STEP #2: Get user command 
       command = getCommand("Do you go East(e) or North (n)?");
       // STEP #3: Select a path based on the user's command
       if (  command.equals("e") ) {
         // NEXT BRANCH...
         System.out.println("You reach St. Patrick's Cathedral.");
         command = getCommand("Want to walk around the cathedral or sit? (walk around/sit)");
         if ( command.equals("walk around") )
          System.out.println("Those stained glass windows are so beautiful! You can take a photo of it.");
       }
       else if (command.equals("n") ) {
         System.out.println("You see the Apple Store and go there.");
       }
       else {
         System.out.println("GAME OVER! You got lost in the Time Warner center shopping for hours. Press RUN to replay.");
       }


    
       
    } // END OF MAIN METHOD
    

    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       return command;
    } // END OF METHOD
 } // END OF CLASS