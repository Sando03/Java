public class Product implements GetProducsTo, DeliveryAPI{
    private String type;
    private double price;
    private int idOfProvider;
    private int number;

    public Product(String type, double price, int idOfProvider, int number) {
        this.setType(type);
        this.setPrice(price);
        this.setIdOfProvider(idOfProvider);
        this.setNumber(number);
    }

    public Product() {}

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getIdOfProvider() {
        return idOfProvider;
    }
    public void setIdOfProvider(int idOfProvider) {
        this.idOfProvider = idOfProvider;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getNumber(int idOfProvider) {
        return this.getNumber ();
    }

    @Override
    public String getType(int idOfProvider) {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }

    public String getType() {
        return this.type;
    }
}
