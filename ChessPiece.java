/**
 * Created by Perry on 8/8/2014.
 */
public class ChessPiece {
    public boolean alive;
    public int posX;
    public int posY;

    public ChessPiece(int posX, int posY){
        alive = true;
        posX = posX;
        posY = posY;
    }

    public void move(int newX, int newY){
        posX = newX;
        posY = newY;
    }

    public void kill(){
        alive = false;
    }

    public boolean isAlive(){
        return alive;
    }
}
