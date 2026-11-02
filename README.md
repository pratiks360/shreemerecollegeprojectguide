<p align="center">
  <h1 align="center">🍰 Bakery Management System</h1>
  <p align="center">
    <strong>College-project REST backend for a bakery: customers, orders, expenses and users.</strong>
  </p>
  <p align="center">
    <img src="https://img.shields.io/badge/Java-8-ed8b00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
    <img src="https://img.shields.io/badge/Spring_Boot-2.x-6db33f?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring_Boot">
    <img src="https://img.shields.io/badge/MySQL-JPA-4479a1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
    <img src="https://img.shields.io/badge/Gradle-build-02303a?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle">
    <img src="https://img.shields.io/github/last-commit/pratiks360/shreemerecollegeprojectguide?style=for-the-badge&label=Last+Commit" alt="Last Commit">
  </p>
</p>

---

## ✨ What Is This?

A student-project guide implementation of a **Bakery Management System**. It persists customers, orders, expenses and users in MySQL through Spring Data JPA, with hand-rolled REST controllers.

## 🔌 Endpoints

| Method | Path | Description |
|---|---|---|
| `POST` | `/customer/addcustomer` | Add a customer |
| `GET` | `/customer/allCustomers` · `/customer/bynum` | List / look up by number |
| `POST` | `/order/addorder` | Place an order |
| `GET` | `/order/allorders` · `/order/byid` | List / fetch an order |
| `POST` | `/expense/addexpense` | Record an expense |
| `GET` | `/usermgmt/status` · `/all` · `/byemail` | User status and lookup |
| `POST` | `/usermgmt/add` | Add a user |

## 🚀 Quick Start

**Prerequisites:** JDK 8+, MySQL with a `bakery_schema` database.

```bash
git clone https://github.com/pratiks360/shreemerecollegeprojectguide.git
cd shreemerecollegeprojectguide
# edit src/main/resources/application.properties with your own DB user/password
./gradlew bootRun
```

Tables are created automatically (`ddl-auto=update`).

## 🔒 Security Notes

- `application.properties` contains a sample DB login — replace it with your own and move it to environment variables before reusing this code.

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| **Framework** | Spring Boot (web, data-jpa) |
| **Database** | MySQL |
| **Build** | Gradle |

---

<p align="center">
  <sub>Built with ❤️ as a college project.</sub>
</p>
