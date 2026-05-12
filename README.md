# 📢 Notification Service (Spring Boot + AWS)

## 📌 About the Project

This is a **Java Spring Boot Notification Service** built to simulate and demonstrate real-world event-driven notification systems used in modern cloud architectures.

The service is designed to send different types of notifications such as:

* 📧 Email notifications
* 📱 SMS notifications
* 🔥 Priority-based alerts
* ☁️ AWS-integrated messaging (SNS / Lambda ready)

It follows a clean layered architecture (Controller → Service → DTO) and is designed for integration with AWS services like SNS and Lambda.

This project is part of my learning journey for AWS Certified Developer Associate and backend engineering practices.

---

## 🚀 Features

* REST API-based notification system
* Support for multiple notification types (Email, SMS, Priority alerts)
* Clean Spring Boot architecture
* JSON-based request handling
* AWS-ready integration (SNS + Lambda support planned/added)
* Easily extendable for mobile push notifications
* Postman-friendly API testing

---

## 🏗️ Tech Stack

* Java 11
* Spring Boot
* Maven
* AWS SNS (planned/optional integration)
* AWS Lambda (event-driven extension)
* REST APIs

---

## 📂 Project Structure

```
notification-service
│
├── controller
│   └── NotificationController.java
│
├── service
│   └── SnsNotificationService.java
│
├── dto
│   └── NotificationRequest.java
│
└── NotificationServiceApplication.java
```

---

## 📡 API Endpoints

### 🔔 Send Notification

**POST** `/api/notifications`

#### Request Body

```json
{
  "type": "EMAIL",
  "message": "Server Alert",
  "email": "test@gmail.com",
  "phoneNumber": "+973XXXXXXXX",
  "priority": "HIGH"
}
```

#### Response

```
Notification Received: Server Alert
```

---

## ⚙️ How to Run

### 1. Clone the repo

```bash
git clone https://github.com/Hamza-Rafique/notification-service.git
```

### 2. Navigate to project

```bash
cd notification-service
```

### 3. Run Spring Boot app

```bash
mvn spring-boot:run
```

### 4. Test API

```
http://localhost:8080/api/notifications
```

---

## ☁️ AWS Integration (Upcoming / Learning)

This project is being extended with:

* AWS SNS (Simple Notification Service)
* AWS Lambda triggers
* Email + SMS delivery via AWS
* Event-driven architecture

---

## 🎯 Learning Goals

* Spring Boot backend development
* REST API design
* AWS cloud integration
* Event-driven architecture
* Microservice-style design

---

## 👨‍💻 Author

* Name: Hamza Rafique
* Focus: Full Stack + AWS Cloud Engineering

---

## 🏷️ GitHub Topics

spring-boot, java, aws, sns, lambda, notification-service, microservices, backend, rest-api, cloud, devops, maven
