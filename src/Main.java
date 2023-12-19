public class Main {
    public static void main(String[] args) {
        Author maksFray = new Author("Maks", "Fray");
        Book myRagnarok = new Book("My Ragnarok", maksFray, 2018);
        System.out.println("Book - " + myRagnarok.getNameBook());
        System.out.println("Author - " + maksFray.getFirstName() + " "+ maksFray.getLastName());
        System.out.println("Age public - " + myRagnarok.getAgePublicBook() + "\n");

        Author jonneKathleenRowling = new Author("Jonne Kathleen", "Rowling");
        Book harryPotter = new Book("Harry Potter", jonneKathleenRowling, 2005);
        System.out.println("Book - " + harryPotter.getNameBook());
        System.out.println("Author - " + jonneKathleenRowling.getFirstName() + " " + jonneKathleenRowling.getLastName());
        System.out.println("Age public - " + harryPotter.getAgePublicBook());
        harryPotter.setAgePublicBook(2010);
        System.out.println("Age public - " + harryPotter.getAgePublicBook());
    }
}