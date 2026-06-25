package chess.pieces;

public class Bishop extends ChessPiece{
    public Bishop(ChessBoard board, int x, int y, ChessSprite.Color color){
        super(board, color == Color.WHITE ? "resources/Chess_blt60.png" :"resources/Chess_bdt60.png",
                "resources/Chess_bat60.png", x, y, color );

        }

    @Override
    public boolean canMoveTo(int x, int y) {
        return false;
    }
}
