package chess.pieces;

public class Knight extends ChessPiece{
    public Knight(ChessBoard board, int x, int y, ChessSprite.Color color){
        super(board, color == Color.WHITE ? "resources/Chess_nlt60.png" : "resources/Chess_ndt60.png",
                "resources/Chess_nat60.png", x,y, color);
    }

    public boolean canMoveTo(int x, int y){
        return false;

    }
}
