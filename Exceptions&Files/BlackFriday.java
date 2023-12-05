package zad1;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class BlackFriday {
	public Electronics[] arrElectronics = new Electronics[10];
	public Book[] arrBook = new Book[10];
	int indexElectronics = 0;
	int indexBook = 0;
	public static void main(String[] args) {

		
	}
	
	void processSales() throws IOException, ClassNotFoundException{
		ProductLoader loader = new ProductLoader();
		Product[] arr = loader.importDataFromFile();
		 
		for(Product p: arr) {
			if(p instanceof Electronics) {
				this.arrElectronics[indexElectronics] = (Electronics) p;
				indexElectronics++;
			}else if(p instanceof Book) {
				this.arrBook[indexBook] = (Book) p;
				indexBook++;
			}
		}
	}
}
