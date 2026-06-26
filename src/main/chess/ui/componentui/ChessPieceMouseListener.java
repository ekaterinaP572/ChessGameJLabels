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
                if (sprite instanceof Pawn pawn) {
                    pawn.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (pawn.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else if (sprite instanceof Rook rook) {
                    rook.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (rook.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else if (sprite instanceof Knight knight) {
                    knight.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (knight.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else if (sprite instanceof Bishop bishop) {
                    bishop.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (bishop.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else if (sprite instanceof King king) {
                    king.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (king.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else if (sprite instanceof Queen queen) {
                    queen.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (queen.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else {
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
                if (sprite instanceof Pawn pawn) {
                    pawn.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (pawn.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);
                            }
                        }
                    }

                } else if (sprite instanceof Rook rook) {
                    rook.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (rook.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else if (sprite instanceof Knight knight) {
                    knight.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (knight.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else if (sprite instanceof Bishop bishop) {
                    bishop.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (bishop.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else if (sprite instanceof King king) {
                    king.setHighlighted(true);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (king.canMoveTo(i1, j)) {
                                panel.getBoard().getFields()[i1][j].setHighlighted(true);

                            }
                        }
                    }
                } else if (sprite instanceof Queen queen) {
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
            count++;

            } else {
            System.out.println("Mouse clicked again!");
            Component c = e.getComponent();
            if (c instanceof PieceLabel piece) {
                ChessSprite sprite = piece.getSprite();
                if (sprite instanceof Pawn pawn) {
                    pawn.setHighlighted(false);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (pawn.canMoveTo(i1, j)) {
                                panel.getBoard().unhighlightAll();

                            }
                        }
                    }
                }
                else if (sprite instanceof Rook rook) {
                    rook.setHighlighted(false);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (rook.canMoveTo(i1, j)) {
                                panel.getBoard().unhighlightAll();

                            }
                        }
                    }
                } else if (sprite instanceof Knight knight) {
                    knight.setHighlighted(false);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (knight.canMoveTo(i1, j)) {
                                panel.getBoard().unhighlightAll();

                            }
                        }
                    }
                } else if (sprite instanceof Bishop bishop) {
                    bishop.setHighlighted(false);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (bishop.canMoveTo(i1, j)) {
                                panel.getBoard().unhighlightAll();

                            }
                        }
                    }
                } else if (sprite instanceof King king) {
                    king.setHighlighted(false);
                    for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                        for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                            if (king.canMoveTo(i1, j)) {
                                panel.getBoard().unhighlightAll();

                            }
                        }
                    }
                } else if (sprite instanceof Queen queen) {
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
            if (sprite instanceof Pawn pawn) {
                pawn.setHighlighted(false);
            }else if (sprite instanceof Rook rook){
                rook.setHighlighted(false);
            }else if (sprite instanceof Bishop bishop){
                bishop.setHighlighted(false);
            }else if (sprite instanceof Knight knight){
                knight.setHighlighted(false);
            }else if (sprite instanceof King king){
                king.setHighlighted(false);
            }else if (sprite instanceof Queen queen){
                queen.setHighlighted(false);
            }
        }
        panel.updateGUI();
        }

    @Override
    public void mouseExited(MouseEvent e) {
       if(count==1){}
       else {
           Component c = e.getComponent();
           if (c instanceof PieceLabel piece) {
               ChessSprite sprite = piece.getSprite();
               if (sprite instanceof Pawn pawn) {
                   pawn.setHighlighted(false);
                   for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                       for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                           if (pawn.canMoveTo(i1, j)) {
                               panel.getBoard().unhighlightAll();

                           }
                       }
                   }

               } else if (sprite instanceof Rook rook) {
                   rook.setHighlighted(false);
                   for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                       for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                           if (rook.canMoveTo(i1, j)) {
                               panel.getBoard().unhighlightAll();

                           }
                       }
                   }
               } else if (sprite instanceof Knight knight) {
                   knight.setHighlighted(false);
                   for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                       for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                           if (knight.canMoveTo(i1, j)) {
                               panel.getBoard().unhighlightAll();

                           }
                       }
                   }
               } else if (sprite instanceof Bishop bishop) {
                   bishop.setHighlighted(false);
                   for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                       for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                           if (bishop.canMoveTo(i1, j)) {
                               panel.getBoard().unhighlightAll();

                           }
                       }
                   }
               } else if (sprite instanceof King king) {
                   king.setHighlighted(false);
                   for (int i1 = 0; i1 < panel.getBoard().getFields().length; i1++) {
                       for (int j = 0; j < panel.getBoard().getFields().length; j++) {
                           if (king.canMoveTo(i1, j)) {
                               panel.getBoard().unhighlightAll();

                           }
                       }
                   }
               } else if (sprite instanceof Queen queen) {
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
       }
            panel.updateGUI();
        }

    @Override
    public void mouseDragged(MouseEvent e) {

        Component c = e.getComponent();
        if (c instanceof PieceLabel piece) {
                ChessSprite sprite = piece.getSprite();
                if (sprite instanceof Pawn pawn) {
                    pawn.setHighlighted(true);
                    int newPositionX = piece.getX() + e.getX();
                    int newPositionY = piece.getY() + e.getY();

                    piece.setLocation(newPositionX, newPositionY);
                    double newX1 = Math.round((double)newPositionX/60.0);
                    double newY1 = Math.round((double)newPositionY/60.0);
                    pawn.setBoardX((int)newX1);
                    pawn.setBoardY((int)newY1);

                } else if (sprite instanceof Rook rook) {
                   rook.setHighlighted(true);
                    int newPositionX = piece.getX() + e.getX();
                    int newPositionY = piece.getY() + e.getY();

                    piece.setLocation(newPositionX, newPositionY);
                    double newX1 = Math.round((double)newPositionX/60.0);
                    double newY1 = Math.round((double)newPositionY/60.0);
                    rook.setBoardX((int)newX1);
                    rook.setBoardY((int)newY1);

                    piece.setLocation(newPositionX, newPositionY);
                } else if (sprite instanceof Bishop bishop) {
                    bishop.setHighlighted(true);
                    int newPositionX = piece.getX() + e.getX();
                    int newPositionY = piece.getY() + e.getY();

                    piece.setLocation(newPositionX, newPositionY);
                    double newX1 = Math.round((double)newPositionX/60.0);
                    double newY1 = Math.round((double)newPositionY/60.0);
                    bishop.setBoardX((int)newX1);
                    bishop.setBoardY((int)newY1);

                    piece.setLocation(newPositionX, newPositionY);
                } else if (sprite instanceof Knight knight) {
                    knight.setHighlighted(true);
                    int newPositionX = piece.getX() + e.getX();
                    int newPositionY = piece.getY() + e.getY();

                    piece.setLocation(newPositionX, newPositionY);
                    double newX1 = Math.round((double)newPositionX/60.0);
                    double newY1 = Math.round((double)newPositionY/60.0);
                    knight.setBoardX((int)newX1);
                    knight.setBoardY((int)newY1);

                } else if (sprite instanceof King king) {
                    king.setHighlighted(true);
                    int newPositionX = piece.getX() + e.getX();
                    int newPositionY = piece.getY() + e.getY();

                    piece.setLocation(newPositionX, newPositionY);
                    double newX1 = Math.round((double)newPositionX/60.0);
                    double newY1 = Math.round((double)newPositionY/60.0);
                    king.setBoardX((int)newX1);
                    king.setBoardY((int)newY1);

                    piece.setLocation(newPositionX, newPositionY);
                } else if (sprite instanceof Queen queen) {
                    queen.setHighlighted(true);
                    int newPositionX = piece.getX() + e.getX();
                    int newPositionY = piece.getY() + e.getY();

                    piece.setLocation(newPositionX, newPositionY);
                    double newX1 = Math.round((double)newPositionX/60.0);
                    double newY1 = Math.round((double)newPositionY/60.0);
                   queen.setBoardX((int)newX1);
                   queen.setBoardY((int)newY1);

                }
        }
        panel.updateGUI();
    }


    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
