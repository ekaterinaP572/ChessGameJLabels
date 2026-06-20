package chess.ui.componentui;

import chess.pieces.ChessBoard;
import chess.pieces.ChessField;
import chess.pieces.ChessSprite;
import chess.ui.GamePanel;

import java.util.ArrayList;

public class ComponentGamePanel extends GamePanel {
    private ArrayList<PieceLabel> labels;
    private ChessField sprite;


    public ComponentGamePanel(int fieldSize){
        super(fieldSize);
        labels = new ArrayList<>();

        //ChessField sprite = new ChessField(0, 0, ChessSprite.Color.WHITE);
        ChessBoard sprite1 = new ChessBoard();
        sprite1.getFields();
        for(int i = 0; i< gerBoard().getFields().length; i++){
            sprite = new ChessField(sprite.getBoardX(), sprite.getBoardY(), ChessSprite.Color.WHITE);
            PieceLabel pieceLabel = new PieceLabel(sprite);
            labels.add(pieceLabel);
        }
      //  ChessField sprite = new ChessField(gerBoard().)
     //   PieceLabel pieceLabel new PieceLabel(gerBoard().)
       // ChessField sprite = new ChessField(0, 0, ChessSprite.Color.WHITE);

    }
    public void updateGUI(){

    }
}
