## What does building with microservices mean?

It means you are developing your entire application in small, independent components AKA microservices.  Each micro-service should perform a single business requirement. 

Let´s look at our app. We can split the information we have about the podcasts into to indipendent component:

**Podcast-info-service** will provide the information about the podcast itself

**Rating-data-service** will be responcible for rating


## Creating the first microservise
We start with **Podcast-info-service**. Template is ready for you. Navigate to `cd monolithic-to-microservices/monolithic/`{{execute}} **!!!!!!!!!!!!**


This microsevice is responsible for storage of data about the podcast, to be exact *podcast name*. To know exactly which podcast it is it will all use the *podcast id* property.




## Data

To separate developer concerns- each microservice ideally has its own database tables. This time, we will hardcode the data.

Let´s add same data from monolithic app.

**!!!!!!!!!!!!**


  
  They communicate with each other over private APIs. 