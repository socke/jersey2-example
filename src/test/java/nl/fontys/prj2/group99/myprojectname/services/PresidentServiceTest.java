package nl.fontys.prj2.group99.myprojectname.services;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PresidentServiceTest {

    private PresidentService presidentService;

    @Before
    public void setUp() throws Exception {
        presidentService = new PresidentService();
    }

    @After
    public void tearDown() throws Exception {}

    /**
    * This test is pretty stupid, as it tests the already existing data.
     * However should only show that the db connection works!
     */
    @Test
    public void testGetPresidentById() {
        assertThat(presidentService.getPresidentById(1).getName(), is("WASHINGTON G"));
    }

}