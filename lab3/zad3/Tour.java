package zad3;

public class Tour extends Voyage implements NightStay{
	private int numberHotels;
	
	public Tour(String destination, int day, double price, int numberHotel)
	{
		super(destination, day, price);
		this.numberHotels = numberHotel;
	}
	
	public int getNumberHotels()
	{
		return this.numberHotels;
	}
	
	public void setNumberHotels(int hotels)
	{
		this.numberHotels = hotels;
	}
	
	public double fixPrice(double pricePerDay)
	{
		double p = this.getPrice() + pricePerDay * this.getDays();
		return p + 0.1 * p;
	}

	@Override
	public int numDays(int days) {
		return this.getDays() - days;
	}
	
}
