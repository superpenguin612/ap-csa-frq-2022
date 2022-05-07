public double getAverageRating() {
    int total = 0;
    
    for (Review r : allReviews) {
        total += r.getRating();
    }
  
    return (double) total / allReviews.size();
  }
