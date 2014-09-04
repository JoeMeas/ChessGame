//Uses mapping of 8x8 chess board
//Checks if piece is on board, remove if lands on piece

import java.util.stream.IntStream;
import java.util.stream.Stream;

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
    }

    public void printBoard(){
        final StringBuilder sb = new StringBuilder();

        // Generate squares and y axis
        Stream.of(squares).flatMap(i ->
            Stream.concat( Stream.of( String.valueOf( 8 - i[0].getPosX()) + " | " ),
                Stream.concat( Stream.of(i).map(j -> j.getGraphic() + " "), Stream.of("\n")))
        ).forEach(s -> sb.append(s));

        // Generate x axis
        sb.append("    ---------------\n    ");
        IntStream.range(0, 8).mapToObj(i -> String.format("%c ", 'A' + i)).forEach(s -> sb.append(s));

        System.out.println(sb);
    }

    public ChessPiece getPiece(final String positionStart) {
        return  this.getSquare(positionStart).getPiece();
    }

    public void setPiece(final ChessPiece chessPiece) {
        this.squares[chessPiece.posX][chessPiece.posY].setPiece(chessPiece);
    }

    public ChessSquare getSquare (final String positionStart) {
        final PositionTuple position = new PositionTuple(positionStart);
        return squares[position.x][position.y];
    }
}
