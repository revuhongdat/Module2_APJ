package lab_singleton;

public class BookSingleton {
    private final String author;
    private final String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;
    // Khai báo constructor sách
    private BookSingleton(){
        author = "Gamma, Helm, Johnson, and Vlissides";
        title  = "Design Patterns";
        book = null;
        isLoanedOut = false;  // sách đang không cho mượn
    }
    // Nếu sách đang không được cho mượn và chưa khởi tạo quyển sách nà
    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {                     // Nếu trạng thái cho mượn : false
            if (book == null) {                 // Nếu chưa có obj book nào được khởi tạo
                book = new BookSingleton();     // Khởi tạo 1 obj mới
            }
            isLoanedOut = true;                 // Đổi trạng thái cho mượn : true
            return book;                        // Trả về obj vừa tạo
        }
        return null;                            // Trả về null nếu trạng thái cho mượn : true
    }
    // Trả trạng thái sách đang k cho mượn
    public void returnBook(BookSingleton bookReturned){
        isLoanedOut = false;
    }
    // Lấy thông tin sách về
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle(){
        return getTitle() + " by " + getAuthor();
    }
}
