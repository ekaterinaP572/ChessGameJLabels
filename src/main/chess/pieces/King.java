package chess.pieces;

public class King extends ChessPiece {
    public King(ChessBoard board, int x, int y, ChessSprite.Color color) {
        super(board, color == Color.WHITE ? "resources/Chess_klt60.png" : "resources/Chess_kdt60.png",
                "resources/Chess_kat60.png", x, y, color);
    }

    @Override
    public boolean canMoveTo(int x, int y) {

        if ((boardX == x - 1 && boardY == y) || (boardX == x + 1 && boardY == y)
                || (boardX == x && boardY == y+1) || (boardX == x && boardY == y - 1) ||
                boardX == x + 1 && boardY == y + 1 || (boardX == x + 1 && boardY == y - 1)
                || (boardX == x - 1 && boardY == y - 1) || (boardX == x - 1 && boardY == y + 1)) {
            return true;
        }

        return false;

    }
}

