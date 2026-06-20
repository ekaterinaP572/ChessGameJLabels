package chess.pieces;

import javax.swing.*;

public abstract class ChessSprite {
    protected int boardX;
    protected int boardY;
    private boolean highlighted;
    private ImageIcon normalIcon;
    private ImageIcon highlightedIcon;
    public enum Color {WHITE, BLACK};

    public ChessSprite(String imagefile, String highlightedImageFile, int boardX, int boardY){
        this.boardX = boardX;
        this.boardY = boardY;
        normalIcon = new ImageIcon();
        highlightedIcon = new ImageIcon();

    }
    public ImageIcon getNormalIcon(){
        return normalIcon;
    }
    public ImageIcon getHighlightedIcon() {
        return highlightedIcon;
    }
    public int getBoardX(){
        return boardX;
    }
    public int getBoardY(){
        return boardY;
    }
    public boolean getHighlighted(){
        return highlighted;
    }
    public void setBoardX(int boardX){
        this.boardX = boardX;
    }
    public void setBoardY(int boardY){
        this.boardY = boardY;
    }
    public void setHighlighted(boolean highlighted){
        this.highlighted = highlighted;
    }
    public ImageIcon getCurrentIcon(){
        if(getHighlighted()){
            return highlightedIcon;
        }else{
            return normalIcon;
        }
    }
}
