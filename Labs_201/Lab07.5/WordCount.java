public class WordCount {

    public static void main (String [] args) {
	System.out.println("wordCount(\"hello\") should return 1 and you get "+
                           wordCount("hello"));
	System.out.println("wordCount(\"how are you\") should return 3 and you get "+
                           wordCount("how are you"));
	System.out.println("wordCount(\" this  string    has  big spaces  \") should return 5 and you get "+
                           wordCount("  this    string   has   big  spaces  "));
	System.out.println("wordCount(\"  \") should return 0 and you get "+
                           wordCount("   "));
    }


    // put wordCount() here


}