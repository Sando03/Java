package zad3;

public class Building {
	private int height;
	private double area;
	private String Address;
	
	public Building(int height, double area, String address)
	{
		this.setHeight(height);
		this.setArea(area);
		this.setAddress(address);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) throws InvalidHeightException{
		if(height <= 0)
		{
			throw new InvalidHeightException();
		}
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) throws InvalidAreaException{
		if(area <= 0)
		{
			throw new InvalidAreaException();
		}
		this.area = area;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}
