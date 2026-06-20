package chess;
import chess.pieces.ChessField;
import chess.pieces.ChessSprite;
import chess.ui.componentui.PieceLabel;

import javax.swing.*;
import java.awt.*;

public class WindowTest extends JFrame {
    public WindowTest() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(8*60, 8*60));
        ChessField testSprite = new ChessField(0,0, ChessSprite.Color.WHITE);
        PieceLabel testLabel = new PieceLabel(testSprite);
        add(testLabel);
    }
    public static void main(String[] args) {
        new WindowTest().setVisible(true);
    }
}