/**
 * 2022 AP Computer Science Exam - Free Response Questions (FRQ)
 * Problems definition: https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 * Solutions for question 4(a).
 */
 
public void repopulate() {
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            int value = (int) (Math.random() * MAX) + 1;
            while (!(value % 10 == 0 && value % 100 != 0)) {
                value = (int) (Math.random() * MAX) + 1;
            }
            grid[i][j] = value;
        }
    }
}

/**
 * Alternate solution calculating the number of random choices given MAX
 * and using a mathematical formula to map each choice to a valid number.
 */
public void repopulate() {
    // given MAX we have as many choices as multiple of 10s are in the range [1..MAX]
    // from which we exclude the multiple of 100.
    int nChoices = MAX/10 - MAX/100;
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            // pick a random choice in the range [1..nChoices]
            int choice = (int)(1 + nChoices * Math.random());

            // Generate the random number verifying all constraints
            //
            // choice:            1  2 ...  9  10  11 ...  18  19 ...  27 28  ...  
            // choice*10:        10 20 ... 90 100 110 ... 180 190 ... 270 280 ...
            // offset:            0  0 ...  0  10  10 ...  10  20 ...  20  30 ...
            // choice*10+offset: 10 20 ... 90 110 120 ... 190 210 ... 290 310 ...
            //
            // Offset starts from 0 and every group of 9 choices it grows by 10 
            // => offset = 10 * (choice-1) / 9
            grid[i][j] = 10 * choice + 10 * (choice - 1) / 9;
        }
    }
}
