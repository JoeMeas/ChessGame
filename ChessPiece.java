/**
 * Created by Perry on 8/8/2014.
 */
public abstract class ChessPiece {
    public boolean alive;
    protected int posX;
    protected int posY;

    public ChessPiece(int posX, int posY){
        this.alive = true;
        this.posX  = posX;
        this.posY  = posY;
    }

    public void move(int newX, int newY){
        this.posX = newX;
        this.posY = newY;
    }

    public void move(final PositionTuple position) {
        move(position.x, position.y);
    }

    public void move(final String destination) {
        final PositionTuple position = new PositionTuple(destination);
        move(position);
    }

    public void kill(){
       this.alive = false;
    }

    public boolean isAlive(){
        return this.alive;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String toString;
}
