import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Provider provider = new Provider("Доставчик1", "0888123456");

            Electronics electronics = new Electronics(1, 1000, 10, provider, "Производител1", "Модел1");
            Book book = new Book(2, 50, 20, provider, "Автор1", "Заглавие1");

            electronics.sellProduct(5);
            book.sellProduct(10);

            System.out.println("Промоционална цена за електроника: " + electronics.getPromotionalPrice());
            System.out.println("Промоционална цена за книга: " + book.getPromotionalPrice());
        } catch (NoMoreProductsException | WrongPhoneNumberException e) {
            e.printStackTrace();
        }

        try {
            ImportData productLoader = new ProductLoader();
            Object[] products = productLoader.importDataFromFile();

            for (Object product : products) {
                if (product instanceof Electronics) {
                    Electronics electronics = (Electronics) product;
                    System.out.println("Електроника: " + electronics.getInventoryNumber() + " - " +
                            electronics.getProvider().getName() + " - " + electronics.getPromotionalPrice());
                } else if (product instanceof Book) {
                    Book book = (Book) product;
                    System.out.println("Книга: " + book.getInventoryNumber() + " - " +
                            book.getProvider().getName() + " - " + book.getPromotionalPrice());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}