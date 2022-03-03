import java.util.Scanner;

public class CaesarCipher {

    public static final String
        STRING_PROMPT = "Enter a string to encrypt (Ctrl-C to quit): ";
        
    public static final String
        KEY_PROMPT = "Enter an integer from -94 to 94 (Ctrl-C to quit): ";
        
    
    public static void main(String[] args) {
        for ( /* */; true; /* */) {         // forever loop
            String cleartext = promptForLine(STRING_PROMPT);
            
            // Fencepost "prompt loop" --- require int in valid range
            int key = promptForInt(KEY_PROMPT);
            while (key < -94 || key > 94) {
                key = promptForInt(KEY_PROMPT);
            }
            
            System.out.printf("Encrypted: \"%s\"\n", encrypt(cleartext, key));
            System.out.println();
        }
    }
    
    public static String promptForLine(String prompt) {
        System.out.print(prompt);
        return (new Scanner(System.in)).nextLine();
    }
    
    public static int promptForInt(String prompt) {
        System.out.print(prompt);
        return (new Scanner(System.in)).nextInt();
    }
        
    public static String encrypt(String s, int shift) {
        String result = "";
        for (int i = 0; i < s.length(); ++i) {
            result += encryptChar(s.charAt(i), shift);
        }
        return result;
    }
    
    
    // IMPLEMENT THIS METHOD. Return the character c, shifted the
    //  given amount (and wrapped if necessary) in the character
    //  range ' ' ... '~'
    public static char encryptChar(char c, int shift) {
        // STUB --- replace with your implementation
        return c;
    }
}