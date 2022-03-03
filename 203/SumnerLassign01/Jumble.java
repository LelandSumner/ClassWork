/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 1
  Due: 2/6/18
*/
public class Jumble{
    private String[] solutions;
    private String[] jumble;
    
    public Jumble(String[] words){
        //sets the solutions array equal to the words array
        solutions = new String[words.length];
        for(int i = 0; i < words.length; i++){
            solutions[i] = words[i].toUpperCase();
        }
        //sets jumble array equal to permutations of the words array
        jumble = new String[words.length];
        for(int i = 0; i< words.length; i++){
            JString js = new JString(words[i]);
            jumble[i] = js.permute();
        }
    }
    public void show(){
        //prints jumble puzzle using jumble array
        System.out.println("The JUMBLE\n");
        for (int i = 0; i < jumble.length; i++){
            System.out.println(" " + jumble[i]);
        }
    }
    public void solve(){
        //shows solution to the jumble puzzle
        System.out.println("The SOLUTION\n");
        for (int i = 0; i < jumble.length; i++){
            System.out.println(" " + jumble[i] + " --> " + solutions[i]);
        }
    }
}