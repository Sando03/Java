package exerciseSix;

public class BlackFriday  extends ProductLoader{
    public static Electronics[] electronics = new Electronics[]{};
    public static Books[] books = new Books[]{};

    private static ProductLoader productLoader;

    public BlackFriday(Object[] objectsFromFile,ProductLoader productLoader) {
        super(objectsFromFile);
        this.productLoader = productLoader;
    }

    static void processSales(){
        Product[] productsToBeLoaded = productLoader.outputStream();
        for(int i = 0; i < productsToBeLoaded.length; ++i){
            if(productsToBeLoaded[i].getProvider().getName().equals("Electronic LTD")){
                electronics[i] = (Electronics) productsToBeLoaded[i];
            } else {
                books[i] = (Books) productsToBeLoaded[i];
            }
        }
    }
}
