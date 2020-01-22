A Sandbox project to play with Spring features, here you will find some useful notes, use them as a refreshing content if you are already used Spring in the past.



##Notes:
# ways to create a spring project:
- create a maven project then add the needed dependencies
- create a maven project using an archetype
- use the GUI provided by spring initializr https://start.spring.io/ (you can easily specify the needed dependencies, java version, project information)
- use the Spring CLI (little be to verbose)
- use the spring tool suites IDE (i'm sure there will be a way to do it in the other IDEs)

# properties
Common Application properties https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html
provide the different properties you can change plus their default value

# Spring Data JPA
connect to different SGBD nearly in the same approach, easier database connection

# Package your application
just run mvn clean install, check the target folder and you will find your jar