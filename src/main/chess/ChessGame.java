package chess;
import chess.ui.componentui.ComponentGamePanel;

import javax.swing.*;
import java.awt.*;

public class ChessGame extends JFrame {
    public ChessGame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                add(new ComponentGamePanel(60));
                pack();
        setResizable(false);

    }
    public static void main(String[] args){
        new ChessGame().setVisible(true);

    }
}