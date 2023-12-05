import java.io.Serializable;

public abstract class Event  implements Serializable {
    protected String place;
    protected String date; 
    protected String startHour; 
    protected int numberOFTickets;
    protected double priceOfTicket;

    public Event() {}
    public Event(String place, String date, String startHour, int numberOfTickets, double priceOfTicket) {
        this.place = place;
        this.date = date;
        this.startHour = startHour;
        this.numberOFTickets = numberOfTickets;
        this.priceOfTicket = priceOfTicket;
    }

    public abstract boolean sellTicket(int num) throws NoMoreTicketsException;
}