package chess.ui;

import chess.pieces.ChessBoard;
import chess.pieces.ChessField;
import chess.pieces.ChessSprite;
import chess.ui.componentui.PieceLabel;

import javax.swing.*;
import java.awt.*;

public abstract class GamePanel extends JPanel {
    private ChessBoard board;
    private int fieldSize;


    public GamePanel(int fieldSize) {
        board = new ChessBoard();
        setLayout(null);
        setSize(new Dimension(8 * this.getfieldSize(),
                8 * this.getfieldSize()));
        /*ChessField testSprite = new ChessField(0, 0, ChessSprite.Color.WHITE);
        PieceLabel testLabel = new PieceLabel(testSprite);
        testLabel.setBounds(0, 0, 60, 60);
        add(testLabel);
        testSprite = new ChessField(0, 0, ChessSprite.Color.BLACK);
        testLabel = new PieceLabel(testSprite);
        testLabel.setBounds(0, 60, 60, 60);
        add(testLabel);
*/

    }
    public int getfieldSize(){
        return fieldSize;
    }
    public ChessBoard gerBoard(){
        return board;
    }
    public abstract void updateGUI();



}
