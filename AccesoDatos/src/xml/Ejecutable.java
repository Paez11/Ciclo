package xml;

public class Ejecutable {
    public static void main(String[] args) {
        Books books = new Books();
        books.add(new Book("El Quijote", "Cervantes","","1"));
        books.add(new Book("El SDLA", "Tolkien","","2"));
        JAXBManager.marshal(books, "ejemplo.xml");
    }
}
