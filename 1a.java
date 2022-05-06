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
