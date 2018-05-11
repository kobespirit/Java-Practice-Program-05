/**
 * COMP90041 Program 
 * Project Name: ChessPiece.java
 * Student ID:653909 
 * Login ID: changjianm
 * Author: Changjian MA 
 * Date: 10/10/2015
 * Java program to implement the chess piece function.
 */
public abstract class ChessPiece {

    public int row;
    public int column;

    public ChessPiece() {
    }

    public ChessPiece(int row, int column) {
        this.row = row;
        this.column = column;
    }

    abstract public boolean validMove(int toRow, int toColumn);

    public boolean whetherValid(int toRow, int toColumn) {
        if (!((toRow >= 1 && toRow <= 8) && (toColumn >= 1 && toColumn <= 8))
                || this.getRow() == toRow && this.getColumn() == toColumn)
            return false;
        return true;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
