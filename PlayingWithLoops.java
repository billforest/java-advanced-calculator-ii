/*
 * Project: PlayingWithLoops.java
 * Description: Reviewing loops
 * Name: Jaehyung Lim
 * Date: Sept 21, 2015
 */

import java.util.Scanner;

public class PlayingWithLoops {
  
  public static void main( String[] args ) {
    
    // #1 For loop (nested)
    System.out.println( "Nested for loop example:" );
    for ( int i = 0; i < 5; i++) { // 1. Start; 2. Control
      for ( int j = 0; j < 10; j++) { 
        System.out.print( "*" ); // commands
     }
     System.out.println();
    }
    System.out.println();
    
    // #2 While loop
    Scanner s = new Scanner( System.in );
    int total = 0, count = 0, number;
    double average;
    
    System.out.println( " Enter your grades to average them ( -1 quits): " );
    number = s.nextInt(); // The first time only
    
    while ( number != -1 ) {
      total += number;
      count ++;
      
      System.out.println( " Enter your grades to average them ( -1 quits): " );
      number = s.nextInt();
    }
    
    if ( count != 0) {
      average = (double) total/count;
      System.out.println( "Your GPA is: " + average );
    } else {
      System.out.println( "Nothing was entered." ); 
    }
    
    // #3 Assignment
    /*
     * 1. Prompt the user for 2 ints
     * 2. Display all odd numbers between the ints
     * (Assume 2nd num is greater)
     * (Hint: Round even ints to odd, then use for loop)
     */
    
    int jae;
    int hyung;
    System.out.println( "Enter first integer: " );
    jae = s.nextInt();
    jae++;
    System.out.println( "Enter second inteeger: " );
    hyung = s.nextInt();
    hyung--;
    if (jae % 2 == 0 ) {
        jae += 1; 
    }
    for (int i = jae; i <= hyung; i+=2) {
         System.out.println(i); 
    }
    
    
    
 
  
  
  
  } // end main method
  
} // end class