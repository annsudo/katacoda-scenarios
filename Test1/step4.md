You must sertanly reflexted upon that 4 lines of code became 25. More effert upon deployment is one of the drawbacks for this type of architecture. Here are some more

### Drawbacks with architecture

💩 Effort while deploying

Since there are more deployable units that must each be functional independently some parts od code need to be dublicated across the servises.


💩 Changes can effect multiple services

Let´s say you change a structure of JSON file our info-microserves provides. The catalog componet won´t be able to use it anymore since different java-object structure is expected. To solve such issues: dependencies between microservices must be managed appropriately.

💩 Independent testing 

Independent component implies independent testing. More microserveses leads to more interfaces to test.



To take rational desitions about the architecture choice it is important to examine both drawbacks as well as benifits. Let’s discuss the most notable reasons why a microservices architecture can be a better choice for your company. 


### Advantages with microservices

⭐ Independency and Flexibility

Developers can work on, test and deploy different components independently of each other. As well as use different languages/frameworks for different components.


⭐ Resilience and Sustainability

Microservice can easily be rewritten and replaced without compromising the whole system. And if a service goes down, it won’t take out the entire application. This means that systems remain maintainable in the long run.


⭐ Scalability and Cross-functionality

Best choice for distributed teams as they grant flexibility to work autonomously. The internal structure of each unit or container does not matter as long as the interface functions correctly.  Technical decisions can be made quickly, services can be scaled and deployed easier.

