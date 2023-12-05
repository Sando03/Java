package zad3;

public class InvalidAreaException extends RuntimeException{
	private static final long serialVersionUID = 2L;

	public String getMessage()
	{
		return "Invalid area";
	}
}
