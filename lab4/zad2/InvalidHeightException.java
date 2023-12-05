package zad3;

public class InvalidHeightException extends RuntimeException{
	private static final long serialVersionUID = 3L;
	
	public String getMessage()
	{
		return "Invalid height";
	}
}
