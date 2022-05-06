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