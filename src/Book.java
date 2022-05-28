public class Book {
    String name;
    int total_pages;
    int release_year;
    String writer;

    Book(String name, int total_pages, int release_year, String writer) {
        this.name = name;
        this.total_pages = total_pages;
        this.release_year = release_year;
        this.writer = writer;
    }

    void setName(String name) {
        this.name = name;
    }

    void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    void setWriter(String writer) {
        this.writer = writer;
    }

    String getName() {
        return name;
    }

    int getTotal_pages() {
        return total_pages;
    }

    int getRelease_year() {
        return release_year;
    }

    String getWriter() {
        return writer;
    }

}