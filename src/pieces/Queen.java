package pieces;

import com.Ground;

public class Queen extends Piece {

    public Queen(int row, int column, String color) {
        super(row, column, color);
        type="Queen";
    }

    @Override
    public void findPossibleMove(Ground g) {

    }

}
