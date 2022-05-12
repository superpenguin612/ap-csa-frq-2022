/**
 * 2022 AP Computer Science Exam - Free Response Questions (FRQ)
 * Problems definition: https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 * Solutions for question 1(a).
 */
 
public int getScore() {
    int score = 0;

    if (levelOne.goalReached()) {
        score += levelOne.getPoints();
        if (levelTwo.goalReached()) {
            score += levelTwo.getPoints();
            if (levelThree.goalReached()) {
                score += levelThree.getPoints();
            }
        }
    }

    if(isBonus()) {
        score *= 3;
    }

    return score;
}

/**
 * Alternate solution, using a boolean guard in a flat chain of if().
 */
 public int getScore() {
    int score = 0;
    boolean more = levelOne.goalReached();

    if (more) {
        score += levelOne.getPoints();
        more = levelTwo.goalReached();
    }
    if (more) {
        score += levelTwo.getPoints();
        more = levelThree.goalReached();
    }
    if (more) {
        score += levelThree.getPoints();
    }
    
    if (isBonus()) {
        score *= 3;
    }
    
    return score;
 }
 
/**
 * Alternate solution, using an array for the three levels.
 */
public int getScore() {
    Level[] levels = new Level[] {levelOne, levelTwo, levelThree};
    
    int score = 0;
    for (int i = 0; i < levels.length && levels[i].goalReached(); i++) {
        score += levels[i].getPoints();
    }
    
    if (isBonus()) {
        score *= 3;
    }
    
    return score;
}
