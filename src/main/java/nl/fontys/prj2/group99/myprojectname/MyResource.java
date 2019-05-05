package nl.fontys.prj2.group99.myprojectname;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import nl.fontys.prj2.group99.myprojectname.model.Person;
import services.DriverService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
    
    private DriverService driverService;

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     * 
     * Reach it via http://localhost:8080/webapi/myresource
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello World!";
    }

    /**
     * Returns all drivers 
     * 
     * Reach it via http://localhost:8080/webapi/myresource/drivers
     * 
     * @return one Person
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/drivers") 
    public Response drivers() {
       
        driverService = new DriverService();
      
        List<Person> drivers = driverService.getAllDrivers();
        
        GenericEntity<List<Person>> p = new GenericEntity<List<Person>>(drivers) {};

        return Response.status(Status.OK).entity(p).build();        
    }
}

