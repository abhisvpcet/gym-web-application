"# gym-web-application" 

1. DTO (Data Transfer Object)
Purpose:
DTOs act as the boundary objects for communication between the external world (e.g., API clients, other services) and your application.
They transfer data between the Application Layer and external systems or clients without exposing internal domain logic.
Usage in Hexagonal Architecture:
Inbound Adapter: DTOs are used in REST controllers, WebSocket endpoints, or message listeners to map incoming requests into application-specific objects.
Outbound Adapter: DTOs are used to send data to external systems like other microservices or third-party APIs.

2. Domain Model
Purpose:
Represents the core business logic and rules, independent of frameworks, persistence, or external concerns.
It is the heart of the hexagonal architecture and exists within the Application Core.
Usage in Hexagonal Architecture:
Application Layer: Domain objects handle use cases and interact with application services.
Ports: Domain models are used when defining interfaces (ports) for input/output operations.
Domain models should be designed to encapsulate business behavior.

3. Entity
Purpose:
Represents the data structure used for persistence and maps to a database table.
Entities are part of the Infrastructure Layer and deal with database-specific concerns.
Usage in Hexagonal Architecture:
Outbound Adapter: Entities are used by repositories to interact with the database.
They should map closely to database tables and may include JPA or other ORM annotations.
The mapping between domain models and entities happens in Outbound Adapters.



How They Interact in Hexagonal Architecture:
1. Inbound Communication:
Controller (Inbound Adapter):
Receives a NewMovieDto from the client.
Converts NewMovieDto to a Domain Model (Movie).
Passes the domain model to an Application Service (use case).
2. Core Business Logic:
Application Core (Domain Layer):
Contains business rules and logic in the Domain Model (Movie).
Defines interfaces (Ports) for persistence or external communication.
3. Outbound Communication:
Repository/Service (Outbound Adapter):
Converts the Domain Model (Movie) to a Persistence Entity (MovieEntity) for database interaction.
Or converts the domain model to an Outbound DTO for external APIs.
