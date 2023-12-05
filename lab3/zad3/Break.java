package zad3;

public class Break extends Voyage{
	private String hotelName;
	public Break(String destination, int day, double price, String hotelName)
	{
		super(destination, day, price);
		this.setHotelName(hotelName);
	}
	
	public double fixPrice(double pricePerDay)
	{
		double p = this.getPrice() + pricePerDay * this.getDays();
		return p + (40 / 100) * p;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
}
