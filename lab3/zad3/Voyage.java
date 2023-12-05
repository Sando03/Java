package zad3;

public abstract class Voyage {
	private String destination;
	private int days;
	private double price;
	
	public Voyage(String destination, int day, double price)
	{
		this.destination = destination;
		this.days = day;
		this.price = price;
	}
	
	public String getDestination()
	{
		return this.destination;
	}
	
	public void setDestination(String d)
	{
		this.destination = d;
	}
	
	public int getDays()
	{
		return this.days;
	}
	
	public void setDays(int d)
	{
		this.days = d;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double p)
	{
		this.price = p;
	}
	
	public abstract double fixPrice(double pricePerDay);
}
