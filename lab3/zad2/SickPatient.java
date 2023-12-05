package zad2;

public class SickPatient extends Patient{
	public String disease;
	public boolean isSick;
	public int day;
	
	public SickPatient(String name, String address, String egn, String disease, boolean isSick, int day)
	{
		super(name, address, egn);
		this.disease = disease;
		this.isSick = isSick;
		this.day = day;
	}
	
	public void cure(String drug, double dose)
	{
		System.out.println("Patient is taking " + drug + " in " + dose + "mg");
	}
}
