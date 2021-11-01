package delivery;

import flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Post delivery is chosen");
        return true;
    }
}
