import java.io.*;

public class EventProcessing {
    public static Concert[] arrConcert = new Concert[10];
    public static VolleyBallMatch[] arrVolleyBallMatch = new VolleyBallMatch[10];
    public static int indexVolleyBallMatch = 0;
    public static int indexConcert = 0;
    public static void main(String[] args) {
        TicketLoader tl = new TicketLoader();

        try {
            Event[] arr = tl.importDataFromFile();

            for(Event e : arr) {
                if(e instanceof VolleyBallMatch) {
                    arrVolleyBallMatch[indexVolleyBallMatch] = (VolleyBallMatch) e;
                    indexVolleyBallMatch++;
                }else {
                    arrConcert[indexConcert] = (Concert) e;
                    indexConcert++;
                }
            }
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        
    }
}
