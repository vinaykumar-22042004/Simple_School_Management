# 🎓 School Management System

A web-based **School Management System** that allows **students**, **teachers**, and **administrators** to perform essential operations such as managing attendance, viewing marks, and maintaining user records. Built using **Jakarta Servlets**, **JSP**, and **MySQL**.

---

## 🛠️ Technologies Used

- Java (JDK 17 or compatible)
- Jakarta Servlet API
- JSP (JavaServer Pages)
- MySQL (Database)
- JDBC (Java Database Connectivity)
- Apache Tomcat (Server)
- Eclipse IDE

---

## 📄 Features

### 👨‍🎓 Student
- ✅ Check Attendance
- 📝 View Marks

### 👨‍🏫 Teacher
- ✍️ Update Attendance
- 🧮 Enter or Update Marks

### 👩‍💼 Admin
- ➕ Add Teacher
- ➕ Add Student

---

## 🗃️ Database Configuration

### 1. Create the Database

```sql
CREATE DATABASE schoolmanagement;
USE schoolmanagement;
```
## 2. Create the Tables

```sql
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(50)
);

CREATE TABLE teachers (
    teacher_id INT PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(50)
);

CREATE TABLE attendance (
    student_id INT,
    date DATE,
    status VARCHAR(10),
    FOREIGN KEY (student_id) REFERENCES students(student_id)
);

CREATE TABLE marks (
    student_id INT,
    subject VARCHAR(100),
    marks INT,
    FOREIGN KEY (student_id) REFERENCES students(student_id)
);
```

## ⚙️ Setup Instructions
### ** 📥 Step 1: Clone the Repository **
```bash
git clone https://github.com/your-username/school-management-system.git
```
### ** 🧩 Step 2: Import into Eclipse **
* Go to `File > Import > Existing Projects into Workspace`
* Select the cloned folder

### ** 🔧 Step 3: Configure Build Path **
* `Right-click on project → Build Path → Configure Build Path → Libraries`

* Add:
    * Apache Tomcat server runtime
    * MySQL JDBC driver (`mysql-connector-java-x.x.x.jar`)

## 🔌 Step 4: MySQL Connection Setup
In your Servlet files, use the following JDBC code:
```java
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/schoolmanagement", "your_username", "your_password");
```
📝 Replace `your_username` and `your_password` with your MySQL credentials.

## 🚀 Step 5: Run the Project
* Right-click the project → Run As → Run on Server
* Select Apache Tomcat

## 📌 Notes

* This is a beginner-level project for educational use.
* Replace plaintext passwords with secure hashes in real deployments.
* Make sure the MySQL server is up and running before use.
