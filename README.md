
# VoterHub

**VoterHub** is a comprehensive Voter Registration and Management System that allows users to register new voters, view voter information based on various parameters (like city, constituency, or pin code), update, and delete voter details. It utilizes Hibernate and JDBC for database management.

## Features

- **Voter Registration**: Add new voters with details like Aadhaar number, name, voter ID, constituency, house number, city, and pin.
- **View Voters**: View voter information based on various filters, including city, constituency, and pin code.
- **Update Voter Info**: Update existing voter details like name, constituency, city, and pin.
- **Delete Voter**: Delete voter information based on Aadhaar number.
- **Database Integration**: The system uses MySQL (or another database of your choice) to store and retrieve voter data.

## Tech Stack

- **Java**: The main programming language used for the backend.
- **JDBC**: For database connectivity and operations.
- **Hibernate**: For ORM-based database interactions.
- **MySQL**: Database for storing voter information.
- **Maven**: For managing project dependencies.

## Project Structure

- **com.sid.controller**: Contains the controller classes that handle the application's business logic.
- **com.sid.entity**: Contains the entity classes (e.g., Person, VotingCard, Address) mapped to the database.
- **com.sid.dao**: Contains classes for interacting with the database (CRUD operations).
- **com.sid.service**: Business logic for the system, including methods to add, delete, update, and view voters.
- **com.sid.utility**: Utility classes, including database connection management.




**For any questions or feedback, feel free to reach out to** **sidheshwarjadhav100@gmail.com**
