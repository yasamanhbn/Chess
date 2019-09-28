package pieces;

import com.*;
import java.util.*;
public abstract class Piece  {

    private int row,column;
    private String color;
    private ArrayList<Square> possibleMoves;
    protected String type;

    public Piece(int row, int column, String color) {
        this.row = row;
        this.column = column;
        this.color = color;
        possibleMoves = new ArrayList<>();
    }
    public void clearArray(){
        if(possibleMoves!=null)
            possibleMoves.clear();
    }

    public void addSquare(Square square)
    {
        possibleMoves.add(square);
    }

    public abstract void findPossibleMove(Ground g);

    public ArrayList<Square> getPossibleMoves() {
        return possibleMoves;
    }

    public void printPossibleMove(){
        for(int i=0; i<possibleMoves.size(); i++) {
            System.out.print(type+"  row: "+possibleMoves.get(i).getRow() + " column:"+possibleMoves.get(i).getColumn()+"   ");
        }
        System.out.println();
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
