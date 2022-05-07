/**
 * 2022 AP Computer Science Exam - Free Response Questions (FRQ)
 * Problems definition: https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 * Solutions for question 3.a)
 */
 
public double getAverageRating() {
    int total = 0;
    
    for (Review r : allReviews) {
        total += r.getRating();
    }
  
    return (double) total / allReviews.length;
  }
