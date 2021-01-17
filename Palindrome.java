import java.util.*;

 public class Palindrome
{
   public static void main(String [] args)
   {
      String orginal, reverse =""; // Objects of String class
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to chect if it is a palindrome");
      orginal = in.nextLine();
      int length = orginal.length();
      
      for(int i = length-1; i>=0; i--)
      reverse = reverse + orginal.charAt(i);
      
      
      if(orginal.equals(reverse))
        System.out.println("the string is a palindrome.");
        else
        System.out.println("the string isn't a palindrome");
      
      
   
   
   
   
   }




}