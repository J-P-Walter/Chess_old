package chessGame;

public class King extends Piece{
    public King(char name, char color, int startRow, int startCol, int currRow, int currCol) {
        super(name, color, startRow, startCol, currRow, currCol);
    }

    @Override
    protected int[][] getMoves() {
        return null;
    }
}
