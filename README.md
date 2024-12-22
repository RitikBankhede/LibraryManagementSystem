📚 Library Management System (Microservices)

A modern microservices-based library system built with Spring Boot and MySQL.

🌟 Features
Add, delete, update, and search books.
Retrieve books by title or fetch all books in the library.
Built using microservices architecture with:
Controller: Handles API requests.
Service: Implements business logic.
Repository: Manages database operations.
RESTful API supporting CRUD operations (POST, GET, PUT, DELETE).
Uses POJO design pattern for entity modeling.
Fully documented and tested APIs for smooth interaction.

🛠️ Tech Stack
Technology	Purpose
Java	Core programming language
Spring Boot	Backend framework for microservices
MySQL	Database for storing library data
Maven	Build automation and dependency management
Postman	API testing
GitHub	Version control and collaboration

🚀 Demo
Check out the live API documentation and test it with the  Postman.

📂 Project Structure
bash
Copy code
src/
├── main/
│   ├── java/
│   │   ├── com.libarymanagmentsystem/
│   │   │   ├── pojo/              # Book entity (POJO)
│   │   │   ├── dao/               # Data Aceess Object
│   │   │   ├── repository/        # Database interactions
│   │   │   ├── service/           # Business logic
│   │   │   └──controller/         # API endpoints
│   │   └── LibraryManagementSystemApplication # Main entry point
│   └── resources/
└── ├── application.properties # Database config
       
📖 API Documentation
1. Add a Book
Endpoint:
Request:
 type : POST
 url  : lolcalhost:8008/addBook
 Header :
json
{
    "id": 001,
    "tittle": "xyz",
    "author": "abc",
    "available": true/false
}
Response:
json
"message":"Success/Failed"

2. update Book
Endpoint:
Request:
 type : PUT
 url  : lolcalhost:8008/updateBook
 Header :
json
{
    "id": 001,
    "tittle": "xyz",
    "author": "abc",
    "available": true/false
}
Response:
json
"message":"Success/Failed"

3. Delete Book
Endpoint:
Request:
 type : DELETE
 url  : lolcalhost:8008/deleteBook/id=?

Response:
json
"message":"Success/Failed"

4. Get All Books
Endpoint:
Request :
type :GET
url  : lolcalhost:8008/findAllBook
Response:
json
[
  {
    "id": 1,
    "title": "The Alchemist",
    "author": "Paulo Coelho",
    "isAvailable": true
  }
]

5. Get BookById
Endpoint:
Request :
type :GET
url  : lolcalhost:8008/findBook/id=?
Response:
json
[
  {
    "id": 1,
    "title": "The Alchemist",
    "author": "Paulo Coelho",
    "isAvailable": true
  }
]

6. Get BookByTittle
Endpoint:
Request :
type :GET
url  : lolcalhost:8008/findBookByTittle/tittle=?
Response:
json
[
  {
    "id": 1,
    "title": "The Alchemist",
    "author": "Paulo Coelho",
    "isAvailable": true
  }
]

📊 Database Schema
sql
Copy code
CREATE TABLE book (
    id INTEGER  PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    is_available BOOLEAN
);

🤝 Contributing
Contributions are welcome!
To contribute:
Fork this repository.
Create a new branch (git checkout -b feature-name).
Commit your changes (git commit -m "Add feature").
Push to the branch (git push origin feature-name).
Create a pull request.

💡 Inspiration
This project was created to demonstrate expertise in:
Microservices architecture
Database design and management
REST API development
Java programming with Spring Boot

📞 Contact
Email: ritikbankhede0731@gmail.com
GitHub: your-Ritik Bankhede







