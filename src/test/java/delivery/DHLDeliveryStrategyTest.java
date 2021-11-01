package delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();

    @Test
    void deliver() {
        assertEquals(true, dhl.deliver(new ArrayList<>()));
    }
}