dropwizard-in-action
====================

Example of a simple, standalone Dropwizard REST service.

Instructions
------------
1) Start the service: 

    gradle run

2) Use the service:

HTTP GET on http://localhost:8080/customer/1 using a HTTP client.

    curl http://localhost:8080/customer/1

3) Check out the operational metrics

    http://localhost:8081/
