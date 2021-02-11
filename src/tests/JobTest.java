package tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job jobTest1;
    Job jobTest2;
    Job jobTest3;
    Job jobTest4;


    @Before
    public void createJobObject(){
        jobTest1 = new Job();
        jobTest2 = new Job();

        jobTest3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


        jobTest4 = new Job("Developer",
                new Employer("TCS"),
                new Location("Missouri"),
                new PositionType("Web Developer"),
                new CoreCompetency("C#"));
    }




    @Test
    public void emptyTest(){
        assertEquals(1,1,0.001);
    }

    @Test
    public void testSettingJobId(){
        assertFalse(jobTest1.getId() == jobTest2.getId());
        assertEquals(1,jobTest2.getId() - jobTest1.getId());
    }


    @Test
    public void testJobCorrectlyAssignsClassAndValues(){
        assertTrue(jobTest3.getId() > 0);
        assertEquals("Product tester",jobTest3.getName());
        assertEquals("ACME",jobTest3.getEmployer().getValue());
        assertEquals("Desert",jobTest3.getLocation().getValue());
        assertEquals("Quality control",jobTest3.getPositionType().getValue());
        assertEquals("Persistence",jobTest3.getCoreCompetency().getValue());

        assertTrue((Integer)jobTest3.getId() instanceof Integer );
        assertTrue(jobTest3.getName() instanceof String);
        assertTrue(jobTest3.getEmployer() instanceof Employer);
        assertTrue(jobTest3.getLocation() instanceof Location);
        assertTrue(jobTest3.getPositionType() instanceof PositionType);
        assertTrue(jobTest3.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality(){
        assertNotEquals(jobTest1.getId(),jobTest3.getId());
    }
}
