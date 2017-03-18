/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconverion;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class NumberConverion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    final String VALID_PHONE_NUMBER = "[ 0-9a-zA-Z&&[^qQzZ]]+" ;
    String answer = "" ;
    String userInput = "" ;
    String digit = "" ;
    String phoneNumber = "" ;
    
    Scanner scan = new Scanner( System.in ) ;

    do 
    {  
      phoneNumber = "" ;

      do
      {
        System.out.print ( " Please enter a phone number that is expressed using "
                            + "letters and digits (spaces are allowed, but the "
                            + "letters Q and Z are not) > " );
        userInput = scan.nextLine ( ).toUpperCase ( ) ;
      }
      while ( ! ( userInput.matches ( VALID_PHONE_NUMBER ) ) ) ;
      
      for ( int i = 0 ; i < userInput.length ( ) ; i++ )
      {
        switch ( userInput.charAt ( i ) )
        {
          case 'A' :
          case 'B' :
          case 'C' :
            digit = "2" ;
            break ;
          case 'D' :
          case 'E' :
          case 'F' :
            digit = "3" ;
            break ;
          case 'G' :
          case 'H' :
          case 'I' :
            digit = "4" ;
            break ;
          case 'J' :
          case 'K' :
          case 'L' :
            digit = "5" ;
            break ;
          case 'M' :
          case 'N' :
          case 'O' :
            digit = "6" ;
            break ;
          case 'P' :
          case 'R' :
          case 'S' :
            digit = "7" ;
            break ;
          case 'T' :
          case 'U' :
          case 'V' :
            digit = "8" ;
            break ;
          case 'W' :
          case 'X' :
          case 'Y' :
            digit = "9" ;
            break ;
          default:
            digit = "" + userInput.charAt ( i ) ;
        }
        
        phoneNumber = phoneNumber + digit ;
      }

      System.out.println ( " The phone number \"" + userInput + "\" can be translated to "
                            + phoneNumber ) ;

      System.out.println("Would you like to convert another phone number? (yes/no)");
      answer = scan.nextLine();
    }while (answer.equalsIgnoreCase("yes"));    
    System.out.println("Bye!");
    }
    
}
