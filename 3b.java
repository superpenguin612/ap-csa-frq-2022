public ArrayList<String> collectComments() {
    ArrayList<String> arr = new ArrayList<>();
  
    for (int i = 0; i < allReviews.length; i++) {
        String c = allReviews[i].getComment();
        if (review.indexOf("!") != -1) {
            String lastChar = c.substring(review.length() - 1);
            String addChar = "";
            if (!(lastChar.equals(".") || lastChar.equals("!"))) {
                addChar = ".";
            }
            arr.add(i + "-" + c + addChar);
        }
    }
  
    return arr;
}