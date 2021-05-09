
## What does building with micro services mean?

It means you are developing your entire application in small, independent components AKA microservices. Each microservice should perform a single business requirement. 


Let´s look at our app. We can split the information we have about the podcasts into two independent business requirements:

**Podcast-info-service** will provide the information about the podcast itself

**Rating-data-service** will be responsible for ratings of podcasts



### Defining Logic

This microsevice is responsible for storage of data about the podcast (as *podcast name*). To know exactly which podcast it is ,it will use the *podcast id* property.

Open fine `monolithic-to-microservices/start-microservices/podcast-info-service/src/main/java/com/devops/podcastinfoservice/resources/PodcastResource.java`{{open}}

Define a list of Podcast objects, every one of which is available at "/podcasts/{podcastId}".

Your class will look like this:

```
@RestController
@RequestMapping ("/podcasts")
public class PodcastResource {
   
    @RequestMapping("/{podcastId}")
    public Podcast getPodcast(@PathVariable("podcastId") String podcastId){
       // return new Podcast(podcastId, "The school of Greatness");

        if(podcastId.equals("1")){
            return new Podcast(podcastId, "The school of Greatness");
        } else if(podcastId.equals("2")){
            return new Podcast(podcastId, "Security now");
        } else if(podcastId.equals("3")){
            return new Podcast(podcastId, "Frontiers of learning");
        } else{
            return null;
        }
    }
}
```

## Data

To separate developer concerns , each microservice ideally has its own database tables. This time, we will hardcode the data.

## Port 8082

We will be running and testing several microservices simultaneously. Let´s define a special port which this service will run on

In `monolithic-to-microservices/start-microservices/podcast-info-service/src/main/resources/application.properties`{{open}} 

Add `server.port=8082`


## Testing

Navigate to the right project ` cd ; cd monolithic-to-microservices/start-microservices/podcast-info-service`{{execute}}

Run it `mvn spring-boot:run`{{execute}}

When you see *Started PodcastInfoServiceApplication in X seconds (JVM running for Y)* in terminal go ahead and open the "podcast-info-service" tab.

Good job! Now try to change the id number in URL to assure the right functionality implementation.