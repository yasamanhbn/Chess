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
    private int playerSelector;
    private ArrayList<Square> possibleMove;
    public SquaresListener(Ground ground) {
        this.ground = ground;
        playerSelector = 0;
        turn =0 ;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Board.setText(" ");
            if (turn == 0) {
                //manage turn for player
                if (((Square)e.getSource()).getMyPiece()!=null){
                    if (playerSelector % 2 == 0 && ((Square) e.getSource()).getMyPiece().getColor().equals("black")) {
                        Board.setText("white turn");
                        return;
                    } else if (playerSelector % 2 == 1 && ((Square) e.getSource()).getMyPiece().getColor().equals("white")) {
                        Board.setText("black turn");
                        return;
                    }
                }

                square1 = (Square) e.getSource();
                if (square1.getMyPiece() != null) {
                    square1.getMyPiece().findPossibleMove(ground);
                    possibleMove = square1.getMyPiece().getPossibleMoves();
                    //set red background for possible move
                    for (Square s : possibleMove) {
                        (s).setBackground(new Color(139, 0, 25));
                    }
                }
                if(possibleMove.size()!=0)
                    turn = 1;
            }
            else {
                Square square2 = (Square) e.getSource();
                if (possibleMove.contains(square2)) {
                    //change pieces place;
                    square2.setMyPiece(square1.getMyPiece());
                    square2.getMyPiece().setImage(square2, square2.getMyPiece().getColor());
                    square2.getMyPiece().setRow(square2.getRow());
                    square2.getMyPiece().setColumn(square2.getColumn());
                    square1.setMyPiece(null);
                    square1.removeImage(square1);
                    //change panel background
                    playerSelector++;
                    if(playerSelector%2==0)
                        Board.setWhiteBack();
                    else
                        Board.setBlackBack();
                }
                //remove red background
                for (Square s : possibleMove) {
                    s.setBackground(s);
                }
                turn = 0;
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
