package Ksiegarnia;
public class Book {
    String title,author;
    int pages,year;
    float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book(String title, String author, int pages, int year, float price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", pages=" + pages + ", year=" + year + ", price=" + price + '}';
    }
    
}
