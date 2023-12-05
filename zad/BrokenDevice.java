package zad;

import java.util.Scanner;

public class BrokenDevice extends Device{
	private String symptoms;
	private int dayRepair;
	
	public BrokenDevice(String manufacturer, String model, double price, String symptoms, int days) {
		super(manufacturer, model, price);
		this.setSymptoms(symptoms);
		this.setDayRepair(days);
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public int getDayRepair() {
		return dayRepair;
	}

	public void setDayRepair(int dayRepair) {
		this.dayRepair = dayRepair;
	}
	
	public static Device inputDevice() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter manufacturer: ");
		String man = scanner.nextLine();
		System.out.print("Enter model: ");
		String model = scanner.nextLine();
		System.out.print("Enter price: ");
		double price = scanner.nextDouble();
		System.out.print("Enter symptoms: ");
		String symptoms = scanner.nextLine();
		System.out.print("Enter days for repair: ");
		int days = scanner.nextInt();
		BrokenDevice d = new BrokenDevice(man, model, price, symptoms, days);
		return d;
	}
	
	public void outputDevice() {
		String out = this.getManufacturer() + " " + this.getModel() + " " + this.getPrice() + " " + this.getSymptoms() + this.getDayRepair();
;		System.out.println(out);
	}

}
