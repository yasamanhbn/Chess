package pieces;

import com.*;
import java.util.*;

public class Pawn extends Piece {

    public Pawn(int row, int column, String color) {
        super(row, column, color);
        type="Pawn";
    }

    @Override
    public void findPossibleMove() {
    }

}
