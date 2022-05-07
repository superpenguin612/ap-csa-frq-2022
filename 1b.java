/**
 * 2022 AP Computer Science Exam - Free Response Questions (FRQ)
 * Problems definition: https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 * Solutions for question 1(b).
 */
 
public int playManyTimes(int num) {
    int max = 0;
    for (int i = 0; i < num; i++) {
        play();
        int score = getScore();
        if (score > max) {
            max = score;
        }
    }
    return max;
}

/**
 * Alternate solution, using Math.max()
 */
public int playManyTimes(int num) {
    int max = 0;
    for (int i = 0; i < num; i++) {
        play();
        max = Math.max(max, getScore());
    }
	
    return max;
}
