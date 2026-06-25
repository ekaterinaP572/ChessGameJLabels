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
        this.fieldSize = fieldSize;
        board = new ChessBoard();
        setLayout(null);
        setSize(new Dimension(8 * this.getfieldSize(),
                8 * this.getfieldSize()));
        setPreferredSize(new Dimension(8 * this.getfieldSize(),
                8 * this.getfieldSize()));

    }
    public int getfieldSize(){
        return fieldSize;
    }
    public ChessBoard getBoard(){
        return board;
    }
    public abstract void updateGUI();



}
