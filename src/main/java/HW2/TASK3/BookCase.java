package HW2.TASK3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookCase {
    private int quantityBook;
    private String languageBook;
    private List<Book> books = new ArrayList<>();

    BookCase (int quantityBook,String languageBook){
        this.quantityBook = quantityBook;
        this.languageBook = languageBook;
    }

    @Override
    public String toString() {
        return "BookCase{" +
                ", quantityBook=" + quantityBook +
                ", languageBook='" + languageBook + '\'' +
                '}';
    }


    public int getQuantityBook() {
        return quantityBook;
    }

    public void setQuantityBook(int quantityBook) throws Exception {
        this.quantityBook = quantityBook;
    }

    public String getLanguageBook() {
        return languageBook;
    }

    public void setLanguageBook(String languageBook) {
        this.languageBook = languageBook;
    }

    //добавляет книгу на полку
    public void addBook(Book book){
        if (books.size() <= quantityBook ) {
            books.add(book);
        }
        else System.out.println("Bookcase is full");
    }

    // удаляет книгу
    public void removeBook (String title){
        if (books.size() >= 1 ) {
            for (Book b : books) {
                if (title.equalsIgnoreCase(b.getBookTitle())) {
                    books.remove(b);
                    break;
                }
            }
        }
            else System.out.println("Bookshelf is empty");
    }


    // возвращает кол-во книг на полке
    public int sizeBookCase () {
        return books.size();
    }

    // поиск книги по критерию
    public void searchBook (String filterBook) {
        System.out.println(" Enter the search criteria : " +
                " -  bookTitle " + " -  Author " );
        Scanner scanner = new Scanner(System.in);
        String filter = scanner.nextLine();
        for (Book book: books) {
            if (filterBook.equalsIgnoreCase(book.getBookTitle())){
                System.out.println("This book " + book + " is on the shelf");
            }
            else if (filterBook.equalsIgnoreCase(book.getAuthor())){
                System.out.println("This book" + book +" is on the shelf");
            }
            else System.out.println("This book is not on the shelf");
        }

    }

    }


