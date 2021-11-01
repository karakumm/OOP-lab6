package decorators;

import flowers.Item;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }
    @Override
    public double getPrice() {
        return 13 + super.getPrice();
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Add paper");
    }

}
