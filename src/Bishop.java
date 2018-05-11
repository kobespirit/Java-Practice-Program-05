/**
 * COMP90041 Program 
 * Project Name: Bishop.java 
 * Student ID: 653909 
 * Login ID: changjianm 
 * Author: Changjian MA 
 * Date: 10/10/2015 
 * Java program to implement the chess piece function.
 */
public class Bishop extends ChessPiece {

    public Bishop(int row, int column) {
        super(row, column);
    }

    @Override
    public boolean validMove(int toRow, int toColumn) {
        if (Math.abs(
                (this.getRow() - toRow) / (this.getColumn() - toColumn)) == 1
                && whetherValid(toRow, toColumn) == true)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Bishop at (" + row + "," + column + ")";
    }

}
