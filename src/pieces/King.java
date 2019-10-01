package pieces;

import com.Ground;
import com.Square;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class King extends Piece {

    public King(int row, int column, String color) {
        super(row, column, color);
        type="king";
    }

    @Override
    public void setImage(Square square, String color) {
        Image img,newImage;
        try {
            if (color.equals("white")) {
                img = ImageIO.read(new FileInputStream(".\\images\\whiteKing.png"));
            }
            else {
                img = ImageIO.read(new FileInputStream(".\\images\\blackKing.png"));
            }
            newImage = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            square.setIcon(new ImageIcon(newImage));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void findPossibleMove(Ground ground) {
        Square[][] squares = ground.getSquares();

    }
}
