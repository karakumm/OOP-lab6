package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {

    public Flower getFlower() {
        return flower;
    }

    private Flower flower;
    private int amount;

    public double getPrice() {
        return amount * flower.getPrice();
    }
}