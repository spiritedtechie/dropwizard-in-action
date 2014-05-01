package lab;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CustomerApplication extends Application<CustomerAppConfiguration> {

    public static void main(String[] args) throws Exception {
        new CustomerApplication().run(args);
    }

    @Override
    public String getName() {
        return "customer-app";
    }

    @Override
    public void initialize(Bootstrap<CustomerAppConfiguration> bootstrap) {
    }

    @Override
    public void run(CustomerAppConfiguration configuration, Environment environment) throws Exception {
        environment.healthChecks().register("database", new DatabaseHealthCheck());
        environment.jersey().register(new CustomerResource());
    }

}
