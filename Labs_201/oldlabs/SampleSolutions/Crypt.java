import java.io.*;
import java.util.*;

class Crypt {
    Scanner fin;
    public Crypt() {
	try {
	    fin = new Scanner(new FileInputStream("Crypt.java"));
	} catch (FileNotFoundException fnfe) {
	    System.exit(1);
	}
    }

// the dispatch method
    public char convertCh(char ch) {
	if (('a' <= ch && ch <= 'z')) {
	    return convertLC(ch);
	} else if (('A' <= ch && ch <= 'Z')) {
	    return convertUC(ch);
	} else if (('0' <= ch && ch <= '9')) {
	    return convertDigit(ch);
	} else {
	    return convertOther(ch);
	}
    }
    
    public char convertLC(char lower) {
	final int diff = 'A' - 'a';
	return (char)(lower + diff);
    }
    
    public char convertUC(char upper) {
	return upper;
    }
    
    public char convertDigit(char digit) {
	return digit;
    }
    
    public char convertOther(char other) {
	return other;
    }
    public void run() {
	while (fin.hasNextLine()) {
	    String line = fin.nextLine();
	    String converted = "";
	    for (int i = 0; i < line.length(); ++i) {
		char nextCh = line.charAt(i);
		converted = converted + convertCh(nextCh);
	    }
	    System.out.println(converted);
	}
    }

  static public void main(String args[]) {
      Crypt instance = new Crypt();
      instance.run();
      System.out.println("-1 mod 26 = " + (-1 % 26));
      System.out.println("26 - 1 mod 26 = " + (26 - 1 % 26));
  }
}
