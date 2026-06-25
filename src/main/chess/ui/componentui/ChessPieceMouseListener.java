package chess.ui.componentui;

import chess.pieces.*;
import chess.ui.GamePanel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessPieceMouseListener implements MouseListener {
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
        Component c = e.getComponent();
        System.out.println("mouse pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        Component c = e.getComponent();
        System.out.println("mouse released");
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
}
