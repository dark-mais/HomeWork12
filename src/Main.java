public class Main {
    public static void main(String[] args) {
        Book myRagnarok = new Book("My Ragnarok", "Maks Fray", 2018);
        System.out.println("Book - " + myRagnarok.getNameBook());
        System.out.println("Author - " + myRagnarok.getAuthorBook());
        System.out.println("Age public - " + myRagnarok.getAgePublicBook() + "\n");

        Book harryPotter = new Book("Harry Potter", "Joan Kathleen Rowling", 2005);
        System.out.println("Book - " + harryPotter.getNameBook());
        System.out.println("Author - " + harryPotter.getAuthorBook());
        System.out.println("Age public - " + harryPotter.getAgePublicBook());
        harryPotter.setAgePublicBook(2010);
        System.out.println("Age public - " + harryPotter.getAgePublicBook());

//        Book myRagnarok = new Book("My Ragnarok", "Maks Fray", 2018);
//        System.out.println("Book - " + myRagnarok.getNameBook());
//        System.out.println("Author - " + myRagnarok.getAuthorBook());
//        System.out.println("Age public - " + myRagnarok.getAgePublicBook());
    }
}