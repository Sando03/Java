package zad1;

public class TV extends Item implements ElectricalAppliance{
	private String model;
	private int power;
	private String manufacturer;
	public TV(double price, int number, String model,int power, String manufacturer)
	{
		super(price, number);
		this.setModel(model);
		try
		{
			this.setPower(power);
		}catch(PowerException e)
		{
			System.out.println(e.getMessage());
		}
		
		this.setManufacturer(manufacturer);
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) throws PowerException {
		if(power <= 0)
		{
			throw new PowerException();
		}
		this.power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public double chekcPromo() {
		double newPrice = this.getPrice() * ((100 - 9) / 100);
		return newPrice;
	}

	@Override
	public int diffrenceElectricEnergy() {
		return this.getPower();
	}
}
