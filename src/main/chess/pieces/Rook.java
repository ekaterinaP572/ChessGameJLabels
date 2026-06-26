package chess.pieces;

import chess.ui.componentui.PieceLabel;

import java.awt.*;

public class Rook extends ChessPiece {
    public Rook(ChessBoard board, int x, int y, ChessSprite.Color color) {
        super(board, color == Color.WHITE ? "resources/Chess_rlt60.png" : "resources/Chess_rdt60.png",
                "resources/Chess_rat60.png", x, y, color);
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        for (int i = 1; i < 8; i++) {
            if (boardX == x && boardY == y + i || (boardX == x + i && boardY == y)
                    || (boardX == x && boardY == y - i) || (boardX == x - i && boardY == y)) {
                return true;
            }
        }
        return false;
    }
}
