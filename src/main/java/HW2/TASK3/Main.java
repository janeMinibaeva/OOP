package HW2.TASK3;

public class Main {
    public static void main(String[] args) {
        BookCase bookCase = new BookCase(5,"russian");
        bookCase.addBook(new Book("ii","simva","pop",202));
        bookCase.addBook(new Book("iggi","simvag","pop",202));
        bookCase.addBook(new Book("tiggi","simvag","pop",202));
        System.out.println(bookCase.sizeBookCase());
        bookCase.addBook(new Book("ivi","simva","pop",202));
        System.out.println(bookCase.sizeBookCase());
        bookCase.removeBook("ii");
        System.out.println(bookCase.sizeBookCase());
        bookCase.removeBook("iggi");
        bookCase.removeBook("ivi");
        bookCase.removeBook("tiggi");
        bookCase.removeBook("tiyyi");

    }
}
