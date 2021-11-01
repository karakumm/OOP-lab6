package delivery;

import flowers.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("DHL delivery is chosen");
        return true;
    }
}
