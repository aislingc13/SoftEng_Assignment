package nuigalway.app;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 * Change Commit
 * Last commit test
 */
public class AppTest {

    private LocalDate test_dob = new LocalDate(1995, 7, 16);
    private Student test_student = new Student("Aisling Cahill", 24, test_dob, 14329626);
    private Module test_module = new Module("CT417");
    private DateTime test_startDate = new DateTime();
    private DateTime test_endDate = new DateTime();
    private Programme test_program = new Programme("course", test_startDate, test_endDate);

    /*
     * @Test public void testStudent() { fail("Not yet implemented"); }
     */

    @Test
    public void testGetUsername() {
        assertEquals("Aisling Cahill24", test_student.getUsername());
    }

    @Test
    public void testGetSetName() {
        assertEquals("Aisling Cahill", test_student.getName());
        test_student.setName("Tom Jones");
        assertEquals("Tom Jones", test_student.getName());
    }

    @Test
    public void testGetSetAge() {
        assertEquals(24, test_student.getAge());
        test_student.setAge(28);
        assertEquals(28, test_student.getAge());
    }

    @Test
    public void testGetSetDOB() {
        assertEquals(test_dob, test_student.getDOB());
        LocalDate new_test_dob = new LocalDate(1995, 7, 16);
        test_student.setDOB(new_test_dob);
        assertEquals(new_test_dob, test_student.getDOB());
    }

    @Test
    public void testGetSetID() {
        assertEquals(14329626, test_student.getID());
        test_student.setID(12345678);
        assertEquals(12345678, test_student.getID());
    }
}
