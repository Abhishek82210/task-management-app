
## **📝 Task Management App**  

A simple **Task Management Application** that allows users to **add, delete, and prioritize tasks**.  

- **Frontend**: HTML, CSS, JavaScript  
- **Backend**: Spring Boot (REST API)  

---

## **📌 Features**  

✅ Add new tasks 📝  
✅ Delete tasks ❌  
✅ Set task priority (High, Medium, Low) 🎯  
✅ RESTful API for backend communication  

---

## **🛠️ Tech Stack**  

### **Frontend**  
- HTML, CSS, JavaScript  
- Fetch API to communicate with backend  

### **Backend**  
- Spring Boot  
- Spring Data JPA (for database)  
- MySQL database 
- REST API  

---

## **🚀 Getting Started**  

### **1️⃣ Clone the Repository**  
```sh
git clone https://github.com/YOUR_USERNAME/task-management-app.git
cd task-management-app
```

---

### **2️⃣ Backend Setup (Spring Boot)**
#### **🔹 Prerequisites**  
- **Java 17+** installed  
- **Maven** installed  

#### **🔹 Run Backend Locally**  
```sh
cd backend
mvn spring-boot:run
```
By default, the API will run on **http://localhost:8080** 🚀  

---

### **3️⃣ Frontend Setup**
#### **🔹 Open `index.html`**
Simply open `frontend/index.html` in a browser.  

OR, if using **Live Server (VS Code Extension)**:  
1. Open `frontend/` in VS Code  
2. Right-click `index.html` → Click **"Open with Live Server"**  

---

## **📡 API Endpoints (Spring Boot Backend)**  

| Method | Endpoint       | Description           |
|--------|---------------|-----------------------|
| `GET`  | `/tasks`      | Fetch all tasks      |
| `POST` | `/tasks`      | Add a new task       |
| `PUT`  | `/tasks/{id}` | Update task priority |
| `DELETE` | `/tasks/{id}` | Delete a task        |
  

---

## **🛠️ Project Structure**  

```
task-management-app/
│── backend/         # Spring Boot backend
│   ├── src/
│   ├── pom.xml
│   ├── application.properties
│
│── frontend/        # HTML, CSS, JS frontend
│   ├── index.html
│   ├── style.css
│   ├── app.js
│
│── .gitignore
│── README.md
```

---

