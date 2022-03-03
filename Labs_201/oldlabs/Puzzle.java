import fang.core.Game;
import fang.core.Mouse;
import fang.attributes.Location2D;
import java.util.*;

public class Puzzle extends Game {

    private ArrayList<TileSprite> tiles;
    private boolean shuffled;
    private int emptyTile;
    private boolean won;
    private double flashWon;
    private boolean flashToggle;

    public void setup() {
	tiles = new ArrayList<TileSprite>(16);
	int val = 1;
	// put tiles 1, 2, 3, 4 on top row,
	// put tiles 5, 6, 7, 8 on next row, etc.
	for (int i=0 ; i<4 ; i++) { // rows
	    for (int j=0 ; j<4 ; j++) { // columns
		TileSprite t = new TileSprite(this);
		t.setScale(0.25);
		t.setLocation(0.25*j + 0.125, 0.25*i + 0.125);
		t.setValue(val);
		val++;
		addSprite(t);
		tiles.add(t);
	    }
	}
	shuffled = false;
	emptyTile = 15; // index in tiles for the empty tile
	won = false;
    }

    private void checkWon() {
	if (won)
	    return; // don't need to check!
	won = true; // assume the best
	for (int k=0 ; k<16 ; k++) {
	    if (tiles.get(k).getValue() != k+1) {
		won = false;
		return;
	    }
	}
	// whee!!!! we won!!!!!!
	flashWon = 0.0;
	flashToggle = true;
    }

    public void advance(double dT) {
	if (shuffled) {
	    checkWon();
	    if (won) {
		flashWon -= dT;
		if (flashWon < 0) {
		    flashWon = 0.25;
		    for (int k=0 ; k<16 ; k++) {
			tiles.get(k).setSelected(flashToggle);
		    }
		    flashToggle = !flashToggle;
		}
		if (getClick2D() != null) {
		    won = false;
		    shuffled = false;
		}
	    } else {		
		int selected = -1;
		Location2D loc = getMouse2D();
		if (loc != null) {
		    for (int k=0 ; k<16 ; k++) {
			TileSprite t = tiles.get(k);
			// check to see if mouse is over a numbered tile
			// and if the tile is moveable (aligned vertically
			// or horizontally with the empty slot) -- if so
			// mark this tile as "selected"
			if (t.intersects(loc) &&
			    (t.getValue() < 16) &&
			    alignedWithEmpty(k)) {
			    t.setSelected(true);
			    selected = k;
			} else {
			    t.setSelected(false);
			}
		    }
		    if ((getClick2D() != null) && (selected >= 0)) {
			multipleSwap(selected);
		    }
		}
	    }
	} else {
	    // must shuffle
	    int parity = 1; // parity must be 1 in order to have a solution
	    for (int k=0 ; k<16 ; k++) {
		int kk = randomInt(k, 15);
		if (k != kk) {
		    swap(k, kk); // each real swap changes the parity
		    parity = -parity;
		}
	    }
	    if (parity != 1)
		swap(14, 15); // any two different tiles will do!
	    shuffled = true;
	}
    }

    public boolean alignedWithEmpty(int k) {
	int i = k / 4; // row index (0..3)
	int j = k % 4; // column index (0..3)
	int ii = emptyTile / 4;
	int jj = emptyTile % 4;
	return (j == jj) || (i == ii);
    }

    // returns the index into the ArrayList, given row i and col. j
    // (i and j each are in the range 0..3)
    public int ijk (int i, int j) {
	return 4*i + j;
    }

    // slide tile at index k towards the empty slot, moving any other
    // tiles that are in the way
    public void multipleSwap (int k) {
	int i = k / 4;
	int j = k % 4;
	int ii = emptyTile / 4;
	int jj = emptyTile % 4;
	if (i == ii) {
	    while (j < jj) {
		swap(ijk(i,jj-1), ijk(i,jj));
		jj--;
	    }
	    while (jj < j) {
		swap(ijk(i,jj), ijk(i,jj+1));
		jj++;
	    }
	} else if (j == jj) {
	    while (i < ii) {
		swap (ijk(ii-1,j), ijk(ii,j));
		ii--;
	    }
	    while (ii < i) {
		swap (ijk(ii,j), ijk(ii+1,j));
		ii++;
	    }
	}
    }


    public void swap (int p, int q) {
	TileSprite t = tiles.get(p);
	TileSprite u = tiles.get(q);
	int tVal = t.getValue();
	int uVal = u.getValue();
	t.setValue(uVal);
	u.setValue(tVal);
	// keep track of the empty tile location
	if (uVal == 16)
	    emptyTile = p;
	else if (tVal == 16)
	    emptyTile = q;
    }
}
