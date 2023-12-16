import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Model {
    private int[][] currentTable;
    private int[][] solvedTable = new int[9][9];
    private int[][][] sudokuTables = new int[10][9][9];
    private int selected = 0;
    Model(){
        try {
            File file = new File("tables.txt");
            Scanner scan = new Scanner(file);
            for (int i = 0; i < 10; i ++) {
                for (int j = 0; j < 9; j ++) {
                    for (int k = 0; k < 9; k ++) {
                        sudokuTables[i][j][k] = scan.nextInt();
                    }
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        reset();
    }
    void startGame(){
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                currentTable[i][j] = sudokuTables[selected][i][j];
            }
        }
        complete();
    }
    void generate(){
        selected ++;
        selected %= 10;
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                currentTable[i][j] = sudokuTables[selected][i][j];
            }
        }
        complete();
    }
    void reset(){
        currentTable = new int[9][9];
    }
    void restart(){
        reset();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                currentTable[i][j] = sudokuTables[selected][i][j];
            }
        }
    }
    int getCurrentTableValue(int i, int j){
        return currentTable[i][j];
    }
    int getInitialTableValue(int i, int j){
        return sudokuTables[selected][i][j];
    }
    int getSolutionTableValue(int i, int j){
        return solvedTable[i][j];
    }
    void setRowsCols(int number, int i, int j){
        currentTable[i][j] = number;
    }
    int valid(int xi, int xj, int x){
        for (int i = 0; i < 9; i++) {
            if(solvedTable[xi][i] == x || solvedTable[i][xj] == x)
                return 0;
        }
        xi = xi - xi % 3;
        xj = xj - xj % 3;
        for (int i = xi; i < xi + 3; i++) {
            for (int j = xj; j < xj + 3; j++) {
                if(solvedTable[i][j] == x)
                    return 0;
            }
        }
        return 1;
    }
    void complete(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                solvedTable[i][j] = sudokuTables[selected][i][j];
            }
        }
        complete(0, 0);
    }
    int complete(int ki, int kj){
        if(ki == 9)
            return 1;
        int kiNext, kjNext;
        kjNext = (kj + 1) % 9;
        if(kj == 8){
            kiNext = ki + 1;
        }
        else
            kiNext = ki;
        if(solvedTable[ki][kj] != 0)
            return complete(kiNext, kjNext);
        for (int x = 1; x <= 9; x++) {
            if(valid(ki, kj, x) != 0){
                solvedTable[ki][kj] = x;
                if(complete(kiNext, kjNext) != 0)
                    return 1;
            }
            solvedTable[ki][kj] = 0;
        }
        return 0;
    }
    void print(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(solvedTable[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
