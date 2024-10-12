//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my Library");
        Book book1 = new Book();
        Book book2 = new Book("The Secret");
        Book book3 = new Book("Clean Java Code", "Robert C. Martin");
        //System.out.println("The book named " + book1.BookTitle + " is written by " + book1.BookAuthor);

        book1.aboutbook();
        book2.aboutbook();
        book3.aboutbook();
    }
}