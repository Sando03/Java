package zad1;

public class PriceException extends Exception {
	private static final long serialVersionUID = 1L;

	public String getMessage()
	{
		return "Invalid price";
	}
}
