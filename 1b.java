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