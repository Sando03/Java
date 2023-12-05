import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TicketLoader implements Importable {
    final String file = "dailytickets.txt";
    public Event[] importDataFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Event[] arr = (Event[]) in.readObject();
        return arr;
    }
}
