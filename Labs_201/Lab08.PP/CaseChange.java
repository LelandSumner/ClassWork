public class CaseChange {
    public static void main(String[] args) {
        testUpcase("testing", "tEstIng");
        testUpcase("HaViNG FuN", "HAVING FUN");
        testUpcase("", "");
        testDowncase("TESTING", "tEstIng");
        testDowncase("HaViNG FuN", "having fun");
        testDowncase("", "");
    }
    
    public static void testUpcase(String s, String shouldBe) {
        String result = upcaseVowels(s);
        System.out.printf("upcaseVowels(\"%s\") = \"%s\", should be \"%s\": ",
                s, result, shouldBe);
        if (result.equals(shouldBe)) {
            System.out.println("ok");
        } else {
            System.out.println("FAILED");
        }
    }
    
    public static void testDowncase(String s, String shouldBe) {
        String result = downcaseConsonants(s);
        System.out.printf("downcaseConsonants(\"%s\") = \"%s\", " +
                "should be \"%s\": ",
                s, result, shouldBe);
        if (result.equals(shouldBe)) {
            System.out.println("ok");
        } else {
            System.out.println("FAILED");
        }
    }
    
    
    // upcaseVowels --- return a copy of the argument string but with 
    //  all vowels capitalized, regardless of where they appear. 
    //  Anything not a vowel should remain as it is.
    public static String upcaseVowels(String s) {
        // STUB 
        return s;
    }
    
    // downcaseConsonants --- return a copy of the argument string but with
    //  all consonants lower-cased, regardless of where they appear.
    //  Anything not a consonant should remain as it is.
    public static String downcaseConsonants(String s) {
        // STUB
        return s;
    }
}