
All three services are running and communicating with each other!🎉

There is yet a problem... All our URIs are hardcoded. In real life services are running on different machines and theirs Uri can change.

We need a Discovery Server - an application that holds the information about all client-service applications. Clients don’t communicate with services directly. Instead, they call the API gateway, which forwards the call to the appropriate services on the back end.

## Eureka server

We will be using the Eureka server developed by Netflix as the discovery server. Every micro service will register into it so Eureka server knows all the client applications running on each port and IP address. 

There is a prepared template for you with imported Eureka server dependency.

Open  `monolithic-to-microservices/start-microservices/discovery-server/src/main/java/com/devops/discoveryserver/resources/DiscoveryServerApplication.java`{{open}}


The only think we need to be is to add `@EnableEurekaServer` above the public class.


### Run it

In new terminal: navigate to  project ` cd ; cd monolithic-to-microservices/start-microservices/discovery-server`{{execute}}

Run it `mvn spring-boot:run`{{execute}}

Eureka server will run on default port 8761, use the "Eureka server" - tab

