/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 2
  Due: 2/15/18
*/
public class Monster implements Critter{
    public char getChar() {
        //it's invisible
        return ' ';
    }
    public int getMove(CritterInfo info){
        //checks for creature in each direction
        //if so, follows
        if (info.getNeighbor(NORTH) != '.')
            return NORTH;
        if (info.getNeighbor(EAST) != '.')
            return EAST;
        if (info.getNeighbor(SOUTH) != '.')
            return SOUTH;
        else
            //if not, goes west
            return WEST;
    }
}
