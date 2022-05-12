/**
 * 2022 AP Computer Science Exam - Free Response Questions (FRQ)
 * Problems definition: https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 * Solutions for question 4(b).
 */

public int countIncreasingCols() {
    int count = 0;
    
    for (int j = 0; j < grid[0].length; j++) {
        if (grid.length == 1) {
            count++;
        } else {
            boolean increasing = true;
            for (int i = 1; i < grid.length; i++) {
                if (grid[i-1][j] > grid[i][j]) {
                    increasing = false;
                }
            }
            if (increasing) {
                count++;
            }
        }
    }
    return count;
}

/**
 * Alternate solution using a boolean variable to
 * keep track whether a column remains in increasing order.
 */
public int countIncreasingCols() {
    int count = 0;
    
    for (int c = 0; c < grid[0].length; c++) {
        boolean increasing = true;
        for (int r = 1; increasing && r < grid.length; r++) {
            increasing = (grid[r-1][c] <= grid[r][c]);
        }
        if (increasing) {
            count++;
        }
    }
    
    return count;
}

/** 
 * Alternate solution covering the edge case when grid[][] is a non-rectangular (jagged) array.
 * While jagged arrays are no longer part of the AP curricullum, students who know about them
 * were tripped to look for a more complex solution like below.
 *
 * It would have been nice for the precondition of the method to state clearly 
 * grid[][] is a rectangular double array.
 */
public int countIncreasingCols() {
    
    // Create an array list initially empty, where we
    // accumulate the largest value encountered on each column.
    // However if at any point we detect a value smaller than
    // the largest value known already, the value for that column
    // is set to null. And once is set to null it will not be tested
    // or updated anymore.
    ArrayList<Integer> colMaxValues = new ArrayList<Integer>();
    
    for (int r = 0; r < grid.length; r++) {
        for (int c = 0; grid[r] != null && c < grid[r].length; c++) {
            // if this is the first time we see column c, add the grid value into the list
            if (colMaxValues.size() <= c) {
                colMaxValues.add(grid[r][c]);
            } else {
                // we have some previous value for column c.
                Integer colMaxValue = colMaxValues.get(c);
                // if that value is null, it means we already determined c is not increasing
                // but if it is not null ...
                if (colMaxValue != null) {
                    // ... check if the grid value is decreasing, case in which we know
                    // column c is no longer increasing. So we set the value in the list to null.
                    if (colMaxValue > grid[r][c]) {
                        colMaxValues.set(c, null);
                    } else {
                        // otherwise we update the value in the list to the grid value, which is
                        // the newer max for that column.
                        colMaxValues.set(c, grid[r][c]);
                    }
                }
            }
        }
    }
    
    // The number of non-null values in the colMaxValues gives the number of increasing columns.
    int count = 0;
    for(Integer colMaxValue : colMaxValues) {
        if (colMaxValue != null) {
            count++;
        }
    }
    
    return count;
}
