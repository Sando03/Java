import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PresentStore {
    public ArrayList<GetProducsTo> products;
    public ArrayList<DeliveryAPI> devApi;

    public PresentStore(ArrayList<GetProducsTo> products, ArrayList<DeliveryAPI> devApi) {
        this.products = products;
        this.devApi = devApi;
    }

    public ArrayList<GetProducsTo> getProductsUnderPrice(int price) {
        ArrayList<GetProducsTo> cheaper_products = new ArrayList<>();
        for (GetProducsTo product : this.products) {
            if (product.getPrice() < price) {
                cheaper_products.add(product);
            }
        }
        return cheaper_products;
    }

    public Map<GetProducsTo, Integer> getProductsFromProvider(int idOfProvider) {
        Map<GetProducsTo, Integer> map = new HashMap<>();
        for (int i = 0; i < products.size(); i++) {
            if (devApi.get(i).getIdOfProvider() == idOfProvider) {
                map.put(products.get(i), devApi.get(i).getNumber(idOfProvider));
            }
        }

        return map;
    }

}
