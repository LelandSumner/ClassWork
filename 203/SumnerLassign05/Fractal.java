/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 5
  Due: 3/29/18
*/
public class Fractal{
    
    private int level;
    
    // constructs Fractal with given integer as level of Fractal
    public Fractal(int level){
        this.level = level;
    }
    public String toString(){
        return figure(level, 0, "");
    }
    private static String figure(int level, int space, String s){
        //basecase: level < 0 returns string s
        if (level >= 0){    
	    //recursively adds fractal of level-1 to top
            s += figure(level-1,space, "");
            //adds spacing for fractal
            for (int i = 0; i < space; i++) s += " "; 
            // adds *s to fractal of given level
            for(int i = 0; i< Math.pow(2, level);i++) s += "*";
            //adds fractal 0f level-1 to bottom with appropriate spacing
            s += "\n" + figure(level-1,space + (int)Math.pow(2,level-1), "");
        }
        return s;
    }
}
