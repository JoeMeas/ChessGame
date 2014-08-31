//Uses mapping of 8x8 chess board
//Checks if piece is on board, remove if lands on piece

public class ChessBoard {

    public final int LENGTH = 8;
    public final int WIDTH = 8;

    public ChessBoard(){
        ChessSquare[][] squares = new ChessSquare[LENGTH][WIDTH];

        for(int i = 0; i <= LENGTH; i++){
            for(int j = 0; j <= WIDTH; j++){
                squares[i][j] = new ChessSquare(i, j, null);
            }
        }
    }



}
