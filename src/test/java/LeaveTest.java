import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LeaveTest {
    @Test
    void testValidLeave() {
        assertTrue(LeaveApp.validateLeave(10, 5)); // Sufficient balance
    }

    @Test
    void testInvalidLeaveRequest() {
        assertFalse(LeaveApp.validateLeave(10, 15)); // Insufficient balance
        assertFalse(LeaveApp.validateLeave(10, -1)); // Negative request
    }
}