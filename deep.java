class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public void display() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        // Assuming input format: AuthorName PublicationType Title
        // Example input: John BookPublication Java Programming
        if (args.length < 3) {
            System.out.println("Usage: java Main <AuthorName> <PublicationType> <Title>");
            return;
        }

        String authorName = args[0];
        String publicationType = args[1];
        String title = args[2];

        Book publication;
        if (publicationType.equalsIgnoreCase("BookPublication")) {
            publication = new BookPublication(authorName, title);
        } else if (publicationType.equalsIgnoreCase("PaperPublication")) {
            publication = new PaperPublication(authorName, title);
        } else {
            System.out.println("Invalid publication type.");
            return;
        }

        publication.display();
    }
}