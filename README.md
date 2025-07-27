# 🔐 PrimeNumberValidPass - Spring Boot Validation API

> **This Project Belongs to Spring Boot Tutorials**

Welcome to the official repository for **PrimeNumberValidPass**, a Spring Boot application built to demonstrate custom validations using Bean Validation (Jakarta) and Spring Boot REST APIs.

This is **Development Phase 1** focused on:
- Custom annotations
- Input validation
- RESTful API responses
- Global exception handling

---

## 📌 Project Overview

**PrimeNumberValidPass** is a Spring Boot REST API that validates:
1. Whether a number is a **prime number**
2. Whether a password meets **security standards** using custom rules

It leverages:
- Jakarta Bean Validation
- Custom annotations
- `@ControllerAdvice` for clean error responses

---

## 🛠️ Tech Stack

| Technology              | Description                                   |
|------------------------|-----------------------------------------------|
| Java 17                | Programming Language                          |
| Spring Boot            | Framework for REST API                        |
| Spring Web             | REST Controller support                       |
| Jakarta Validation     | Standard bean validation API (`@Valid`)       |
| Custom Annotations     | `@PrimeNumber`, `@ValidPassword`              |
| Lombok                 | Annotation-based boilerplate reduction        |
| Maven                  | Dependency Management                         |
| Postman                | API Testing Tool                              |

---

## 🎯 Features – Phase 1

- ✅ Validate if an input number is **prime**
- 🔒 Validate password strength using custom rules:
  - At least one **uppercase**
  - At least one **lowercase**
  - At least one **special character**
  - Minimum length: **10 characters**
- 📤 JSON-based REST APIs with structured responses
- 🛡️ Input validation using `@Valid`, `@NotBlank`, and custom annotations
- ❌ Global exception handler for validation errors

---

## 📁 Folder Structure

```

PrimeNumberValidPass/
│
├── controller/         # Exposes REST endpoints
├── dto/                # DTOs for request payload
├── annotation/         # Custom validation annotations & validators
├── advice/             # Global exception handler (validation errors)
└── PrimeNumberValidPassApplication.java  # Main class

```

---

## 🚀 API Endpoints

| Method | Endpoint             | Description                      |
|--------|----------------------|----------------------------------|
| POST   | `/validate/number`   | Validates if input is a prime number |
| POST   | `/validate/password` | Validates password strength      |

---

## ✅ Custom Validations

### `@PrimeNumber`
- Ensures the number is greater than 1
- Only divisible by 1 and itself
- Applied on `Integer` fields

### `@ValidPassword`
- At least **1 uppercase**, **1 lowercase**, and **1 special character**
- Minimum **10 characters**
- Applied on `String` fields

---

## 🧪 Global Exception Handling

Handled via:
- `@RestControllerAdvice`
- Captures `MethodArgumentNotValidException`
- Returns clear field-to-error messages in JSON format

---

## 🔧 Application Configuration

| Property               | Value                    |
|------------------------|--------------------------|
| `spring.application.name` | PrimeNumberValidPass    |
| Port                   | Default: 8080            |

---

## 👤 Author

**Shadab Rehan**  
Java | Spring Boot | REST APIs | Validation Expert

🔗 LinkedIn Profile: https://www.linkedin.com/in/shadabrehan

---

## 🙌 Feedback & Contribution

If this project helped you or inspired you:
- ⭐ Star this repo
- 📬 Connect with me on LinkedIn: https://www.linkedin.com/in/shadabrehan
- 🛠️ Fork and contribute with enhancements

---
