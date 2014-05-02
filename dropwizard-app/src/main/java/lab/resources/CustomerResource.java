package lab.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lab.api.Customer;

import com.codahale.metrics.annotation.Timed;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Path("/{customerId}")
    @GET
    @Timed
    public Customer getCustomer(@PathParam("customerId") String customerId) {
        return new Customer(customerId, "Bob", "Brown", "4 Baker Street, London");
    }
}
