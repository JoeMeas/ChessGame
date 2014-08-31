//Uses mapping of 8x8 chess board
//Checks if piece is on board, remove if lands on piece

public class ChessBoard {

    public final int LENGTH = 8;
    public final int WIDTH = 8;
    public ChessSquare[][] squares;

    public ChessBoard(){
        squares = new ChessSquare[LENGTH][WIDTH];

        for(int i = 0; i <= LENGTH - 1; i++){
            for(int j = 0; j <= WIDTH - 1; j++){
                squares[i][j] = new ChessSquare(i, j, null);
            }
        }

        squares[0][1].piece = new Pawn(0, 1);
    }

    public void printBoard(){
        for(int i = 0; i <= squares.length - 1; i++){
            for(int j = 0; j <= squares.length - 1; j++) {
                squares[i][j].printPosition();
            }
        }
    }

}
