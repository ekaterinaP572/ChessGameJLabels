package chess.ui.componentui;

import chess.pieces.*;
import chess.ui.GamePanel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessPieceMouseListener implements MouseListener {
    private GamePanel panel;

    public ChessPieceMouseListener(GamePanel panel){
        this.panel = panel;

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        Component c = e.getComponent();
        if(c instanceof PieceLabel piece) {
            ChessSprite sprite = piece.getSprite();
            if (sprite instanceof Pawn pawn) {
                pawn.setHighlighted(true);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (pawn.canMoveTo(i1, j)) {
                            panel.getBoard().getFields()[i1][j].setHighlighted(true);

                        }
                    }
                }

            }
            else if(sprite instanceof Rook rook){
                rook.setHighlighted(true);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (rook.canMoveTo(i1, j)) {
                            panel.getBoard().getFields()[i1][j].setHighlighted(true);

                        }
                    }
                }
            }
            else if(sprite instanceof Knight knight){
                knight.setHighlighted(true);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (knight.canMoveTo(i1, j)) {
                            panel.getBoard().getFields()[i1][j].setHighlighted(true);

                        }
                    }
                }
            }else if(sprite instanceof Bishop bishop){
                bishop.setHighlighted(true);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (bishop.canMoveTo(i1, j)) {
                            panel.getBoard().getFields()[i1][j].setHighlighted(true);

                        }
                    }
                }
            }
            else if(sprite instanceof King king){
                king.setHighlighted(true);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (king.canMoveTo(i1, j)) {
                            panel.getBoard().getFields()[i1][j].setHighlighted(true);

                        }
                    }
                }
            }
            else if(sprite instanceof Queen queen){
                queen.setHighlighted(true);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (queen.canMoveTo(i1, j)) {
                            panel.getBoard().getFields()[i1][j].setHighlighted(true);

                        }
                    }
                }
            }

        }

        panel.updateGUI();
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseExited(MouseEvent e) {
        Component c = e.getComponent();
        if(c instanceof PieceLabel piece){
            ChessSprite sprite = piece.getSprite();
            if (sprite instanceof Pawn pawn){
                pawn.setHighlighted(false);
                for(int i1 = 0; i1< panel.getBoard().getFields().length; i1++){
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (pawn.canMoveTo(i1, j)) {
                            panel.getBoard().unhighlightAll();

                        }
                    }
                }

            }
            else if(sprite instanceof Rook rook){
                rook.setHighlighted(false);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (rook.canMoveTo(i1, j)) {
                            panel.getBoard().unhighlightAll();

                        }
                    }
                }
            }
            else if(sprite instanceof Knight knight){
                knight.setHighlighted(false);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (knight.canMoveTo(i1, j)) {
                            panel.getBoard().unhighlightAll();

                        }
                    }
                }
            }
            else if(sprite instanceof Bishop bishop){
                bishop.setHighlighted(false);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (bishop.canMoveTo(i1, j)) {
                            panel.getBoard().unhighlightAll();

                        }
                    }
                }
            }
            else if(sprite instanceof King king){
                king.setHighlighted(false);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (king.canMoveTo(i1, j)) {
                            panel.getBoard().unhighlightAll();

                        }
                    }
                }
            }
            else if(sprite instanceof Queen queen){
                queen.setHighlighted(false);
                for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                    for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                        if (queen.canMoveTo(i1, j)) {
                            panel.getBoard().unhighlightAll();

                        }
                    }
                }
            }
        }
                panel.updateGUI();
    }
}
