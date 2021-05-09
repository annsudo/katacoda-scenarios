Let’s examine possible drawbacks as well as all the notable benefits with a micro services architecture.

### Drawbacks

💩 **Effort while deploying**

Each deployable unit must be functional independently. Some parts of code will be duplicated across microservices.


💩 **Changes can affect multiple services**

Let´s say you change a structure of *JSON file* our *podcast-info-service* provides. The catalog component won´t be able to use it anymore since different java-object structure is expected. To solve such issues: dependencies between microservices must be managed appropriately.


💩 **Independent testing**

Independent component implies independent testing. More micro serveses lead to more interfaces to test.



### Advantages with micro services

⭐ **Independence and Flexibility**

Developers can work on, test and deploy different components independently of each other. As well as use different languages/frameworks for different components.


⭐ **Resilience and Sustainability**

Micro service can easily be rewritten and replaced without compromising the whole system. And if a service goes down, it won’t take out the entire application. This means that systems remain maintainable in the long run.



⭐ **Scalability and Cross-functionality**

Granting flexibility to work autonomously. The internal structure of each unit doesn´t matter as long as the interface functions correctly. Technical decisions can be made quickly, services can be scaled and deployed easier.



## 🧠 Want to know more?
* [Advantages and Disadvantages of Microservices Architecture](https://cloudacademy.com/blog/microservices-architecture-challenge-advantage-drawback/)
* [To go or not to go micro: the pros and cons of microservices](https://medium.com/@goodrebels/to-go-or-not-to-go-micro-the-pros-and-cons-of-microservices-7967418ff06)
* [Microservices: the Pros and the Cons](https://agilethought.com/blogs/microservices-pros-and-cons/)
