# Step 1: Monolithic application

## So many tabs..

In the upper part of the screen we have the Kadacoda-editor you can navidate and code there as you usialy do locally.

In the lower part you see : 
* terminal
* several windows that we will need during the tutorial to test that out services are working
* Github-tab where you can find step-for-step code we will be writing today (in case you want to continue playing with it on your local mashine)

## What are we building? 

We will be working with a small Podcast-java aplication that will display a list of Podcast with descripton and rating.

## Let´s start

The fastest way to start is to clone the git repository and use the projects that are provided inside:

`git clone https://github.com/annsudo/monolithic-to-microservices`{{execute}}

We are starting with 3 classes:

The main class `monolithic-to-microservices/monolithic/src/main/java/com/devops/monolithic/MonolithicApplication.java`{{open}}

Podcast-catalog class, where most of the logic happens`monolithic-to-microservices/monolithic/src/main/java/com/devops/monolithic/resources/PodcastCatalogResource.java`{{open}}

CatalogItem object class what holds the Podcast item name, description and rating  `monolithic-to-microservices/monolithic/src/main/java/com/devops/monolithic/models/CatalogItem.java`{{open}}

Let´s navigate to the start-project in terminal `cd monolithic-to-microservices/monolithic/`{{execute}}


And run it `mvn spring-boot:run`{{execute}}