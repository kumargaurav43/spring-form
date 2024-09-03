******   Spring-Form Project *********
**Overview**
This project is a backend-only Spring Boot application built using the Spring Tool Suite (STS) platform. It focuses on practicing backend development and API creation. The project does not include any frontend components; all interactions with the application are performed via Postman. The application is connected to a MongoDB database, where all the data is stored and managed.

**Note**: The project folder was named "form" during development. After deploying the project on GitHub, the repository was created as "spring-form."
          If you are accessing this code and want to modify or use it, ensure that you update the project name and repository name according to your setup.

**Features**
Backend-Only Application: No frontend interface, designed for backend development practice.
MongoDB Integration: All data is stored in and retrieved from a MongoDB database.
API Testing via Postman: APIs are tested and verified using Postman.

**Prerequisites**
Before running this project, ensure you have the following installed:
Java 17 or later
Spring Tool Suite (STS)
MongoDB
Postman

**Setup and Installation**
1. Clone the Repository:
    bash command
    git clone https://github.com/kumargaurav43/spring-form.git
    cd spring-form

3. Open the Project in STS:
    Launch Spring Tool Suite.
    Go to File -> Import -> Existing Maven Projects.
    Select the cloned project directory and click Finish.
   
4. Configure MongoDB:
    Make sure MongoDB is installed and running on your local machine.
    Update the application.properties or application.yml file with your MongoDB connection details:
     
    spring.data.mongodb.uri=mongodb://localhost:27017/your-database-name
   
**Run the Application:**
In STS, right-click the project and select Run As -> Spring Boot App.

**Usage**
Once the application is running, you can perform various operations by sending HTTP requests via Postman. Below are the common HTTP methods used:

GET: Retrieve data from the MongoDB database.
POST: Add new data to the database.
PUT: Update existing data.
DELETE: Remove data from the database.

**Example Endpoints**
GET /api/items - Fetch all items.
POST /api/items - Add a new item.
PUT /api/items/{id} - Update an existing item.
DELETE /api/items/{id} - Delete an item.

**Postman Collection**
You can import a Postman collection file provided in the postman directory to simplify the process of testing the APIs.

**Technologies Used**
Spring Boot
MongoDB
Java
Postman

**License**
This project is licensed under the MIT License - see the LICENSE file for details.
