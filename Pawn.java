import java.util.TreeSet;

/**
 * Created by Perry on 8/30/2014.
 */
public class Pawn extends ChessPiece {
    public boolean starting = true;

    public Pawn(int posX, int posY) {
        super(posX, posY);
    }

    public TreeSet<ChessSquare> validSquares(){
        if(clear) {
            if (starting) {
                posX + 2;
            }
            posX + 1;
        }
    }

    public capture(){

    }
}
