package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.PositionType;
import org.launchcode.techjobs.oo.Location;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by LaunchCode
 */
//test for empty constructor
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1= new Job();
        Job job2= new Job();
        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getEmployer() instanceof Employer);
        assertEquals(job3.getEmployer().getValue(), "ACME");

        assertTrue(job3.getLocation() instanceof Location);
        assertEquals(job3.getLocation().getValue(),"Desert");

        assertTrue(job3.getPositionType() instanceof PositionType);
        assertEquals(job3.getPositionType().getValue(),"Quality control");

        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job3.getCoreCompetency().getValue(),"Persistence");

        assertTrue(job3.getName() instanceof String);
        assertEquals(job3.getName(),"Product tester");

    }

    @Test
    public void testJobForEquality() {

        Job job4= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5= new Job("Product pester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job4.getId(), job5.getId());



    }
}
