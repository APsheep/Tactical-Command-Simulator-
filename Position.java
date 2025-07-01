public class Position {
    private int x;
    private int y;

    // Constructor
    public Position(int x, int y) {
        this.x = x; 
        this.y = y; 
    }

    // Move the position by dx and dy
    public void move(int dx, int dy) {
        x += dx;
        y += dy; 
    }
    public String toString() {
        return "(" + x + "," + y + ")";  // Return position as string
    }
}