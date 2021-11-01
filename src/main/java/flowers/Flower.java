package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower {
    private FlowerType flowerType;
    private double price;
    private double sepalLength;
    private int [] color;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

}

