/** Sarah Wagner Week Three Assignments
   Problem 48 Bid Class **/
   
import ch02.stacks.*;
import support.LLNode;

public class Bid<T> extends LinkedStack<T>{

 
   protected String name;
   protected int maxBid;
   protected int currBid;
   
   
   public String getName(){
      return this.name;
   }
   
   public void setName(String newName){
      this.name = newName;
   }
   
   public int getMaxBid(){
      return this.maxBid;
   }
   
   public void setMaxBid(int newMaxBid){
      this.maxBid = newMaxBid;
   }
   
   public int getCurrBid(){
      return this.currBid;
   }
   
   public void setCurrBid(int newCurrBid){
      this.currBid = newCurrBid;
   }
   
   public Bid(String bidName, int curr, int max) {
      name = bidName;
      currBid = curr;
      maxBid = max;
   
    }
    
   public String toString()
   {
   
      String result = "";
      LLNode<T> holder = top;
      
      while(holder != null)
      {
         result += holder.getInfo().toString() + "\n";
         holder = holder.getLink();
      }
      
      return result ;
   } // end of toString method


   
   
}