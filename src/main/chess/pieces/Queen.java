package chess.pieces;

public class Queen extends ChessPiece{
    public Queen(ChessBoard board, int x, int y, ChessSprite.Color color) {
        super(board, color == Color.WHITE ? "resources/Chess_qlt60.png" : "resources/Chess_qdt60.png",
                "resources/Chess_qat60.png", x, y, color);
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        for (int i = 1; i <8 ; i++) {

            if ((boardX == x && boardY == y + i)|| (boardX == x && boardY == y-i)
                    || (boardX == x+i && boardY == y) || (boardX == x-i && boardY == y) ||
                    boardX == x+i && boardY == y + i || (boardX == x +i && boardY == y-i)
                    || (boardX == x-i && boardY == y - i) || (boardX == x - i && boardY == y+i)) {
                return true;}
        }
        return false;
    }
}
