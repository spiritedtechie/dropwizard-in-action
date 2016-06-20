Description
--------------------

Example of a simple, standalone REST service which models a Customer resource with a GET method.

Technology
----------
Dropwizard is an set of stable and mature libraries for allowing developers to easily build Java REST services that can be deployed in a standalone manner, with the application server (Jetty) embedded into the JAR package. The framework is performant and lightweight, and supports operations by incorporating externalised configuration, operational metrics, logging and health checks.

Dropwizard is productive and simple to use. It really facilitates the efficient creation of REST microservices that are production/enterprise quality since they are built with mature Java libraries including Jetty, Jackson, JAX-RS/Jersey and Metrics.

Instructions
------------
1) Start the service: 

    gradle run

2) Use the service:

HTTP GET on http://localhost:8080/customer/1 using a HTTP client.

    curl http://localhost:8080/customer/1
    curl http://localhost:8080/customer/999

3) Check out the operational metrics

    http://localhost:8081/
