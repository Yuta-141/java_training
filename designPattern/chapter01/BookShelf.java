import java.util.List;
import java.util.ArrayList;

public class BookShelf implements Aggregate{
    // private Book[] books;

    private List<Book> books = new ArrayList<Book>();
    private int last = 0;
    public BookShelf(int maxsize){
        //this.books = new Book[maxsize];
    }
    public Book getBookAt(int index){
        return books.get(index);
    }
    public void appendBook(Book book){
      //  this.books[last] = book;
       // last++;
       books.add(book);
    }
    public int getLength(){
        //return last;
        return books.size();
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
