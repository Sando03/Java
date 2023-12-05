package zad1;

public class Book extends Item{
	private String author;
	private String name;
	public Book(double price, int number, String name, String author)
	{
		super(price, number);
		this.setName(name);
		this.setAuthor(author);
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double chekcPromo() {
		double newPrice = this.getPrice() * ((100 - 15) / 100);
		return newPrice;
	}
	
	
	
}
