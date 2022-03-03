/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 2
  Due: 2/15/18
*/
public class Mouse implements Critter{
    
    int move;  //counts move
    
    public Mouse(){
        move= 0;
    }
    public char getChar() {
        return 'M';
    }
    
    
    public int getMove(CritterInfo info){
        // changes direction based on which move it is on
        if (move == 0){
            move ++;
            return WEST;
        }else{
            move--;
            return NORTH;
        }
    }
}
