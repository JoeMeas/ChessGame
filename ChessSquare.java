/**
 * Created by Perry on 8/10/2014.
 */
public class ChessSquare {
    public int posX;
    public int posY;
    public ChessPiece piece;

    public ChessSquare(int posX, int posY, ChessPiece piece){
        this.posX = posX;
        this.posY = posY;
        this.piece = piece;
    }

    public ChessPiece getPiece(){
        return piece;
    }

    public String getPosition() {
        return posX + ", " + posY;
    }
}
