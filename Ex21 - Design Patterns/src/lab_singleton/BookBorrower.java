package lab_singleton;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;
    // Phương thức mượn sách

    public BookBorrower() {}

    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();      // Lấy ra quyển sách

        if(borrowedBook == null){                       // Nếu
            haveBook = false;
        }else {
            haveBook = true;
        }
    }
    // Lấy về thông tin sách mượn
    public String getAuthorAndTitle(){
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }
    // Trả sách
    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
