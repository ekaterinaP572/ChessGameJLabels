package chess.pieces;

public class King extends ChessPiece {
    public King(ChessBoard board, int x, int y, ChessSprite.Color color) {
        super(board, color == Color.WHITE ? "resources/Chess_klt60.png" : "resources/Chess_kdt60.png",
                "resources/Chess_kat60.png", x, y, color);
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        if (boardX == x && (boardY == y + 2 || boardY == y + 1)) {
            return true;}
            else{
                return false;
            }
        }
    }
}
