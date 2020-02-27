package Graghics;

import com.Ground;
import com.Square;
import pieces.King;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class SquaresListener implements MouseListener {
    private Ground ground;
    private Square square1;
    private int turn;
    private boolean kish;
    private int playerSelector;
    private ArrayList<Square> possibleMove,temptMoving;
    public SquaresListener(Ground ground) {
        temptMoving = new ArrayList<>();
        this.ground = ground;
        playerSelector = 0;
        turn =0 ;
        kish = false;
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
                }
                if(possibleMove!=null && possibleMove.size()!=0)
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
                    if (kish) {
                        if(square2.getMyPiece().getColor().equals("white"))
                            checkForKish("black");
                        else
                            checkForKish("white");
                        if (!kish) {
                            //change panel background
                            playerSelector++;
                            if (playerSelector % 2 == 0)
                                Board.setWhiteBack();
                            else
                                Board.setBlackBack();
                        } else {
                            square1.setMyPiece(square2.getMyPiece());
                            square1.getMyPiece().setImage(square1, square1.getMyPiece().getColor());
                            square1.getMyPiece().setRow(square1.getRow());
                            square1.getMyPiece().setColumn(square1.getColumn());
                            square2.setMyPiece(null);
                            square2.removeImage(square2);
                        }
                    }
                    else {
                        if(square2.getMyPiece().getColor().equals("white"))
                            checkForKish("black");
                        else
                            checkForKish("white");
                        if(kish) {
                            square1.setMyPiece(square2.getMyPiece());
                            square1.getMyPiece().setImage(square1, square1.getMyPiece().getColor());
                            square1.getMyPiece().setRow(square1.getRow());
                            square1.getMyPiece().setColumn(square1.getColumn());
                            square2.setMyPiece(null);
                            square2.removeImage(square2);
                        }
                        else {
                            checkForKish(square2.getMyPiece().getColor());
                            playerSelector++;
                            if (playerSelector % 2 == 0)
                                Board.setWhiteBack();
                            else
                                Board.setBlackBack();
                        }
                    }
                }
                turn = 0;
                possibleMove.clear();
            }
        }
    private void checkForKish(String color) {
        ArrayList<Square> checkForKingPlace;
        ArrayList<Square> pieces = new ArrayList<>();
        Square[][] squares = ground.getSquares();
        //get all the different pieces
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (squares[i][j].getMyPiece() != null && squares[i][j].getMyPiece().getColor().equals(color)) {
                          pieces.add(squares[i][j]);
                }
            }
        }
        kish=false;
        for (Square sq : pieces) {
            sq.getMyPiece().findPossibleMove(ground);
            checkForKingPlace = sq.getMyPiece().getPossibleMoves();
            for (Square s : checkForKingPlace) {
                if (s.getMyPiece() instanceof King) {
                    kish = true;
                    System.out.println(s.getMyPiece().getColumn());
                    Board.setText("Kish");
                    break;
                }
            }
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
        Square square = (Square) e.getSource();
        if (square.getMyPiece() != null) {
            square.getMyPiece().findPossibleMove(ground);
            temptMoving = square.getMyPiece().getPossibleMoves();
            //set red background for possible move
            for (Square s : temptMoving) {
                (s).setBackground(new Color(139, 0, 25));
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(temptMoving!=null)
            for (Square s : temptMoving) {
                s.setBackground(s);
            }
    }
}
