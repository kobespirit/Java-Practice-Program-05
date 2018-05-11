/**
 * COMP90041 Program 
 * Project Name: Knight.java
 * Student ID:653909 
 * Login ID: changjianm
 * Author: Changjian MA 
 * Date: 10/10/2015
 * Java program to implement the chess piece function.
 */
public class Knight extends ChessPiece {

    public Knight(int row, int column) {
        super(row, column);
    }

    @Override
    public boolean validMove(int toRow, int toColumn) {
        if ((Math.abs(this.getRow() - toRow) == 2
                && Math.abs(this.getColumn() - toColumn) == 1
                || Math.abs(this.getRow() - toRow) == 1
                        && Math.abs(this.getColumn() - toColumn) == 2)
                && whetherValid(toRow, toColumn) == true)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Knight at (" + row + "," + column + ")";
    }

}
