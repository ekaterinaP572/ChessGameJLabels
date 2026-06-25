package chess.pieces;

public class Pawn extends ChessPiece {

    public Pawn(ChessBoard board, int x, int y, ChessSprite.Color color) {
        super(board, color == Color.WHITE ? "resources/Chess_plt60.png" : "resources/Chess_pdt60.png",
                "resources/Chess_paat60.png", x, y, color);

    }

    @Override
    public boolean canMoveTo(int x, int y) {
        if(getColor() == Color.WHITE && boardX==x && (boardY== y+2 || boardY== y+1) ){
            return true;
        }else if(getColor() == Color.BLACK && boardX==x && (boardY== y-2 ||  boardY== y-1) )
        {
            return true;
        }
        else {
            return false;
        }
    }
}
