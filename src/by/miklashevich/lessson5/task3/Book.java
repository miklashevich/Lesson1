package by.miklashevich.lessson5.task3;

public class Book {
    public int id;
    public String name;
    public String author;
    public String publishing;
    public int year;
    public int totalPage;
    public int price;

    public Book(int id, String name, String author, String publishing, int year, int totalPage, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.totalPage = totalPage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", year=" + year +
                ", totalPage=" + totalPage +
                ", price=" + price +
                '}';
    }
}
