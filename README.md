dropwizard-in-action
====================

Example of a simple, standalone Dropwizard REST service.

Instructions
------------
1. Build the fat jar using gradle:

    gradle shadowJar
    
2. Run the standalone application

    java -jar build/distributions/dropwizard-app-1.0-shadow.jar server 
    
3. HTTP GET on http://localhost:8080/customer/1 using a HTTP client.

4. Check out the operational metrics

    http://localhost:8081/
