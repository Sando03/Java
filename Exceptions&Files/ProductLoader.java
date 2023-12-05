import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductLoader implements ImportData{
    private static final String FILE_PATH = "salesproducts.txt";

    @Override
    public Object[] importDataFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        int numRows = getNumberOfRows();
        Object[] products = new Object[numRows];

        String line;
        int index = 0;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("#");

            if (data[0].equals("1")) {
                try {
                    products[index++] = new Electronics(
                            Integer.parseInt(data[2]),
                            Double.parseDouble(data[4]),
                            Integer.parseInt(data[5]),
                            new Provider(data[1], data[3]),
                            data[6],
                            data[7]
                    );
                } catch (WrongPhoneNumberException e) {
                    throw new RuntimeException(e);
                }
            } else if (data[0].equals("2")) {
                try {
                    products[index++] = new Book(
                            Integer.parseInt(data[2]),
                            Double.parseDouble(data[4]),
                            Integer.parseInt(data[5]),
                            new Provider(data[1], data[3]),
                            data[6],
                            data[7]
                    );
                } catch (WrongPhoneNumberException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        reader.close();
        return products;
    }

    public int getNumberOfRows() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        int numRows = 0;

        while (reader.readLine() != null) {
            numRows++;
        }

        reader.close();
        return numRows;
    }
}
