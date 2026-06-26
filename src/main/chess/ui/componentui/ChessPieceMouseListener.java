package chess.ui.componentui;

import chess.pieces.*;
import chess.ui.GamePanel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ChessPieceMouseListener implements MouseListener, MouseMotionListener {
    private GamePanel panel;
    int count;


    public ChessPieceMouseListener(GamePanel panel){
        this.panel = panel;
        this.count=0;

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        if (count == 1) {
        } else {

            Component c = e.getComponent();
            if (c instanceof PieceLabel piece) {
                ChessSprite sprite = piece.getSprite();
                if (sprite instanceof ChessPiece piece1) {
                    piece1.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (piece1.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                }
                else {
                    panel.getBoard().unhighlightAll();
                }

            }

            panel.updateGUI();
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (count == 0) {
            System.out.println("Mouse clicked");
            Component c = e.getComponent();
            if (c instanceof PieceLabel piece) {
                ChessSprite sprite = piece.getSprite();
                if (sprite instanceof ChessPiece piece1) {
                    piece1.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (piece1.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);
                            }
                        }
                    }

                }
            }
            count++;

            } else {
            System.out.println("Mouse clicked again!");
            Component c = e.getComponent();
            if (c instanceof PieceLabel piece) {
                ChessSprite sprite = piece.getSprite();
                if (sprite instanceof ChessPiece piece1) {
                    piece1.setHighlighted(false);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (piece1.canMoveTo(i1, j)) {
                                panel.getBoard().unhighlightAll();

                            }
                        }
                    }
                }
            }
            count--;
        }
        panel.updateGUI();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        Component c = e.getComponent();
        if (c instanceof PieceLabel piece) {
            ChessSprite sprite = piece.getSprite();
            if (sprite instanceof ChessPiece piece1) {
                piece1.setHighlighted(false);
            }
            panel.updateGUI();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (count == 1) {
        } else {
            Component c = e.getComponent();
            if (c instanceof PieceLabel piece) {
                ChessSprite sprite = piece.getSprite();
                if (sprite instanceof ChessPiece piece1) {
                    piece1.setHighlighted(false);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (piece1.canMoveTo(i1, j)) {
                                panel.getBoard().unhighlightAll();

                            }
                        }
                    }
                }
            }
            panel.updateGUI();

        }
    }
    @Override
    public void mouseDragged(MouseEvent e) {

        Component c = e.getComponent();
        if (c instanceof PieceLabel piece) {
            ChessSprite sprite = piece.getSprite();
            if (sprite instanceof ChessPiece piece1) {
                piece1.setHighlighted(true);
                int newPositionX = piece.getX() + e.getX();
                int newPositionY = piece.getY() + e.getY();

                piece.setLocation(newPositionX, newPositionY);
                double newX1 = Math.round((double) newPositionX / 60.0);
                double newY1 = Math.round((double) newPositionY / 60.0);
                piece1.setBoardX((int) newX1);
                piece1.setBoardY((int) newY1);

            }
            panel.updateGUI();
        }
    }


    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
