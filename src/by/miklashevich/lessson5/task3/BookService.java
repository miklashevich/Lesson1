package by.miklashevich.lessson5.task3;

public class BookService {

    public static boolean findAuthor(Book[] books, String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].author.equals(author)) {
                System.out.println("Книга автора " + " " + author + " "  + books[i].name);

            }

        }


        return false;
    }



    public static String findPublishing(Book[] books, String publishing) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].publishing.equals(publishing)) {
                System.out.println("Книга издательства" + " " + publishing + " " + books[i].name);
            }
        }
        return null;
    }

    public static String findYear(Book[] books, int year) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].year > year ) {
                System.out.println("Книга выпущенна после" + " " + year + " " + books[i].name);
            }
        }
        return null;
    }
}


