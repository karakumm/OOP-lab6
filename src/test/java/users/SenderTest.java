package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender first;
    Sender second;

    @BeforeEach
    void setUp() {
        first = new Sender();
        second = new Sender();
        int id = UserID.generate();
    }

    @Test
    void getId() {
        assertEquals(1, first.getId());
        assertEquals(2, second.getId());
    }
}
