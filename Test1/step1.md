
## So many tabs..

In the upper part of the screen we have the Kadacoda-editor. There you can navigate and code the same way as you usually do locally.

In the lower part you see : 
* terminal
* several windows that we will need during the tutorial to test our services
* Github-tab where you can find step-for-step of this tutorial. Feel free to continue playing with it!

## What are we building? 

We will be working with a small Podcast-java application that will display a list of Podcast: name, descripton and rating.

## Let´s start

The fastest way to start is to clone the git repository and use the projects that are provided inside:

`git clone https://github.com/annsudo/monolithic-to-microservices`{{execute}}

We are starting with 3 classes:

The main class `monolithic-to-microservices/monolithic/src/main/java/com/devops/monolithic/MonolithicApplication.java`{{open}}

Podcast-catalog class, where most of the logic happens`monolithic-to-microservices/monolithic/src/main/java/com/devops/monolithic/resources/PodcastCatalogResource.java`{{open}}

CatalogItem.java  holds the Podcast object  `monolithic-to-microservices/monolithic/src/main/java/com/devops/monolithic/models/CatalogItem.java`{{open}}

Let´s navigate to the start-project in terminal `cd monolithic-to-microservices/monolithic/`{{execute}}

And run it `mvn spring-boot:run`{{execute}}

When you see the "Completed initialization" in terminal go ahead and open the Monolithic-tab.

Can we see the list of podcasts?

Great! Now, go ahead and add 2 more podcasts to the list. Then make sure you can see them on Monolithic-tab.

By first stopping the previous run `Ctrl+C`, initialising new one again `mvn spring-boot:run`{{execute}}
and updating the `Monolithic-tab`