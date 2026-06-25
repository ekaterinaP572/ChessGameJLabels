package chess.pieces;

public class Knight extends ChessPiece{
    public Knight(ChessBoard board, int x, int y, ChessSprite.Color color){
        super(board, color == Color.WHITE ? "resources/Chess_nlt60.png" : "resources/Chess_ndt60.png",
                "resources/Chess_nat60.png", x,y, color);
    }

    public boolean canMoveTo(int x, int y){
            if (boardX == x-1 && boardY == y + 2|| (boardX == x -1 && boardY == y-2)
                    || (boardX == x+1 && boardY == y +2) || (boardX == x+1 && boardY == y-2) ||
                    boardX == x+2 && boardY == y + 1 || (boardX == x +2 && boardY == y-1)
                    || (boardX == x-2 && boardY == y - 1) || (boardX == x - 2 && boardY == y+1)) {
                return true;
            }
        return false;
    }
}
