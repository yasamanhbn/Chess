package pieces;

import com.Ground;
import com.Square;

public class King extends Piece {

    public King(int row, int column, String color) {
        super(row, column, color);
        type="king";
    }

    @Override
    public void findPossibleMove(Ground ground) {
        Square[][] squares = ground.getSquares();

    }
}
