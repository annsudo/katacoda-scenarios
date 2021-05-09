
## Rating-data-service 

Let´s follow the same steps for the second microservice


### Defining Logic

Rating-data-service will be holding *rating* and *podcast id* properties.

Open file `monolithic-to-microservices/start-microservices/ratings-data-service/src/main/java/com/devops/ratingsdataservice/resources/RatingDataResources.java`{{open}}

Define a list of Rating objects.
It´s considered a bad practice to pass a list over an API, so let´s define an object UserRating  which will hold our list and return it.

💡 Tips: Both Rating and UserRating objects are predefined. You will find them in the "models" map for this project

Rating `monolithic-to-microservices/start-microservices/ratings-data-service/src/main/java/com/devops/ratingsdataservice/models/Rating.java`{{open}}

UserRating`monolithic-to-microservices/start-microservices/ratings-data-service/src/main/java/com/devops/ratingsdataservice/models/UserRating.java`{{open}}

Define a list of Rating objects, every one of which is available at "/ratingdata/users/Katacoda".

Your class will look like this:

```
@RestController
@RequestMapping("/ratingdata")
public class RatingDataResources{

   @RequestMapping("/users/Katacoda")
    public UserRating getUserRating(){
        List<Rating> ratings = Arrays.asList(
            new Rating("1", 5), 
            new Rating("2", 4),
            new Rating("3", 5)
        );
   
    // Good practices to pass an object and not a list
        UserRating userRating= new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
} 
```

## Port 8083

This service will run on port 8083.

Do you remember how we did it in the previous step? Go ahead and try it yourself ;) 

In `monolithic-to-microservices/start-microservices/ratings-data-service/src/main/resources/application.properties`{{open}} 

## Testing

Open new terminal

Navigate to the right project ` cd ; cd monolithic-to-microservices/start-microservices/ratings-data-service`{{execute}}

Run it `mvn spring-boot:run`{{execute}}

When you see *Started RatingsDataServiceApplication in X seconds (JVM running for Y)* in terminal go ahead and open the "rating-data-service" tab.

💡 Tips: Dont forget to stop the previous service ´Ctrl +C´ in terminal. Or open a new terminal by pushing `+` in the right corner of the lower tabs-screen
