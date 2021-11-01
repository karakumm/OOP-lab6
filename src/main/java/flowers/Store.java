package flowers;


import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerBucket> allFlowerBuckets = new ArrayList<>();

    public boolean search(FlowerBucket bucketFind) {
        for (FlowerBucket bucket: allFlowerBuckets) {
            if (bucket.equals(bucketFind)) {
                return true;
            }
        }
        return false;
    }
}
