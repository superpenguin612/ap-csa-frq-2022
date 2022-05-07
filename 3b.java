/**
 * 2022 AP Computer Science Exam - Free Response Questions (FRQ)
 * Problems definition: https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 * Solutions for question 3(b).
 */

public ArrayList<String> collectComments() {
    ArrayList<String> arr = new ArrayList<>();
  
    for (int i = 0; i < allReviews.length; i++) {
        String c = allReviews[i].getComment();
        if (c.indexOf("!") != -1) {
            String lastChar = c.substring(c.length() - 1);
            String addChar = "";
            if (!(lastChar.equals(".") || lastChar.equals("!"))) {
                addChar = ".";
            }
            arr.add(i + "-" + c + addChar);
        }
    }
  
    return arr;
}

/**
 * Alternate solution simplifying the first one a bit.
 */
public ArrayList<String> collectComments() {
    ArrayList<String> arr = new ArrayList<>();
  
    for (int i = 0; i < allReviews.length; i++) {
        String c = allReviews[i].getComment();
        if (c.indexOf("!") != -1) {
            String lastChar = c.substring(c.length() - 1);
            if (!(lastChar.equals(".") || lastChar.equals("!"))) {
                c += ".";
            }
            arr.add(i + "-" + c);
        }
    }
  
    return arr;
}

/**
 * Alternate solution checking the ending of the comment via indexOf().
 */
 public ArrayList<String> collectComments() {
    ArrayList<String> arr = new ArrayList<>();
  
    for (int i = 0; i < allReviews.length; i++) {
        String c = allReviews[i].getComment();
        if (c.indexOf("!") != -1) {
            String ending = "!.";
            
            // if the last character of the comment is not in an expected set,
            // correct the comment by appending a period to it.
            if (ending.indexOf(c.substring(c.length() - 1)) == -1) {
                c += ".";
            }
            arr.add(i + "-" + c);
        }
    }
  
    return arr;
}
