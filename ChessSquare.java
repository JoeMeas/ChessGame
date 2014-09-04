/**
 * Created by Perry on 8/10/2014.
 */
public class ChessSquare {
    public int posX;
    public int posY;
    public ChessPiece piece;
    public String graphic;

    public ChessSquare(int posX, int posY, ChessPiece piece) {
        this.posX = posX;
        this.posY = posY;
        this.piece = piece;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
    }

    public String getGraphic() {
        return this.piece != null ? this.piece.toString() : "X";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChessSquare)) return false;

        ChessSquare that = (ChessSquare) o;

        if (posX != that.posX) return false;
        if (posY != that.posY) return false;
        if (piece != null ? !piece.equals(that.piece) : that.piece != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = posX;
        result = 31 * result + posY;
        result = 31 * result + (piece != null ? piece.hashCode() : 0);
        return result;
    }
}
