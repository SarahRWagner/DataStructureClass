/** Sarah Wagner Week Seven Assignments
   Problem 24 FamousPerson Class
   Hi Jason! For this I used the FamousPerson2 class because it had the hashCode method written in already. **/

import ch08.apps.*;
import ch08.maps.*;
import java.io.File; 
import java.util.Scanner; 
import java.util.Arrays;

public class FamousPersonHashCodes 
{
  public static void main(String[] args) throws Exception
  {
   //Read the file
   File file = 
      new File("C:\\Users\\sarah\\Documents\\FamousCS.txt"); 
    Scanner sc = new Scanner(file); 
    
    //Keeps track of each person created
    int count = 0;
    
    //Holds the FamousPerson2 objects
    FamousPerson2[] famousArray = new FamousPerson2[25];
    
    // Each array will hold the hashes at various mods
    int[] peopleHashes = new int[25];
    int[] peopleHashes1000 = new int[25];
    int[] peopleHashes100 = new int[25];
    int[] peopleHashes10 = new int[25];
    
    while (sc.hasNextLine()) //While there's still text
    {
      String data = sc.nextLine();
      String[] personArray = data.split(",", 4); // Split the string lines into the parts seperated by commas
      
      //The personArray holds the various parts of the string line
      String first = personArray[0];
      String last = personArray[1];
      int yob = Integer.parseInt(personArray[2]);
      String descrip = personArray[3];
      
      // Feeds the array through the constructor to create the person object
      FamousPerson2 person = new FamousPerson2(first, last, yob, descrip);
      
      //Count the person
      count++;
      
      // Add the person and hashcodes into the various arrays
      famousArray[count] = person;
      peopleHashes[count] = person.hashCode();
      peopleHashes1000[count] = person.hashCode();
      peopleHashes100[count] = person.hashCode();
      peopleHashes10[count] = person.hashCode();
        
    } // end of while loop
   
   Arrays.sort(peopleHashes); // Sort the original hashes
   System.out.println("Here's the hashes sorted: ");
   for(int i = 0; i < peopleHashes.length; i++)
   {
      System.out.println(peopleHashes[i]);
   }
   
   // Mod 1000 each value in the array
   for(int i = 0; i < peopleHashes.length; i++)
   {
      peopleHashes1000[i] = peopleHashes1000[i] % 1000; 
   }
   
   // Sort the % 1000 values
   Arrays.sort(peopleHashes1000); 
   System.out.println("Here's the hashes % 1000 sorted: ");
   for(int i = 0; i < peopleHashes1000.length; i++)
   {
      System.out.println(peopleHashes1000[i]);
   }
   
   //Mod 100 each value in the array
   for(int j = 0; j < peopleHashes100.length; j++)
   {
      peopleHashes100[j] = peopleHashes100[j] % 100;
   }
   
   // Sort the % 100 values
   Arrays.sort(peopleHashes100); 
   System.out.println("Here's the hashes mod % 100 sorted: ");
   for(int i = 0; i < peopleHashes100.length; i++)
   {
      System.out.println(peopleHashes100[i]);
   }
   
   //Mod 10 each value in the array
   for(int k = 0; k < peopleHashes10.length; k++)
   {
      peopleHashes10[k] = peopleHashes10[k] % 10;
   }
   
   // Sort the %10 values 
   Arrays.sort(peopleHashes10);
   System.out.println("Here's the hashes % 10 sorted: ");
   for(int i = 0; i < peopleHashes10.length; i++)
   {
      System.out.println(peopleHashes10[i]);
   } 
    
   
  } // end of main

} // end of program

/*

What I noticed in the hashes is in the differet mods is each level of mod shows the last few digits of the orginal hash, but the
number gets smaller was the mod amount gets smaller.

Here's the hashes sorted: 
 0
 0
 2268929
 69640015
 405148896
 429955787
 430202017
 552637448
 572490380
 911257480
 1038687573
 1050600967
 1054383946
 1082160040
 1403214279
 1521908857
 1568748212
 1801550723
 1898099354
 1948775966
 1960658654
 2019100524
 2024328856
 2057502244
 2096033344
 Here's the hashes % 1000 sorted: 
 0
 0
 15
 17
 40
 212
 244
 279
 344
 354
 380
 448
 480
 524
 573
 654
 723
 787
 856
 857
 896
 929
 946
 966
 967
 Here's the hashes mod % 100 sorted: 
 0
 0
 12
 15
 17
 23
 24
 29
 40
 44
 44
 46
 48
 54
 54
 56
 57
 66
 67
 73
 79
 80
 80
 87
 96
 Here's the hashes % 10 sorted: 
 0
 0
 0
 0
 0
 2
 3
 3
 4
 4
 4
 4
 4
 5
 6
 6
 6
 6
 7
 7
 7
 7
 8
 9
 9
 
 /*