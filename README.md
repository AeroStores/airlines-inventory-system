# Airlines Inventory System

A Spring Boot application for managing airline inventory including aircraft, routes, crews, and flight schedules.

## Project Overview

This is a Java Spring Boot project that provides RESTful APIs for managing an airline's inventory system. The application uses Spring Data JPA for database operations and H2 as an in-memory database for development.

## Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher
- Git

## Project Structure

```
airlines-inventory-system/
├── src/
│   ├── main/
│   │   ├── java/com/airlinesystem/
│   │   │   ├── controller/          # REST controllers
│   │   │   ├── service/             # Business logic
│   │   │   ├── entity/              # JPA entities
│   │   │   ├── repository/          # Data access layer
│   │   │   └── AirlinesInventoryApplication.java  # Main class
│   │   └── resources/
│   │       └── application.yml      # Configuration
│   └── test/
│       └── java/com/airlinesystem/  # Test classes
├── pom.xml                          # Maven configuration
└── README.md
```

## Technologies

- **Spring Boot 3.3.0** - Framework
- **Spring Data JPA** - ORM
- **H2 Database** - In-memory database
- **Lombok** - Boilerplate reduction
- **JUnit 5** - Testing framework

## Getting Started

### 1. Clone the Repository

```bash
git clone <repository-url>
cd airlines-inventory-system
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080/api`

### 4. Access H2 Database Console

Visit `http://localhost:8080/h2-console` to access the H2 database console.

## API Endpoints

### Aircraft Endpoints

- `GET /api/aircraft` - Get all aircraft
- `GET /api/aircraft/{id}` - Get aircraft by ID
- `POST /api/aircraft` - Create a new aircraft
- `PUT /api/aircraft/{id}` - Update an aircraft
- `DELETE /api/aircraft/{id}` - Delete an aircraft
- `GET /api/aircraft/status/{status}` - Get aircraft by status

### Example Request

```json
POST /api/aircraft
{
  "registrationNumber": "N12345",
  "model": "Boeing 737",
  "manufacturer": "Boeing",
  "capacity": 150,
  "status": "ACTIVE",
  "lastMaintenanceDate": "2024-01-15"
}
```

## Running Tests

```bash
mvn test
```

## Building for Production

```bash
mvn clean package
java -jar target/airlines-inventory-1.0.0.jar
```

## Development Tips

- Use `mvn dependency:tree` to view project dependencies
- Enable debug logging by setting `logging.level.com.airlinesystem: DEBUG` in application.yml
- Use Spring DevTools for hot reload: `mvn spring-boot:run`

## Future Enhancements

- [ ] Add authentication and authorization
- [ ] Implement route management
- [ ] Add crew scheduling
- [ ] Create booking system
- [ ] Add API documentation (Swagger/OpenAPI)

## License

See LICENSE file for details.
