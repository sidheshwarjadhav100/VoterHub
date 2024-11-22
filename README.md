
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

## Database and Table Structure

The VoterHub project uses a MySQL database to store and manage the following entities:

### **1. Candidates Table**
Stores information about the election candidates.

- **candidate_id** (Primary Key): Unique identifier for each candidate.
- **name**: Name of the candidate.


### **2. Voters Table**
Stores information about the voters.

- **voter_id** (Primary Key): Unique identifier for each voter.
- **constituency**: Constituency where the voter is registered.

### **3. Address Table**
Stores details of the elections.

- **house_no** (Primary Key): Unique identifier for each election.
- **city**: city of candidate.
- **pin**: pin of candidate.

Tracks which voter voted for which candidate during an election.

- **voter_id**: Foreign Key linking to the Voters table.
- **candidate_id**: Foreign Key linking to the Candidates table.
- **election_id**: Foreign Key linking to the Elections table.

---

This structure ensures proper management of voter, candidate, and election data, with optional tracking of interactions and results for each election.



**For any questions or feedback, feel free to reach out to** **sidheshwarjadhav100@gmail.com**
