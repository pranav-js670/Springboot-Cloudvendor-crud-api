# CloudVendor CRUD API

A **Spring Boot RESTful API** for managing Cloud Vendors with full CRUD operations.  
This project uses **Spring Boot**, **Spring Data JPA**, and **MySQL** as the database.  
A **Postman collection** is included for testing all endpoints.

---

## 🚀 Features
- Create new Cloud Vendor records
- Retrieve Cloud Vendor details by ID
- Retrieve all Cloud Vendors
- Update Cloud Vendor details
- Delete Cloud Vendor records
- MySQL database integration
- Tested with Postman

## ⚙️ Technologies Used
- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Postman**

## 🛠️ Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/pranav-js670/Springboot-Cloudvendor-crud-api.git
cd springboot-cloudvendor-crud-api
```

### 2. Configure the database
Update application.yml (or application.properties) with your MySQL credentials:
```bash
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/cloud_vendor?useSSL=false
    username: root
    password: your_password
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

### 3. Create the database
```bash
CREATE DATABASE cloud_vendor;
```

### 4. Start the application
```bash
mvn spring-boot:run
```

## 🧪 Testing with Postman

### 1. Import the Postman collection located at
```bash
CloudVendor API Collection.postman_collection.json
```

### 2. The collection contains the following requests:

Get Cloud Vendor by ID
Get All Cloud Vendors
Create New Cloud Vendor
Update Cloud Vendor
Delete Cloud Vendor

### 📌 Future Enhancements

Add JUnit + MockMvc tests

Add pagination & filtering for vendor listing

Add global exception handling with custom error responses

Deploy to Docker and/or cloud platform
