/**
 * Created by Perry on 8/30/2014.
 */
public class ChessGame {
    private ChessBoard chessBoard;

    public ChessGame(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
        ChessGame.setupBoard(this.chessBoard);
    }

    public static void main(String[] args){
        final ChessBoard board = new ChessBoard();
        final ChessGame chessGame = new ChessGame(board);

        board.printBoard();
    }

    private static void setupBoard(final ChessBoard board) {
        board.setPiece(new King(0, 1));
    }
}
