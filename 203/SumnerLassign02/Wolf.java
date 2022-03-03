/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 2
  Due: 2/15/18
*/
public class Wolf implements Critter{
    public char getChar() {
        return 'W';
    }
    
    public int getMove(CritterInfo info){
        //checks if ther is any critter other than monster around
        //if so, follows
        if (!(info.getNeighbor(NORTH) == '.' || info.getNeighbor(NORTH) == ' '))
            return NORTH;
        if (!(info.getNeighbor(WEST) == '.' || info.getNeighbor(WEST) == ' '))
            return WEST;
        if (!(info.getNeighbor(SOUTH) == '.' || info.getNeighbor(SOUTH) == ' ') )
            return SOUTH;
        else
            //if not, goes East
            return EAST;
    }
}
