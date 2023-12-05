package zad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;

public class Service {
	public static ArrayList<Device> devices = new ArrayList<Device>();
	public static ArrayList<BrokenDevice> brokenDevices = new ArrayList<BrokenDevice>();
	public static ArrayList<BrokenDevice> devicesToFix = new ArrayList<BrokenDevice>();
	
	public static void addDevice(Device obj) {
		devices.add(obj);
	}
	
	public static void addBrokenDevice(BrokenDevice obj) {
		brokenDevices.add(obj);
	}
	
	public static void fixDevice(BrokenDevice obj) {
		brokenDevices.remove(obj);
		devices.add((Device) obj);
	}
	
	public static void displaySympoms(String symptom) {
		for(BrokenDevice bd: brokenDevices) {
			if(bd.getSymptoms().equals(symptom)) {
				bd.outputDevice();
			}	
		}
	}
	
	public static void queueDevice(BrokenDevice bd) {
		devicesToFix.add(bd);
		System.out.println("Device is in repair.");
	}
	
	public static double totalPrice() {
		double totalPrice = 0;
		for(BrokenDevice bd: brokenDevices) {
			totalPrice += bd.getPrice();	
		}
		
		for(Device d: devices) {
			totalPrice += d.getPrice();
		}
		
		return totalPrice;
	}
	
	public static void priceRepair() {
		double p = 0;
		for(BrokenDevice bd: brokenDevices) {
			p = bd.getDayRepair() * bd.getPrice();
			bd.outputDevice();
			System.out.println(p + "\n\n");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void inputDevices(FileInputStream fileStream) throws IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(fileStream);
		devices = (ArrayList<Device>) in.readObject();
		brokenDevices = (ArrayList<BrokenDevice>) in.readObject();
	}
	
	public static void outputDevice(FileOutputStream fileStream) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(fileStream);
		out.writeObject(devices);
		out.writeObject(brokenDevices);
	}
}
