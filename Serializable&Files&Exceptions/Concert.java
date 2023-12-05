public class Concert extends Event {
    protected String starName;

    public Concert() {};
    public Concert(String place, String date, String startHour, int numberOfTickets, double priceOfTicket, String starName) {
        super(place, date, startHour, numberOfTickets, priceOfTicket);
        this.starName = starName;
    }

    public boolean sellTicket(int num) throws NoMoreTicketsException {
        if(num > this.numberOFTickets) {
            throw new NoMoreTicketsException("There no tickets for concert!");
        }
        this.numberOFTickets -= num;
        return true;
    }
}
