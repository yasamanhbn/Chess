package pieces;

import com.Ground;
import com.Square;

public class Knight extends Piece {

    public Knight(int row, int column, String color) {
        super(row, column, color);
        type="Knight";
    }

    @Override
    public void findPossibleMove(Ground g) {
        super.clearArray();
        Square[][] squares = g.getSquares();
        //go forward
        if(super.getRow()!=7 && super.getColumn()<=5 ) {
            if (squares[super.getRow() + 1][super.getColumn() + 2].getMyPiece() == null)
                super.addSquare(squares[super.getRow() + 1][super.getColumn() + 2]);
            else if (squares[super.getRow() + 1][super.getColumn() + 2].getMyPiece() != null && !(squares[super.getRow() + 1][super.getColumn() + 2].getMyPiece().getColor().equals(super.getColor())))
                super.addSquare(squares[super.getRow() + 1][super.getColumn() + 2]);
        }
        if(super.getRow()<=5 && super.getColumn()!=7) {
            if (squares[super.getRow() + 2][super.getColumn() + 1].getMyPiece() == null)
                super.addSquare(squares[super.getRow() + 2][super.getColumn() + 1]);
            else if (squares[super.getRow() + 2][super.getColumn() + 1].getMyPiece() != null && !(squares[super.getRow() + 2][super.getColumn() + 1].getMyPiece().getColor().equals(super.getColor())))
                super.addSquare(squares[super.getRow() + 2][super.getColumn() + 1]);
        }
        if(super.getRow()!=7 && super.getColumn()>=2) {
            if (squares[super.getRow() + 1][super.getColumn() - 2].getMyPiece() == null)
                super.addSquare(squares[super.getRow() + 1][super.getColumn() - 2]);
            else if (squares[super.getRow() + 1][super.getColumn() - 2].getMyPiece() != null && !(squares[super.getRow() + 1][super.getColumn() - 2].getMyPiece().getColor().equals(super.getColor())))
                super.addSquare(squares[super.getRow() + 1][super.getColumn() - 2]);
        }
        if(super.getRow()<=5 && super.getColumn()!=0) {
            if (squares[super.getRow() + 2][super.getColumn() - 1].getMyPiece() == null)
                super.addSquare(squares[super.getRow() + 2][super.getColumn() - 1]);
            else if (squares[super.getRow() + 2][super.getColumn() - 1].getMyPiece() != null && !(squares[super.getRow() + 2][super.getColumn() - 1].getMyPiece().getColor().equals(super.getColor())))
                super.addSquare(squares[super.getRow() + 2][super.getColumn() - 1]);
        }
        //go down
        if(super.getRow()!=0 && super.getColumn()<=5) {
            if (squares[super.getRow() - 1][super.getColumn() + 2].getMyPiece() == null)
                super.addSquare(squares[super.getRow() - 1][super.getColumn() + 2]);
            else if (squares[super.getRow() - 1][super.getColumn() + 2].getMyPiece() != null && !(squares[super.getRow() - 1][super.getColumn() + 2].getMyPiece().getColor().equals(super.getColor())))
                super.addSquare(squares[super.getRow() - 1][super.getColumn() + 2]);
        }
        if(super.getRow()>=2 && super.getColumn()!=7 && super.getRow()!=0) {
            if (squares[super.getRow() - 2][super.getColumn() + 1].getMyPiece() == null)
                super.addSquare(squares[super.getRow() - 2][super.getColumn() + 1]);
            else if (squares[super.getRow() - 2][super.getColumn() + 1].getMyPiece() != null && !(squares[super.getRow() - 2][super.getColumn() + 1].getMyPiece().getColor().equals(super.getColor())))
                super.addSquare(squares[super.getRow() - 2][super.getColumn() + 1]);
        }
        if(super.getRow()!=0 && super.getColumn()>=2) {
            if (squares[super.getRow() - 1][super.getColumn() - 2].getMyPiece() == null)
                super.addSquare(squares[super.getRow() - 1][super.getColumn() - 2]);
            else if (squares[super.getRow() - 1][super.getColumn() - 2].getMyPiece() != null && !(squares[super.getRow() - 1][super.getColumn() - 2].getMyPiece().getColor().equals(super.getColor())))
                super.addSquare(squares[super.getRow() - 1][super.getColumn() - 2]);
        }
        if(super.getRow()>=2 && super.getColumn()!=0) {
            if (squares[super.getRow() - 2][super.getColumn() - 1].getMyPiece() == null)
                super.addSquare(squares[super.getRow() - 2][super.getColumn() - 1]);
            else if (squares[super.getRow() - 2][super.getColumn() - 1].getMyPiece() != null && !(squares[super.getRow() - 2][super.getColumn() - 1].getMyPiece().getColor().equals(super.getColor())))
                super.addSquare(squares[super.getRow() - 2][super.getColumn() - 1]);
        }
    }
}
