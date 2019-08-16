/** Sarah Wagner Week Three Assignments
   Problem 48 Auction Driver Class 
   Hi Jason, this will compile, but I realize it has many flaws in the program. I thought I had
   the logic down, but when I translated into code I realize now it's not working exactly
   how the assignment asks. I've left the iterations of this that I attempted, and what I ended up with. 
   I realize this will probably need to be revised...**/
   
import ch02.stacks.*;
import support.LLNode;
import java.util.Scanner; 

public class Auction {   
   public static void main(String[] args) {
   
   
       Scanner scanner = new Scanner(System.in);  // Create a Scanner object
       LinkedStack<Bid> bidStack = new LinkedStack <Bid>(); // Create the stack with Bid objects
       Bid newBid = new Bid("test", 0, 0);
       
       while( ! scanner.equals("stop")) // While user input doesn't equal stop
       { 
          System.out.print("Enter the name of the bidder (stop to exit): ");
          String name = scanner.nextLine();  // Read user input
          
          System.out.print("Enter the max bid: "); // User enters max bid
          String userMaxBid = scanner.nextLine();
          int maxBid = Integer.parseInt(userMaxBid); // Parse out the input to an int
          newBid = new Bid(name, 1, maxBid);

          if (bidStack.isEmpty()){ // Check if the stack is empty, if it is then this is the first bid
             // Create bid object, starts at 1
            bidStack.push(newBid); // Push on to stack
          } // end of if statment
          else
          {
            Bid previousBid = bidStack.top(); // The bid on top of the stack is stored in previousBid
            newBid = new Bid(name, previousBid.getCurrBid() + 1, maxBid);
            
            if(newBid.getMaxBid() > previousBid.getMaxBid())
            {
               bidStack.push(newBid);
               newBid.setCurrBid(newBid.getCurrBid() +1);
            } // end of if
            else if(newBid.getMaxBid() < previousBid.getMaxBid())
            {
               previousBid.setCurrBid(previousBid.getCurrBid() +1);
               bidStack.push(newBid);
            } // end of else if
            else{
               System.out.println("Error! Bids cannot be equal!");
               continue;
            } // end of else
            
         System.out.println("Keep going? Y or N");
         
         String ans = scanner.next();
            
         if(ans.equals("N"))
         {
          while(!bidStack.isEmpty())
               {
                  System.out.println(bidStack.top());
                  bidStack.pop();
               }
          break;
         } 
         
         else if(ans.equals("Y"))
         {
            continue;
         } 
         
         else if(!ans.equals("Y") || !ans.equals("N"))
         {
            System.out.println("Invalid input");
         }

          } // end of outer else
          
        
     } // end of while loop
     
  //Logic written in English:
   
// Constants Bid starts at $1, maxBid can never change
// 
// do your scanner stuff
// build a bid obj and stack
// 
// while userInput !stop
//     create a new bidder, with a max bid
//     compare new bidder to previous bidder
//         if newBidder > previousBidder
//             newBidder is pushed on top of stack
//             if newBidderMax < previousBidderMax
//                 previousBidder is pushed to top +1 of newBidder
//         else
//             newBidder is thrown away
// print stack
       
       
       
       
       
  //Previous attempt: 
       
//        Bid newBid = null; // Create new bid Object
//        System.out.print("Enter the name of the bidder (stop to exit): ");
//        String name = scanner.nextLine();  // Read user input
//        
//        bidStack.top();
//        while( ! name.equalsIgnoreCase("stop")) { // While user input doesn't equal stop
//           System.out.println("Enter the max bid: "); // User enters max bid
//           String userMaxBid = scanner.nextLine();
//           int maxBid = Integer.parseInt(userMaxBid); // Parse out the input to an int
//           
//           if (bidStack.isEmpty()){ // Check if the stack is empty, if it is then this is the first bid
//             newBid = new Bid(name, 1, maxBid); // Create bid object, starts at 1
//             bidStack.push(newBid); // Push on to stack
//           }
//           else { // Otherwise, there has already been a bid
//             Bid previousBid = bidStack.top(); // The bid on top of the stack is stored in previousBid
//             if(previousBid.getMaxBid() <= maxBid()){ // if the bid on top of the stack is less than the current max bid
//                newBid = new Bid(name, previousBid.getMaxBid() + 1, maxBid); // Create a new bid, but with plus one of the previous bid
//                bidStack.push(newBid); //              
//             } 
//             else if (maxBid > previousBid.getCurrBid()){
//                newBid = new Bid(previousBid.getName(), maxBid, previousBid.getMaxBid());
//                bidStack.push(newBid);              
//             }
//           }               
//           System.out.print("Enter the name of the bidder (stop to exit): ");
//           String name = scanner.nextLine();  // Read user input   
//        }
//        while (! bidStack.isEmpty()) {
//          
//        }
//      
     
         
    } // end of main method
} // end of program