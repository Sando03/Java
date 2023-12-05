package zad3;

public class FloorException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public String getMessage()
	{
		return "Invalid floor";
	}
}
