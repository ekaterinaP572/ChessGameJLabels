package chess.pieces;

public class Queen extends ChessPiece{
    public Queen(ChessBoard board, int x, int y, ChessSprite.Color color) {
        super(board, color == Color.WHITE ? "resources/Chess_qlt60.png" : "resources/Chess_qdt60.png",
                "resources/Chess_qat60.png", x, y, color);
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        return false;
    }
}
