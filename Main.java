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
    int semitonesFromA;
    double frequency, octavesApart, midiNum;
  

    
    /***** INITIALIZATION SECTION *****/
    semitonesFromA = 7;
    
    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/
    
    
    frequency = Math.pow(2, ((double) semitonesFromA / 12) ) * 440;
    octavesApart = findOctave(frequency);
    midiNum = findMidiNum(frequency);


    /***** OUTPUT SECTION *****/
    System.out.println("Your note is "+semitonesFromA+" notes away from A (440 Hz)");
    System.out.println("Your frequency is "+frequency+" Hz");
    System.out.println("Your frequency is "+octavesApart+" octaves away from A (440 Hz)");
    System.out.printf("Your MIDI Num is %.0f%n",midiNum);
    System.out.println(" _______________________________________\r\n" + //
            "|  | | | |  |  | | | | | |  |  | | | |  |\r\n" + //
            "|  | | | |  |  | | | | | |  |  | | | |  |\r\n" + //
            "|  | | | |  |  | | | | | |  |  | | | |  |\r\n" + //
            "|  |_| |_|  |  |_| |_| |_|  |  |_| |_|  |\r\n" + //
            "|   |   |   |   |   |   |   |   |   |   |\r\n" + //
            "|   |   |   |   |   | A |   |   |   |   |\r\n" + //
            "|___|___|___|___|___|___|___|___|___|___|\r\n");
    
  }
  /***** STATIC METHODS *****/
  
  public static double findOctave(double frequency){
    double octavesApart = (Math.log(frequency / 440))/(Math.log(2));
    return octavesApart;
  }
  
  public static double findMidiNum(double frequency){
    double midiNum = 12*(Math.log(2)*(frequency / 440)) + 69;
    return midiNum;
  }
} 
