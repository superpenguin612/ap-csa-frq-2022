public void repopulate() {
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            int value = (int) (Math.random() * MAX) + 1;
            while (!(value % 10 == 0 && value % 100 != 0)) {
                value = (int) (Math.random() * MAX) + 1;
            }
            grid[i][j] = val;
        }
    }
}
