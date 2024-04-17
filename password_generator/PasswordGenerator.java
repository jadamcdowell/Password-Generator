package password_generator;

import java.util.Scanner; // Import the Scanner class
import java.util.Random; //Import the Random Class

public class PasswordGenerator {
   
   public static void main(String[] args){
   
      //create a scanner object 
      Scanner scan = new Scanner(System.in);
      
      //define character sets for password generation
      String lower_case = "abcdefghijklmnopqrstuvwxyz";
      String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String numbers = "0123456789";
      String specialChars = "<>,.?/{}[]+-+@#$%&*()!^";
      
      //combine character sets to form the complete set of characters for passwrod generation
      //String combination = lower_case + upper_case + specialChars + numbers;
      String combination = "";
      
      //prompt user to choose character sets
      System.out.println("Choose character sets to include in the password:");
      System.out.println("1. Lowercase letters");
      System.out.println("2. Uppercase letters");
      System.out.println("3. Numbers");
      System.out.println("4. Special Characters");
      System.out.print("Enter the numbers (seperated by spaces) corresponding to the character sets you want to include: ");
      
      //read user input for choices 
      String choices = scan.nextLine();
      
      //add selected character sets to the combination
      for(char choice : choices.toCharArray()){
         switch(choice){
            case '1':
               combination += lower_case;
               break;
            case '2':
               combination += upper_case;
               break;
            case '3':
               combination += numbers;
               break;
            case '4':
               combination += specialChars;
               break;
         }
      }
      
      //prompt user for desired length of the password
      System.out.print("Enter the length for your new password: ");
      int length = scan.nextInt();
      
      //create an array to store the new password
      char[] password = new char[length];
      
      //initialize a Random object for generating random indices
      Random ran = new Random();
      
      //generate random characters and construct the password
      for(int i = 0; i < length; i++){
         password[i] = combination.charAt(ran.nextInt(combination.length()));
      }
      
      //output new password to user
      System.out.println("\nNew Generated Password: " + new String(password));
   }  
}
