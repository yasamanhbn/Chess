package Graghics;

import com.Ground;
import com.Square;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class SquaresListener implements MouseListener {
    private Ground ground;
    private Square square1;
    private int turn;
    private ArrayList<Square> possibleMove;
    public SquaresListener(Ground ground) {
        this.ground = ground;
        turn =0 ;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(turn == 0) {
            square1 = (Square) e.getSource();
            if (square1.getMyPiece() != null) {
                square1.getMyPiece().findPossibleMove(ground);
                possibleMove = square1.getMyPiece().getPossibleMoves();
                for (Square s : possibleMove) {
                    (s).setBackground(new Color(114, 0, 23));
                }
            }
            turn =1;
        }
        else{
            Square square2 =(Square)e.getSource();
            if(possibleMove.contains(square2)){
                square2.setMyPiece(square1.getMyPiece());
                square2.getMyPiece().setImage(square2,square2.getMyPiece().getColor());
                square2.getMyPiece().setRow(square2.getRow());
                square2.getMyPiece().setColumn(square2.getColumn());
                square1.setMyPiece(null);
                square1.removeImage(square1);
            }
            for (Square s : possibleMove) {
                s.setBackground(s);
            }
            turn=0;
            possibleMove.clear();
        }


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
