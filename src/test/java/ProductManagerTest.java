import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.*;

public class ProductManagerTest {

    @Test
    public void testShouldFindTwo() {
        Book book1 = new Book(11, "Winter Bell", 500, "Adam");
        Smartphone smartphone1 = new Smartphone(222, "Samsung", 10000, "Korea");
        Book book2 = new Book(33, "Spring", 800, "Ben");
        Smartphone smartphone2 = new Smartphone(444, "Apple", 15000, "USA");
        Book book3 = new Book(55, "Bell of Summer", 1000, "Courtney");

        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);
        manager.add(book2);
        manager.add(smartphone2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Bell");
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testEmpty() {
        Book book1 = new Book(11, "Winter Bell", 500, "Adam");
        Smartphone smartphone1 = new Smartphone(222, "Samsung", 10000, "Korea");
        Book book2 = new Book(33, "Spring", 800, "Ben");
        Smartphone smartphone2 = new Smartphone(444, "Apple", 15000, "USA");
        Book book3 = new Book(55, "Bell of Summer", 1000, "Courtney");

        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);


        Product[] actual = manager.searchBy("Bell");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindPart() {
        Book book1 = new Book(11, "Winter Bell", 500, "Adam");
        Smartphone smartphone1 = new Smartphone(222, "Samsung", 10000, "Korea");
        Book book2 = new Book(33, "Spring", 800, "Ben");
        Smartphone smartphone2 = new Smartphone(444, "Apple", 15000, "USA");
        Book book3 = new Book(55, "Bell of Summer", 1000, "Courtney");

        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);
        manager.add(book2);
        manager.add(smartphone2);
        manager.add(book3);

        Product[] actual = manager.searchBy("sung");
        Product[] expected = {smartphone1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveById() {
        Book book1 = new Book(11, "Winter Bell", 500, "Adam");
        Smartphone smartphone1 = new Smartphone(222, "Samsung", 10000, "Korea");
        Book book2 = new Book(33, "Spring", 800, "Ben");
        Smartphone smartphone2 = new Smartphone(444, "Apple", 15000, "USA");
        Book book3 = new Book(55, "Bell of Summer", 1000, "Courtney");

        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);
        manager.add(book2);
        manager.add(smartphone2);
        manager.add(book3);
        repo.removeById(222);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, smartphone2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }
    
}
