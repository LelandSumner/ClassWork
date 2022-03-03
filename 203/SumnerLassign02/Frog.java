/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 2
  Due: 2/15/18
*/
import java.util.*;

public class Frog implements Critter{
    int moveCount;    // keeps track of number of moves
    int move;         // holds direction until it has to change
    
    public Frog(){
        moveCount = 3;
        move = 0;
        
    }

    public char getChar() {
        return 'F';
    }
    
    public int getMove(CritterInfo info){
        Random dir = new Random();
        //if it has moved 3 times resets count and picks new direction
        if (moveCount >= 3){
            moveCount = 0;
            move = dir.nextInt(4);
        }
        if (move == 0){
            //counts every time it moves
            moveCount++;
            return NORTH;
         }
         if (move == 1){
            moveCount++;
            return EAST;
        }
        if (move == 2){
            moveCount++;
            return SOUTH;
        }
        moveCount++;
        return WEST;
    }
}
