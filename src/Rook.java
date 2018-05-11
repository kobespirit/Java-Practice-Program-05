/**
 * COMP90041 Program 
 * Project Name: Rook.java
 * Student ID:653909 
 * Login ID: changjianm
 * Author: Changjian MA 
 * Date: 10/10/2015
 * Java program to implement the chess piece function.
 */
public class Rook extends ChessPiece {

    public Rook(int row, int column) {
        super(row, column);
    }

    @Override
    public boolean validMove(int toRow, int toColumn) {
        if ((this.getRow() == toRow || this.getColumn() == toColumn)
                && whetherValid(toRow, toColumn) == true)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Rook at (" + row + "," + column + ")";
    }

}
