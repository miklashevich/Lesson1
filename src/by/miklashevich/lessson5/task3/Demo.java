package by.miklashevich.lessson5.task3;



public class Demo {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        Book book1 = new Book(32, "Чипполино", "Ivanov", "Maslov", 1954,455,123 );
        Book book2 = new Book(33, "Wild World", "Petrov", "Kiev", 2004,677,321);
        Book book3 = new Book(34, "Big Wild World", "Sidorov", "Minsk", 2014,477,455);
        Book book4 = new Book(35, "Дикий запад", "Sidorov", "Maslov", 1955,455,123 );
        Book book5 = new Book(36, "Война и мир", "Ivanov", "Maslov", 1956,455,123 );
        Book book6 = new Book(37, "Буратино", "Ivanov", "Kiev", 1957,455,123 );

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        books[5] = book6;


        System.out.println(BookService.findAuthor(books, "Sidorov"));
        System.out.println(BookService.findPublishing(books, "Kiev"));
        System.out.println(BookService.findYear(books, 1955));
    }
}

