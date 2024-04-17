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
      String combination = lower_case + upper_case + specialChars + numbers;
      
      //prompt user for desired length of the password
      System.out.println("Enter the length for your new password: ");
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
      System.out.println("New Generated Password: " + new String(password));
   }  
}
