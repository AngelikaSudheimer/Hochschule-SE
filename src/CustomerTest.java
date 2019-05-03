import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("name");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addRental() {
        int size = customer.getRentals().toArray().length;
        customer.addRental(new Rental(new Movie("title", 1234), 10));
        assertEquals(size +1, customer.getRentals().toArray().length);

    }

    @Test
    void getName() {
        assertEquals("name", customer.getName());
    }

    @Test
    void statement() {
    }
}