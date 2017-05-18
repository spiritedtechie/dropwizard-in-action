package lab.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.ExceptionMetered;
import lab.model.Customer;

import com.codahale.metrics.annotation.Timed;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    public static final String CUSTOMER_ID_EXCEPTION = "999";

    @Path("/{customerId}")
    @GET
    @Timed
    @ExceptionMetered
    public Customer getCustomer(@PathParam("customerId") String customerId) {

        if (CUSTOMER_ID_EXCEPTION.equals(customerId)) {
            throw new IllegalArgumentException("Invalid customer ID supplied");
        }

        return new Customer(customerId, "Bob", "Brown", "4 Baker Street, London");
    }
}
