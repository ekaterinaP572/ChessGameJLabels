package chess.ui.componentui;

import chess.pieces.*;
import chess.ui.GamePanel;

import java.util.ArrayList;

public class ComponentGamePanel extends GamePanel {
    private ArrayList<PieceLabel> labels;
    private ArrayList<PieceLabel> chessfield;
    private ChessField sprite;



    public ComponentGamePanel(int fieldSize){
        super(fieldSize);
        labels = new ArrayList<>();
        chessfield = new ArrayList<>();
        ChessPieceMouseListener listener = new ChessPieceMouseListener(this);
        ChessPieceMouseListener listener1 = new ChessPieceMouseListener(this);
        ChessBoard sprite1 = getBoard();

        for(int i = 0; i< sprite1.getFields().length; i++){
            for (int j = 0; j < sprite1.getFields().length; j++) {

               sprite = getBoard().getFields()[i][j];
                PieceLabel pieceLabel = new PieceLabel(sprite);
                pieceLabel.setBounds(sprite.getBoardX() * getfieldSize(), sprite.getBoardY() * getfieldSize(),
                        getfieldSize(), getfieldSize());
                chessfield.add(pieceLabel);
            }
        }

       for (int i = 0; i < sprite1.getPieces().size() ; i++) {
            ChessPiece piece = sprite1.getPieces().get(i);
            PieceLabel pieceLabel = new PieceLabel(sprite1.getPieces().get(i));
            pieceLabel.setBounds(piece.getBoardX() * getfieldSize(), piece.getBoardY() * getfieldSize(),
                    getfieldSize(), getfieldSize());
            labels.add(pieceLabel);
       }
        for (int i = 0; i < labels.size(); i++) {
            add(labels.get(i));
            labels.get(i).addMouseListener(listener);
            labels.get(i).addMouseMotionListener(listener1);
        }
        for (int i = 0; i < chessfield.size(); i++) {
            add(chessfield.get(i));
            chessfield.get(i).addMouseListener(listener);
        }


    }
    public void updateGUI() {
        for(PieceLabel l : labels) {
            l.updateIcon();
        }
        for(PieceLabel f : chessfield){
            f.updateIcon();
        }
        repaint();
    }
}
