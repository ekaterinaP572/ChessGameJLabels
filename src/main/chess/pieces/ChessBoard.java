package chess.pieces;

public class ChessBoard {
    private ChessField[][] fields;

    public ChessBoard() {
        fields = new ChessField[8][8];

        for (int zeile = 0; zeile < 8; zeile++) {
            for(int spalte = 0; spalte < 8; spalte++){
                if((spalte + zeile) % 2 == 0)
                fields[zeile][spalte] = new ChessField(zeile, spalte, ChessSprite.Color.BLACK);
                else{
                    fields[zeile][spalte] = new ChessField(zeile, spalte, ChessSprite.Color.WHITE);


                }
            }
        }


    }

    public ChessField[][] getFields() {
        return fields;
    }

}