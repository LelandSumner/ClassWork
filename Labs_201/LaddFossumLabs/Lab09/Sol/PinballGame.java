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
     * read a string (including embedded spaces) from standard input.
     * @param prompt prompt to display for user
     * @return string entered by the user (with internal whitespace, possibly)
     */
    public String getFileName(String prompt) {
	System.out.print(prompt + " ");
	Scanner kbd = new Scanner(System.in);
	String retval = kbd.next();
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
     * @param fname file name to ensure extension on 	double y 

     * @param ext extension to ensure
     * @return filename with extension.
     */
    public String ensureExtension(String fname, String ext) {
	if (fname.endsWith("." + ext))
	    return fname;
	if (fname.endsWith("."))
	    return fname + ext;
	return fname + "." + ext;
    }
  
    /**
     * Prompt the user for an input file and process it line by line
     */
    public void readPNDFile() {
	String fname = getFileName("Pinball file to read>");
	fname = ensureExtension(fname, "pnd");
	System.out.println("fname = " + fname);
	Scanner in = connectScannerToFile(fname);
	while (in.hasNext()) {
	    String obj = in.next();
	    System.out.println("obj=" + obj);
	    if (obj.equals("Ball"))
		handlePinball(in);
	    else if (obj.equals("Oval"))
		handleOval(in);
	    else if (obj.equals("Rectangle"))
		handleRectangle(in);
	    else {
		System.out.println("illegal PND file format");
		System.exit(2);
	    }
	}
    }
  
    /**
     * Called after a line has been identified as an Oval line.
     * @param fin the scanner that just read the "Oval" command
     */
    public void handleOval(Scanner fin) {
	String color = fin.next();
	double x = fin.nextDouble();
	double y = fin.nextDouble();
	double w = fin.nextDouble();
	double h = fin.nextDouble();
	OvalSprite bumper = new OvalSprite(w, h);
	bumper.setLocation(x, y);
	bumper.setColor(getColor(color));
	addSprite(bumper);
    }
  
    /**
     * Called after a line has been identified as an Oval line.
     * @param fin the scanner that just read the "Oval" command
     */
    public void handleRectangle(Scanner fin) {
	String color = fin.next();
	double x = fin.nextDouble();
	double y = fin.nextDouble();
	double w = fin.nextDouble();
	double h = fin.nextDouble();
	RectangleSprite bumper = new RectangleSprite(w, h);
	bumper.setLocation(x, y);
	bumper.setColor(getColor(color));
	addSprite(bumper);
    }
  
    /**
     * Called after a line has been identified as an Oval line.
     * @param fin the scanner that just read the "Oval" command
     */
    public void handlePinball(Scanner fin) {
	String color = fin.next();
	double x = fin.nextDouble();
	double y = fin.nextDouble();
	double w = fin.nextDouble();
	double h = fin.nextDouble();
	double dX = fin.nextDouble();
	double dY = fin.nextDouble();
	Pinball ball = new Pinball(w, h, dX, dY);
	ball.setLocation(x, y);
	ball.setColor(getColor(color));
	addSprite(ball);
	pinballs.add(ball);
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
