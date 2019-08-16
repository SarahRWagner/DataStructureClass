/** Sarah Wagner Week Four Assignments
   Problem 2 Recursive Examples Class **/
 
import java.util.Scanner;  // Import the Scanner class

public class RecursionExample
 {
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);  // Create a Scanner object
       
       
       while(true) // Loops through to continuously ask user for input
       {
       
         System.out.println("Would you like to continue? (Y or N): ");
         String choice = scanner.nextLine();
       
          if(choice.equalsIgnoreCase("Y"))
          {
                System.out.println("Enter a number: ");
                String num = scanner.nextLine();  // Read user input
                int number = Integer.parseInt(num); 
                 
                int sum = Sum(number);
                System.out.println("Answer = " + sum);
                
                int powersum = BiPower(number);
                System.out.println("Answer = " + powersum);
                
                int fivesum = TimesFive(number);
                System.out.println("Answer = " + fivesum);
                
                continue;
          } // end of if
          else if(choice.equalsIgnoreCase("N"))
          {
            System.out.println("Farewell");
            
            break;
          } // end of else if
          else
          {
            System.out.println("Please enter a valid answer!");
            continue;
           
          } // end of else
       } // end of while loop
       
} // end of main method


    public static int Sum(int N) 
    {
        if (N != 0)
            return N + Sum(N - 1);
        else
            return N;
    } // end of Sum method
    
    public static int BiPower(int N) 
    {
        if (N != 0)
            return 2*BiPower(N-1);
        else
            return 1;
    } // end of BiPower method
   
   public static int TimesFive(int N)
   {
      if(N != 0)
         return 5*N;
      else
         return 0;
   
   } // end of TimesFive method
      
    
} // end of class