package com;

import pieces.Piece;
import java.util.ArrayList;

public class Player {
    private String color;
    private ArrayList<Piece> loosePiece;
    private boolean loose;
    public Player(String color) {
        this.color = color;
        loosePiece = new ArrayList<>();
        loose = false;
    }

    public void setLoose(boolean loose) {
        this.loose = loose;
    }

    public boolean isLoose() {
        return loose;
    }
    public void addToLoosePiece(Piece piece){
        loosePiece.add(piece);
    }
}
