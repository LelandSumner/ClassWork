public class SecondHalfLetters {

    public static void main (String [] args) {
        System.out.println("secondHalfLetters(\"ruminates\") should be 5 and is " + secondHalfLetters("ruminates"));
        System.out.println("secondHalfLetters(\"mississippi\") should be 6 and is " + secondHalfLetters("mississippi"));
        System.out.println("secondHalfLetters(\"Q\") should be 1 and is " + secondHalfLetters("Q"));
        System.out.println("secondHalfLetters(\"XYLOpHoneS\") should be 7 and is " + secondHalfLetters("XYLOpHoneS"));
        System.out.println("secondHalfLetters(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\") should be 26 and is " + secondHalfLetters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println("secondHalfLetters(\"KeKeKe\") should be 0 and is " + secondHalfLetters("KeKeKe"));
        System.out.println("secondHalfLetters(\"\") should be 0 and is " + secondHalfLetters(""));
    }


    // secondHalfLetters() here
    public static int secondHalfLetters(String word) {
        word = word.toLowerCase();
        int count = 0;
	for (int i =0; i < word.length(); i++) {
	    char c = word.charAt(i);
	    if ('n' <= c && c <= 'z')
		count++;
	}
	return count;
    }


}