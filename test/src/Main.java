import java.awt.*;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        Graphics g = null;
        for (int row=0; row<3; row++)
        {
            for (int col=0; col<3; col++)
                if (board[row][col] > 0) { // deseneaza X
                    g.drawLine(col*10, row*10 , col*10+8, row*10+8);
                    g.drawLine(col*10, row*10+8, col*10+8, row*10 );
                }
                else if (board[row][col] < 0)
                { // deseneaza O
                    g.drawOval(col*10, row*10, 8, 8);
                }
            }
        }
    }
}