public class Book {
    private String nameBook;
    private String authorBook;
    private int agePublicBook;

    public Book(String nameBook, String authorBook, int agePublicBook ) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.agePublicBook = agePublicBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthorBook() {
        return this.authorBook;
    }

    public int getAgePublicBook() {
        return this.agePublicBook;
    }
    public void setAgePublicBook(int i) {
        this.agePublicBook = agePublicBook;
    }
}
