package zad;

import java.util.Scanner;

public class Device {
	private String manufacturer;
	private String model;
	private double price;
	
	public Device(String manufacturer, String model, double price) {
		this.setManufacturer(manufacturer);
		this.setModel(model);
		this.setPrice(price);
	}

	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static Device inputDevice() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter manufacturer: ");
		String man = scanner.nextLine();
		System.out.print("Enter model: ");
		String model = scanner.nextLine();
		System.out.print("Enter price: ");
		double price = scanner.nextDouble();
		
		Device d = new Device(man, model, price);
		return d;
	}
	
	public void outputDevice() {
		String out = this.getManufacturer() + " " + this.getModel() + " " + this.getPrice();
;		System.out.println(out);
	}
}
