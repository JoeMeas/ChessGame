public class PositionTuple {
    public final int x;
    public final int y;

    public PositionTuple(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public PositionTuple(final String destination) {
        final char[] destinationArr = destination.toCharArray();
        final char c = destinationArr[0];
        this.x =  c <= 'Z' ? c - 'A' : c - 'a';
        this.y = destinationArr[1] - '0';
    }

    @Override
    public String toString() {
        return "(" + this.x  + ", " + this.y + ")";
    }
}
