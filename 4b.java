/**
 * 2022 AP Computer Science Exam - Free Response Questions (FRQ)
 * Problems definition: https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 * Solutions for question 4(b).
 */

public int countIncreasingCols() {
    int count = 0;
    
    for (int j = 0; j < grid[0].length; j++) {
        if (grid[0].length == 1) {
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
