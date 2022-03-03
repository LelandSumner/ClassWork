/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 2
  Due: 2/15/18
*/
public class Turtle implements Critter{
    int moveCount;  //counts movements
    
    public Turtle (){
        moveCount =0;
     }
    public char getChar() {
        return 'T';
    }
    
    public int getMove(CritterInfo info){
        //whenever it moves, counts
        moveCount++;
        //changes direction every 5 moves
        if (moveCount<=5)
            return SOUTH;
        else if (moveCount<=10)
            return WEST;
        else if (moveCount<=15)
            return NORTH;
        else{
            //if it moves in complete box, resets count
            if (moveCount == 20)
                moveCount=0;
            return EAST;
        }
    }
}
