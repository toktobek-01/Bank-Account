package chess;

public class Pawn {
    private int x, y;
    private String color;
    private boolean isFirstMove;

    Pawn(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
        isFirstMove = true;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public boolean canMove(int nx, int ny) {
        if (y == 2) {
            if (nx == x && y + 2 >= ny && ny > y) {
                return true;
            } else {
                return false;
            }
        } else {
            if (nx == x && y + 1 == ny) {
                return true;
            } else {
                return false;
            }
        }
    }
}
