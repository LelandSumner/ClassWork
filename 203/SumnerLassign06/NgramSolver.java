import java.util.*;

public class NgramSolver{

    private Map<String, String> ngrams = new TreeMap<String, String>();
    private ArrayList<String> starts = new ArrayList<String>();
    
    public NgramSolver (int n, String text){
        
        for(int i = 0; i < text.length()-n; i++){
            String ngram = text.substring(i, i + n);
            String next = text.substring(i+n, i+n+1); 
            if (ngrams.keySet().contains(ngram))
                ngrams.put(ngram, ngrams.get(ngram)+ next);
            else
                ngrams.put(ngram, next);
            if (i == 0 || ( i > 1 &&(text.substring(i-2, i).equals("? ") || text.substring(i-2, i).equals("! ") || text.substring(i-2, i).equals(". "))))
                starts.add(ngram);
        }
    }
    public boolean contains(String ngram){
        return ngrams.keySet().contains(ngram);
    }
    
    public char randomChar(String ngram){
        if (contains(ngram)){
            Random rand = new Random();
            return ngrams.get(ngram).charAt(rand.nextInt(ngrams.get(ngram).length()));
        }else
            throw new IllegalArgumentException();
    }
    
    public String randomStart(){
        Random rand = new Random();
        return starts.get(rand.nextInt(starts.size()));
    }
    
}
