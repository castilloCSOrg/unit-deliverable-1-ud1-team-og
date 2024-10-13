/********************************************
*	AUTHORS:	Jorge Barajas, Ryan Mahadavi, Chris Peay
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	10/12/24
********************************************/

/********************************************
<Musical Note Hertz Calculator>
*********************************************
*	PROGRAM DESCRIPTION:
This program will allow you to find the hertz frequency, octaves away from the root note A (440hz), and the notes corresponding MIDI number
of any note depending on the User Input. Frequency is defined as the number of cycles or repetitions per unit of time and relates directly to pitch.
In order to find the frequency for notes we need a base note to base the rest of the other notes on, which in this case is the root note A (440hz).
Octaves are when notes or frequencies are exactly double apart in distance, with this program you are able calculate how far the note you selected is from
being an octave from A. A MIDI number is a universal number that makes copmuters able distinguish a note.

*********************************************
*	ALGORITHM:
Take user input, convert input into Semitones from root note A, find frequency of note, find octaves away from root note A, find MIDI number, print results.
*********************************************
*	STATIC METHODS:
getUserInput(Chris Peay), getSemitonesFromA(Jorge Barajas), findOctave(Ryan Mahadavi), findMidiNum(Jorge Barajas)
*********************************************/

import java.lang.Math; 
import java.util.Scanner;


public class Main 
{
  /***** CONSTANT SECTION *****/

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    int semitonesFromA;
    double frequency, octavesApart, midiNum;
    char noteSelected;
    
    
    
  

    
    /***** INITIALIZATION SECTION *****/

    Scanner getNote = new Scanner(System.in);  //CREATE SCANNER OBJ
    noteSelected = getUserInput(getNote);
    
    /***** INTRO SECTION *****/
    
    semitonesFromA = getSemitonesFromA(noteSelected); //INITIALIZE semitonesFromA BY ASSIGNING IT VALUE RETURNED FROM getSemitonesFrom METHOD, METHOD USES INPUT FROM USER SELECTED NOTE 

    /***** PROCESSING SECTION *****/
    frequency = Math.pow(2, ((double) semitonesFromA / 12) ) * 440; 
    octavesApart = findOctave(frequency);
    midiNum = findMidiNum(frequency);

    //ROUNDING
    frequency += 0.0005;
    octavesApart += .0005;



    /***** OUTPUT SECTION *****/
    /*PRINTS ALL FINDINGS FROM CALCULATIONS */
    System.out.println("The Note you selected is " + noteSelected); 
    System.out.println("Your note is "+semitonesFromA+" semitones away from A (440 Hz)");
    System.out.printf("Your frequency is %.3f Hz%n",frequency);
    System.out.printf("Your frequency is %.3f octaves away from A (440 Hz)%n",octavesApart);
    System.out.printf("The MIDI Number for this note is %.0f%n",midiNum);
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
  /*PROMPTS USER TO SELECT A NOTE, MAKES SURE IF NOTE IS VALID INPUT, RETURNS NOTE SELECTED */
  
  public static char getUserInput(Scanner getNote){ //METHOD TO RETREIVE USER INPUT AND VERIFY IT'S ACCEPTABLE, MADE BY JORGE
    
    char noteSelected;
    
    System.out.println("Enter A Note: [A,B,C,D,E,F,G]"); //PRINTLINE TO SHOW USER ACCEPTABLE INPUT

    noteSelected = getNote.next().charAt(0);  //INITIALIZE noteSelected WITH USER INPUT
    
    if("ABCDEFG".indexOf(noteSelected) == -1){ //CHECKS IF noteSelected MATCHES STRING CONTAINING ACCEPTABLE INPUT 
      
      System.out.println("INVALID INPUT");
      
      return getUserInput(getNote);

    }else{

    return noteSelected;
    
    }
  }
  
  /*CONVERTS INPUT INTO SEMITONES FROM THE ROOT NOTE A, RETURNS SEMITONES FROM A */
  public static int getSemitonesFromA(char noteSelected){ //METHOD THAT TAKES noteSelected AND FINDS HOW MANY SEMITONES (1 SEMITONE = 1 NOTE ON PIANO) AWAY noteSelected IS FROM THE ROOT NOTE A 
   int semitonesFromA;                                     
    switch(noteSelected){
      case 'A':
      semitonesFromA = 0;
      return semitonesFromA;
      case 'B':
      semitonesFromA = 2;
      return semitonesFromA;
      case 'C':
      semitonesFromA = 3;
      return semitonesFromA;
      case 'D':
      semitonesFromA = 5;
      return semitonesFromA;
      case 'E':
      semitonesFromA = 7;
      return semitonesFromA;
      case 'F':
      semitonesFromA = 8;
      return semitonesFromA;
      case 'G':
      semitonesFromA = 10;
      return semitonesFromA;
      default:
      semitonesFromA = -1;
      return semitonesFromA;
    }
  }
/*METHOD FINDS HOW MANY OCTAVES ARE BETWEEN frequency AND THE ROOT NOTE A*/
  public static double findOctave(double frequency){ 
    double octavesApart = (Math.log(frequency / 440))/(Math.log(2));
    return octavesApart;
  }
  /*METHOD FINDS THE UNIVERSAL MIDI NUM FROM frequency */
  public static double findMidiNum(double frequency){ 
    double midiNum = (12*(Math.log(frequency/220)/Math.log(2))+57.01);
    return midiNum;
  }
} 
