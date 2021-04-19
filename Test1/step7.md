The discovery server is ready 💥 Next step is to register the Spring Boot Micro service applications into the Eureka Server.

## Anotation

Add the **@EnableEurekaClient** annotation in the main class file for all 3 services. The @EnableEurekaClient annotation will make our Spring Boot applications act as a Eureka clients.

## Application Name

To make the service discovery easy, we need to give a name for each service. Navigate to *application.properties* file where we defined the port earlier and add the name to respective micro service: 

**spring.application.name=podcast-catalog-service**
**spring.application.name=podcast-info-service**
**spring.application.name=ratings-data-service**

## Changing URI
 Time to change hardcoded URI

Navigate to  `monolithic-to-microservices/start-microservices/podcast-catalog-service/src/main/java/com/devops/podcastcatalogservice/resources/PodcastCatalogResource.java`{{open}}

Change URI to `"http://ratings-data-service/ratingdata/users/"`
and  `"http://podcast-info-service/podcasts/"`


## Test
 Everything is set💥 Time to test!

 -->  run *Eureka Server*

 -->  run *podcast-info-service* and  *ratings-data-service*

 -->  run *podcast-catalog-service*

 💡 Tips: If you run into issues, you have always all final-version code availible on both github and in the "finish"-map
