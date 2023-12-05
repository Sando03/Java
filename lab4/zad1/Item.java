package zad1;

public abstract class Item {
	private double price;
	private int number;

	public Item(double price, int number)
	{
		this.setNumber(number);
		try
		{
			this.setPrice(price);
		}catch(PriceException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws PriceException {
		if(price <= 0)
		{
			throw new PriceException();
		}
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public abstract double chekcPromo();
}
