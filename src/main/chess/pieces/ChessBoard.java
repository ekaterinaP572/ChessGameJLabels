package chess.pieces;

import chess.ui.componentui.PieceLabel;

import java.util.LinkedList;
import java.util.List;

public class ChessBoard {
    private ChessField[][] fields;
    private List<ChessPiece> pieces;


    public ChessBoard() {
        fields = new ChessField[8][8];
        pieces = new LinkedList<>();

        for (int zeile = 0; zeile < 8; zeile++) {
            for(int spalte = 0; spalte < 8; spalte++){
                if((spalte + zeile) % 2 == 0)
                fields[zeile][spalte] = new ChessField(zeile, spalte, ChessSprite.Color.WHITE);
                else{
                    fields[zeile][spalte] = new ChessField(zeile, spalte, ChessSprite.Color.BLACK);
                }
            }
        }

        setupBoard();

    }
    private void setupBoard(){
        for (int i = 0; i < 8; i++) {
            Pawn pawn = new Pawn(this, i, 1, ChessSprite.Color.BLACK);
                pieces.add(pawn);

        }for (int i = 0; i < 8; i++) {
            Pawn pawn = new Pawn(this, i, 6, ChessSprite.Color.WHITE);
            pieces.add(pawn);

        }

        Rook rook = new Rook(this, 0, 0, ChessSprite.Color.BLACK);
        pieces.add(rook);
        Rook rook1 = new Rook(this, 7, 0, ChessSprite.Color.BLACK);
        pieces.add(rook1);
        Rook rook2 = new Rook(this, 0, 7, ChessSprite.Color.WHITE);
        pieces.add(rook2);
        Rook rook3 = new Rook(this, 7, 7, ChessSprite.Color.WHITE);
        pieces.add(rook3);


        Knight knight0 = new Knight(this, 1, 0, ChessSprite.Color.BLACK);
        pieces.add(knight0);
        Knight knight1 = new Knight(this, 6, 0, ChessSprite.Color.BLACK);
        pieces.add(knight1);
        Knight knight2 = new Knight(this, 6, 7, ChessSprite.Color.WHITE);
        pieces.add(knight2);
        Knight knight3 = new Knight(this, 1, 7, ChessSprite.Color.WHITE);
        pieces.add(knight3);

        Bishop bishop0 = new Bishop(this, 2,0, ChessSprite.Color.BLACK);
        pieces.add(bishop0);
        Bishop bishop1 = new Bishop(this, 5,0, ChessSprite.Color.BLACK);
        pieces.add(bishop1);
        Bishop bishop2 = new Bishop(this, 2,7, ChessSprite.Color.WHITE);
        pieces.add(bishop2);
        Bishop bishop3 = new Bishop(this, 5,7, ChessSprite.Color.WHITE);
        pieces.add(bishop3);

        King king = new King(this, 4,0,  ChessSprite.Color.BLACK);
        pieces.add(king);
        King king1 = new King(this, 3,7,  ChessSprite.Color.WHITE);
        pieces.add(king1);

        Queen queen = new Queen(this, 3,0,  ChessSprite.Color.BLACK);
        pieces.add(queen);
        Queen queen1 = new Queen(this, 4,7,  ChessSprite.Color.WHITE);
        pieces.add(queen1);



    }
    public void highlight(int x, int y){
        fields[x][y].setHighlighted(true);



    }
    public void unhighlightAll(){
        for (int i = 0; i < getFields().length; i++) {
            for (int j = 0; j < getFields().length; j++) {
                fields[i][j].setHighlighted(false);

            }

        }

    }

    public List<ChessPiece> getPieces() {
        return pieces;
    }

    public ChessField[][] getFields() {
        return fields;
    }

}