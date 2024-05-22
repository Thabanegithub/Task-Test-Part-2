package accountcreation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
    

    @Test
    public void testCheckTaskDescription() {
        Task task = new Task("Login", 0, "Create login feature", "Mpho Thabane", 5, "To Do");
        assertTrue(task.checkTaskDescription());

        task = new Task("Login", 0, "This is a very long description that exceeds fifty characters", "Mpho Thabane", 5, "To Do");
        assertFalse(task.checkTaskDescription());
    }

    @Test
    public void testCreateTaskID() {
        Task task = new Task("Login", 0, "Create login feature", "Mpho Thabane", 5, "To Do");
        assertEquals("LO:0:ANE", task.createTaskID());
    }
    

    // More tests for printTaskDetails, returnTotalHours
}

