package Assignment5;
// Assignment #: 5
// Arizona State University - CSE205
//         Name: Jacob Weiss
//    StudentID: 1210551105
//      Lecture: T,Th 10:30a
//  Description: The Assignment 5 class displa ys a menu of choices
//               (add cylinder soup, box soup,search soup,
//               list soups, quit, display menu) to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5
 {
  public static void main (String[] args)
   {
     char input1;
     String inputInfo = new String();
     String line = new String();
     boolean operation;

     // ArrayList object is used to store soup objects
     ArrayList soupList = new ArrayList();

     try
      {
       printMenu();     // print out menu

       // create a BufferedReader object to read input from a keyboard
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader stdin = new BufferedReader (isr);

       do
        {
         System.out.println("What action would you like to perform?");
         line = stdin.readLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {
           switch (input1)
            {
             case 'A':   //Add Soup
               System.out.print("Please enter some soup information to add:\n");
               inputInfo = stdin.readLine().trim();
               /***********************************************************************************
               ***  ADD your code here to create an object of one of child classes of Soup class
               ***  and add it to the soupList
               ***********************************************************************************/
               break;
             case 'C':   //Compute Total Prices
               /***********************************************************************************
               ***  ADD your code here to compute the total price for each soup in the soupList.
               ***********************************************************************************/
               System.out.print("total prices computed\n");
               break;
             case 'D':   //Search for Soup
               System.out.print("Please enter a soupID to search:\n");
               inputInfo = stdin.readLine().trim();
               operation = false;
               /***********************************************************************************
               ***  ADD your code here to search the soup with the entered soupId and set operation
               ***  to true or false based on its result
               ***********************************************************************************/
                if (operation == true)
                 System.out.print("soup found\n");
                else
                 System.out.print("soup not found\n");
               break;
             case 'L':   //List Soups
               /***********************************************************************************
               ***  ADD your code here to print out all soup objects. If there is no soup,
               ***  print "no soup\n"
               ***********************************************************************************/
               break;
             case 'Q':   //Quit
               break;
             case '?':   //Display Menu
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
         }
        else
         {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q'); // stop the loop when Q is read
      }
     catch (IOException exception)
      {
        System.out.println("IO Exception");
      }
  }

  /** The method printMenu displays the menu to a use **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd Soup\n" +
                      "C\t\tCompute Total Prices\n" +
                      "D\t\tSearch for Soup\n" +
                      "L\t\tList Soups\n" +
                      "Q\t\tQuit\n" +
                      "?\t\tDisplay Help\n\n");
  }
}


