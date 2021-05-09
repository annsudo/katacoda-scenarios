It´s time to put all the data together.

We are working with microservices architecture, which means that the Catalog must be a servise too. Let´s call in **podcast-catalog-service**

There is a prepared template for you with imported *Object-classes* ;)

We are starting with  `monolithic-to-microservices/start-microservices/podcast-catalog-service/src/main/java/com/devops/podcastcatalogservice/resources/PodcastCatalogResource.java`{{open}}

### Step 1: Info from rating-data-service

Let´s get *UserRating* object with the list of ratings from *rating-info-data*

```
UserRating ratings = restTemplate.getForObject("https://2886795346-8083-host08nc.environments.katacoda.com/ratingdata/users/"+userId, UserRating.class);   

```

### Step 2 : Details from podcast-info-service

For each *podastId*, we want to get data from *podcast-info-service*, put all data together and return as new *CatalogItem-object* for each 

```
return.ratings.stream().map(rating->{
   Podcast podcast= restTemplate.getForObject("https://2886795346-8082-host08nc.environments.katacoda.com/podcasts/"+rating.getPodcastID, Podcast.class);
    return new Podcast(podcast.getName, "devOps",rating.getRating())
}
).collect(Collector.toList());

```

OBS 👾: the link looks strange because we are running it through *Katacoda* environment. While testing locally your link would be as usual: `https://localhost:8082/podcasts/` VS `https://localhost:8083/ratingdata/users/`


## Port 8081

Define port 8081 for this service, the same way as before.

Do you remember how we did it in the previous step? Go ahead and try it yourself ;) 

In `monolithic-to-microservices/start-microservices/podcast-catalog-service/src/main/resources/application.properties`{{open}} 

## Test it 

Open new terminal

Navigate to the right project ` cd ; cd monolithic-to-microservices/start-microservices/podcast-catalog-service`{{execute}}

Run it `mvn spring-boot:run`{{execute}}

Find output in *catalog-service* tab

💡 Tips: since catalog-podcast service needs data from both podcast-info service and rating-data-service make sure that those are up and running as well 