import java.io.*;
import fang2.core.Sprite;
import java.util.ArrayList;
import java.util.Scanner;

import fang2.core.Game;
import fang2.sprites.OvalSprite;
import fang2.sprites.RectangleSprite;

public class PinballGame 
  extends Game {
  ArrayList<Pinball> pinballs;
  
  public void setup() {
    pinballs = new ArrayList<Pinball>();
    readPNDFile();
  }
 
  /**
   * Display the prompt (making sure to add a space after it) and then 
   * read a string from standard input.
   * @param prompt prompt to display for user
   * @return string entered by the user
   */
  public String getFileName(String prompt) {
    String retval = "";
    return retval;
  }
  
  /**
   * Attempts to open the named file, attaching a Scanner to it and returning the 
   * Scanner. If there is a problem opening the file, returns null
   * @param fname pathname of file to open
   * @exit the program if there is a problem opening fname for input;
   * @return a Scanner bound to fname otherwise
   */
  public Scanner connectScannerToFile(String fname) {
    Scanner in = null;
    try {
	in = new Scanner(new File(fname));
    } catch (FileNotFoundException e) {
	System.out.println("file " + fname + " not found");
	System.exit(1);
    }
    return in;
  }
  
  /**
   * Make sure that the string ends with the given extension. If fname ends with 
   * .ext (where ext is the content of the string ext), just return fname. If it ends with a ., return fname + ext;
   * if it ends with anything else, append a dot and the ext.
   * 
   * @param fname file name to ensure extension on 
   * @param ext extension to ensure
   * @return filename with extension.
   */
  public String ensureExtension(String fname, String ext) {
    return fname;
  }
  
  /**
   * Prompt the user for an input file and process it line by line
   */
  public void readPNDFile() {
    String fname = getFileName("Pinball file to read>");
    System.out.println("fname = " + fname);
    Scanner in = connectScannerToFile(fname);
  }
  
  /**
   * Called after a line has been identified as an Oval line.
   * @param fin the scanner that just read the "Oval" command
   */
  public void handleOval(Scanner fin) {
  }
  
  /**
   * Called after a line has been identified as an Oval line.
   * @param fin the scanner that just read the "Oval" command
   */
  public void handleRectangle(Scanner fin) {
  }
  
  /**
   * Called after a line has been identified as an Oval line.
   * @param fin the scanner that just read the "Oval" command
   */
  public void handlePinball(Scanner fin) {
  }
  
  /**
   * Simulate a pinball game. If there are any balls, they are moved every frame.
   * 
   */
  public void advance(double dT) {
    for (int i = 0; i < pinballs.size(); ++i) {
      pinballs.get(i).advance(dT);
    }
    for (int i = 0; i < pinballs.size(); ++i) {
      pinballs.get(i).bounceEdges(0.0, 0.0, 1.0, 1.0);
    }
    for (int i = 0; i < pinballs.size(); ++i) {
      Pinball pb = pinballs.get(i);
      Sprite [] spArray = getAllSprites();
      for (int spriteNdx = 0; spriteNdx < spArray.length; ++spriteNdx) {
        if ((pb.intersects(spArray[spriteNdx]) && 
            (pb != spArray[spriteNdx]))) {
          pb.bounceOffOf(spArray[spriteNdx]);
        }
      }
    }
  }
}
