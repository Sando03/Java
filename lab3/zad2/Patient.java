package zad2;

public abstract class Patient {
	private String name;
	private String address;
	private String EGN;
	
	public Patient(String name, String address, String EGN)
	{
		this.name = name;
		this.address = address;
		this.EGN = EGN;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String a)
	{
		this.address = a;
	}
	
	public String getEGN()
	{
		return this.EGN;
	}
	
	public void setEGN(String egn)
	{
		this.EGN = egn;
	}
	
	public abstract void cure(String drug, double dose);
	
}
