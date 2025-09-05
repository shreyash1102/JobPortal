# 💼 Job Portal

A **Job Portal** web application built with **Spring Boot** and **MongoDB** 🚀.  
This platform bridges the gap between **recruiters** and **job seekers**, making the hiring process smoother and faster.

---

## 📌 Project Overview

The **Job Portal** serves as a one-stop platform for the job market:
- 👩‍💼 **Recruiters** can post job openings.
- 👨‍🎓 **Candidates** can search and apply for jobs matching their skills.

With **Spring Boot** providing a robust backend and **MongoDB** ensuring flexibility & scalability, this project is both reliable and efficient ⚡.

---

## ✨ Features

### 👤 User Management
- Separate roles for `Recruiters` and `Candidates`.
- Secure user **registration** and **login** 🔐.

### 📝 Job Posting
- Recruiters can **create, update, and delete** job listings.
- Job details include: *title, description, location, and required skills*.

### 🔍 Job Search & Application
- Candidates can **browse & search** based on multiple criteria.
- **One-click apply** for jobs 🙌.
- Track **application status** in real-time.

### 🍃 MongoDB Integration
- Stores job postings, user profiles, and applications efficiently.
- Powered by **Spring Data MongoDB** for seamless interaction.

---

## 🛠️ Technologies Used

- **Backend**: Spring Boot 3.x
- **Database**: MongoDB
- **Language**: Java 17+
- **Build Tool**: Maven

---

## ✅ Prerequisites

Make sure you have these installed before running the project:
- ☕ **Java JDK** 17+
- 🛠️ **Apache Maven** 3.2+
- 🍃 **MongoDB** (Local or MongoDB Atlas)
- 💻 **IDE** (IntelliJ IDEA / Eclipse / VS Code)

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the Repository  
```sh
git clone https://github.com/shreyash1102/JobPortal.git
cd JobPortal
```

### 2️⃣ Configure MongoDB

Edit **`src/main/resources/application.properties`**:

**For Local MongoDB** 🖥️  
```sh
spring.data.mongodb.uri=mongodb://localhost:27017/job-portal-db
```

**For MongoDB Atlas** 🌍  
```sh
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster-url>/job-portal-db?retryWrites=true&w=majority
```
👉 Replace `<username>`, `<password>`, and `<cluster-url>` with your MongoDB Atlas credentials.

### 3️⃣ Build the Project  
```sh
mvn clean install
```

### 4️⃣ Run the Application  
```sh
mvn spring-boot:run
```
Now visit 👉 [http://localhost:8080](http://localhost:8080)

---

## 📡 API Endpoints

### 🔹 **Job Endpoints**
- `GET /api/jobs` → Get all job listings
- `POST /api/jobs` → Create a new job listing
- `GET /api/jobs/{id}` → Get a job by ID

### 🔹 **User Endpoints**
- `POST /api/users/register` → Register a new user
- `POST /api/users/login` → Authenticate user
- `POST /api/jobs/apply/{jobId}` → Apply for a job

---

## 🎯 Conclusion

This **Job Portal** makes the hiring process **simple, efficient, and scalable** ⚡.  
It can be further enhanced with features like **email notifications, interview scheduling, and advanced search filters** 🔥.

---

 
 

