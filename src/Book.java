public class Book {
    String BookTitle;
    String BookAuthor;

    // Since this is an default constructor, so we are not using any parameters for this one
    public Book() {
        this("Unknown", "Unkown");
    }
    // constructor with one parameter and setting the author name to Unknown
    public Book (String BookTitle) {
        this(BookTitle, "Unknown");
    }
    // constructor with two parameters
    public Book (String BookTitle, String BookAuthor) {
        this.BookTitle = BookTitle;
        this.BookAuthor = BookAuthor;
    }
    // now we will define a method

    public void aboutbook(){
        System.out.println("Title : " + BookTitle + "\n" + "Author Name : " + BookAuthor);
    }



//    public Book(String bookTitle, String bookAuthor) {
//        BookTitle = bookTitle;
//        BookAuthor = bookAuthor;

//    public Book(String bookTitle, String bookAuthor) {
//        BookTitle = bookTitle;
//        BookAuthor = String.nextString();

}