package uz.bakhromjon.meaningfulNames;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class MeaningfulNames {
    public static void main(String[] args) {
        int d; // elapsed time in days

        int elapsedTimeInDays;
        int daysSinceCreation;
        int daysSinceModification;
        int fileAgeInDays;

        //
        int l = 1;
        int O = 12;
        int a = l;
        if ( O == l )
//            a = O1;
            a = 1;
        else
            l = 01;
    }

    // bad code
    List<int[]> theList = new ArrayList<>();

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    // good code
    List<int[]> gameBoard = new ArrayList<>();
    final int STATUS_VALUE = 0;
    final int FLAGGED = 4;

//    public List<int[]> getFlaggedCells() {
//        List<int[]> flaggedCells = new ArrayList<int[]>();
//        for (int[] cell : gameBoard)
//            if (cell[STATUS_VALUE] == FLAGGED)
//                flaggedCells.add(cell);
//        return flaggedCells;
//    }


    static class Cell {
        boolean isFlagged;
        int[] arr;

        public boolean isFlagged() {
            return false;
        }
    }

    List<Cell> gameBoardCell = new ArrayList<>();

    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoardCell)
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        return flaggedCells;
    }

    public void XYZControllerForEfficientHandlingOfStrings () {


    }

    public void XYZControllerForEfficientStorageOfStrings () {


    }
}
