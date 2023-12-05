package zad3;

public class House extends Building{
	private int floors;
	private String owner;
	public House(int height, double area, String address, int floors, String owner)
	{
		super(height, area, address);
		this.setFloors(floors);
		this.setOwner(owner);
	}
	
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) throws FloorException{
		if(floors <= 0)
		{
			throw new FloorException();
		}
		this.floors = floors;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public static double averageHouse(House[] arr, int size)
	{
		double area = 0;

		for(int i = 0; i < size; i++)
		{
			area += arr[i].getArea();
		}
		
		return area / size;
	}
}
