package password_generator;

import java.util.Scanner; // Import the Scanner class
import java.util.Random; //Import the Random Class

public class PasswordGenerator {
   
   public static void main(String[] args){
   
      //create a scanner object 
      Scanner scan = new Scanner(System.in);
      
      String lower_case = "abcdefghijklmnopqrstuvwxyz";
      String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String numbers = "0123456789";
      String specialChars = "<>,.?/{}[]+-+@#$%&*()!^";
      String combination = lower_case + upper_case + specialChars + numbers;
      
      //prompt user for length of password
      System.out.println("Enter the length for your new password: ");
      int length = scan.nextInt();
      
      //create an array to store the new
      char[] password = new char[length];
      
      Random ran = new Random();
      
      for(int i = 0; i < length; i++){
         password[i] = combination.charAt(ran.nextInt(combination.length()));
      }
   }  
}
