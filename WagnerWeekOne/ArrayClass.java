/**
 * @author Sarah Wagner
 * @version 1.0
 * This is the homework assignment for week one of CompSci 112. It focuses on algorithms and arrays.
 */

import java.util.Random;
import java.util.Scanner;

public class ArrayClass {

    public static void main(String[] args) {

        // ***********************
        // For each item below you must code the solution. You may not use any of the
        //  methods found in the Arrays class or the Collections classes
        //
        String spacebar= "---------------";
        String[] myData; // declaring the array of Strings
//**********************************************************************************************************************
        // 1. Instantiate the given array to hold 10 Strings.
        myData = new String[10];

//**********************************************************************************************************************
        // 2. Add your name to the Array at index 0 and a friend's name to the Array at index 4
        myData[0] = "Sarah";
        myData[4] = "Kevin";

//**********************************************************************************************************************
        // 3. Move your friend's name to index 0 in the array and "delete" their name from index 4
        myData[0] = myData[4]; // moving 4 to 0

        int removeIndex = 4; // the index I want to remove
        for (int i = removeIndex; i < myData.length - 1; i++) // move through the indexes from 4
        {
            myData[i] = myData[i + 1]; // shift the values of those indexes over
        } // end of for loop

//**********************************************************************************************************************
        // 4. Fill up all of the remaining indexes in the array with more names
        myData[1] = "Justin";
        myData[2] = "Sean";
        myData[3] = "Christopher";
        myData[4] = "Jake";
        myData[5] = "Joe";
        myData[6] = "Will";
        myData[7] = "Alex";
        myData[8] = "Shavil";
        myData[9] = "Mark";

//**********************************************************************************************************************
        // 5. Swap the values at index 5 and index 1
        String holder = myData[5]; // temp variable holds the 5 value
        myData[5] = myData[1]; // switch 5 to 1's value
        myData[1] = holder; // put 1's value where 5 was

//**********************************************************************************************************************
        // 6. Print the array from beginning to end.
        for (int i = 0; i < myData.length; i++) // loop through all indexes
        {
            System.out.println(myData[i]); // print out each index value
        } // end of for loop
        System.out.println(spacebar); // Makes it easier to read in console for now

//**********************************************************************************************************************
        // 7. Shuffle the array of strings
        for (int i = 0; i < myData.length; i++) // loop through all indexes
        {
            int index = (int) (Math.random() * myData.length); // generate a random number within the index values
            String hold = myData[i]; // hold the value of the current index
            myData[i] = myData[index]; // switch the value of the current index to the random index
            myData[index] = hold; // place the current index value to the random index number
        } // end of for loop
        for (int i = 0; i < myData.length; i++) // loop through all indexes
        {
            System.out.println(myData[i]); // print the shuffled array
        } // end of for loop
        System.out.println(spacebar); // // Makes it easier to read in console for now

//**********************************************************************************************************************
        // 8. Find and print the longest and shortest Strings in the array
        int longest = myData[0].length(); // set the longest index to the first index for now
        String longString = myData[0]; // hold the string value of that index

        int shortest = myData[0].length(); //set the shortest to the first value for now
        String shortString = myData[0]; // hold the string value of that index

        for(int i=1; i < myData.length; i++) // bump up to 1 because we need to compare to 0, then loop through
        {
            if(myData[i].length() > longest) // if the current i is bigger than the longest value
            {
               longest = myData[i].length(); // then longest equals the current index
               longString = myData[i]; // the longest string is set
            } // end of if
            if(myData[i].length() < shortest) // if the current i is less than the shortest value
            {
                shortest = myData[i].length(); // then shortest equals the current index
                shortString = myData[i]; // the shortest string is set
            } // end of if

        } // end of for loop

        System.out.println("The longest string is: " + longString + "\nThe shortest string is: " + shortString);

        System.out.println(spacebar);

//**********************************************************************************************************************
        //9. Add up the total number of characters in all of the strings in the array and print the answer
        int count = 0; // keep track of chars
        for(int i = 0; i < myData.length; i++) // loop through indexes
        {
            count += myData[i].length(); // go through each name and add the chars to count
        } // end of for loop
        System.out.println(count); // total chars in the array

        System.out.println(spacebar);

//**********************************************************************************************************************
        // 10. Prompt the user for a String and then perform a linear search of the array
        //  to see if that string is or is not in the array. Print if it is or is not found.
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a String to search for: ");

        String searchName = myObj.nextLine();  // Read user input
        boolean foundNotfound = true; // does it find the user's input or not

        for(int i = 0; i < myData.length; i++) // loop through the indexes
        {
            if(myData[i].equals(searchName)) // if the user input matches the names on the list
            {
                foundNotfound=true; // set boolean value true
            } // end of if
            else // if the user input doesn't match the list
            {
                foundNotfound=false; // set boolean value false
            } // end of else
        } // end of for loop
        if(foundNotfound=true)
        {
            System.out.println("Found!");
        } // end of if
        else{
            System.out.println("Not Found!");
        } // end of else

        System.out.println(spacebar);

//**********************************************************************************************************************
        // 11. Remove the item at index 4 of the array by shifting everything after it one spot to the left.
        // This means your array should have one empty index at the end after the shift (delete the duplicate item at the end).

        for(int i= 4; i < myData.length; i++) // start looping at 4 because we need to overwrite it
        {
            if(i == myData.length-1) // bounds check, if it hits index 9, turn that value null
            {
                myData[i] = null; // index 9 is null so it won't duplicate
            } // end of if
            else // all other indexes
            {
                myData[i] = myData[i+1]; // overwrite current value with the next one to shift the array down
            } // end of else

        } // end of for loop

//**********************************************************************************************************************
        // 12. Create a new array that is twice as big as the current array and copy all of the items to the new array.
        // When complete, swap references so our old array gets garbage collected and the new array is pointed to by your array variable myData.
        String[] newData = new String[myData.length*2]; // create array with double the space
        String[] temp = new String[myData.length*2]; // create a temp array as well

        for(int i=0; i < myData.length; i++) // loop through indexes
        {
            newData[i] = myData[i]; // copy over the values into the new array
        } // end of for loop
        myData = newData; // change the reference so that newData is now myData
      

//**********************************************************************************************************************
        // 13. Prompt the user to enter 2 numbers within the range of the array's length. If the first is larger than the second print backwards from that index to the first.
        // If the second is larger than the first, print forward in the array from the first index to the second.
        System.out.println("Enter two numbers: ");

        String n1 = myObj.nextLine(); // user number one
        String n2 = myObj.nextLine(); // user number two

        int num1 = Integer.parseInt(n1); // parse string into int
        int num2 = Integer.parseInt(n2); // parse string into int

        if(num1 > num2) // if number one is bigger than number two
        {
            for(int i = num1; i >= 0; i--) // start at num one and run through indexes down until the included 0 index
            {
                System.out.println(myData[i]);
            } // end of for loop
        } // end of if
        else if(num1 < num2) // if number two is bigger than number one
        {
            for(int i= num2; i < myData.length; i++) // start at num two and run up through indexes until the last index
            {
                System.out.println(myData[i]);
            } // end of for loop
        } // end of else if
        else // if the user enters two of the same numbers
        {
            System.out.println("Please enter two different numbers");
        } // end of else
    } // end of main method

} // end of class