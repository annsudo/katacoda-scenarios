
### Drawbacks with architecture

💩 Effort while deploying

Since there are more deployable units that must each be functional independently some parts od code need to be dublicated across the servises. As you probably reflexted upon already ..


💩 Changes can effect multiple services

Let´s say you change a structure of JSON file our info-microserves provides. The catalog componet won´t be able to use it anymore since different java-object structure is expected. To solve such issues: best practices for changing microserveses should be developed.

💩 Independent testing 

Independent component implies independent testing. More microserveses leads to more interfaces to test.



### Advantages with microservices

⭐ Independency: developers can work on, test and deploy different components independently of each other


⭐ Resilience: if a service goes down, it won’t take out the entire application


⭐ Scaling: services can be scaled and deployed independently


⭐ Flexibility: different languages/frameworks can be used for different components
