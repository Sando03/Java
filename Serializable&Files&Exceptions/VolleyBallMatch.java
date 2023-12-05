public class VolleyBallMatch extends Event{
    protected String firstTeam;
    protected String secondTeam;

    public VolleyBallMatch() {};
    public VolleyBallMatch(String place, String date, String startHour, int numberOfTickets, double priceOfTicket, String firstTeam, String secondTeam) {
        super(place, date, startHour, numberOfTickets, priceOfTicket);
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    public boolean sellTicket(int num) throws NoMoreTicketsException {
        if(num > this.numberOFTickets) {
            throw new NoMoreTicketsException("There no tickets for match!");
        }
        this.numberOFTickets -= num;
        return true;
    }
}
