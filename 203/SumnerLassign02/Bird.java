/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 2
  Due: 2/15/18
*/
import java.util.*;

public class Bird implements Critter{
    public char getChar() {
        return 'B';
    }
    
    public int getMove(CritterInfo info){
        //picks random direction, moves in that direction
        Random rand = new Random();
        int move = rand.nextInt(4);
        if (move == 0)
            return NORTH;
        else if (move == 1)
            return EAST;
        else if (move == 2)
            return SOUTH;
        else
            return WEST;
        
    }
}
