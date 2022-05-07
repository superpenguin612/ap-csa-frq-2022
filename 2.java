/**
 * 2022 AP Computer Science Exam - Free Response Questions (FRQ)
 * Problems definition: https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 * Solutions for question 2.
 */

public class Textbook extends Book {
    private int edition;

    public Textbook(String bookTitle, double bookPrice, int bookEdition) {
        super(bookTitle, bookPrice);
        edition = bookEdition;
    }

    public int getEdition() {
        return edition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }

    public boolean canSubstituteFor(Textbook t) {
        return getTitle().equals(t.getTitle())
                && getEdition() >= t.getEdition();
    }
}
