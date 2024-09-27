/********************************************
*	AUTHORS:	Jorge Barajas, Ryan Mahadavi 
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	9/26/24
********************************************/

/********************************************
*	<TITLE OF PROGRAM>
*********************************************
*	PROGRAM DESCRIPTION:
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <list of static methods and which teammate made each>
*********************************************/

import java.lang.Math; 
public class Main 
{
  /***** CONSTANT SECTION *****/

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    int semitonesFromA = 1;
    double frequency; 
    
    /***** INITIALIZATION SECTION *****/
    
    
    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/
    frequency = Math.pow(2, ((double) semitonesFromA / 12) ) * 440;
    /***** OUTPUT SECTION *****/
    System.out.println("Your frequency is "+frequency);
    
  }
  /***** STATIC METHODS *****/
} 
