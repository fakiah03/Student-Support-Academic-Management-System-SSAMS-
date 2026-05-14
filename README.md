# 🎓 Student Support & Academic Management System (SSAMS)

## 📌 Overview
The **Student Support & Academic Management System (SSAMS)** is a Java-based solution designed to automate the monitoring of student academic performance and streamline the counselling intervention process. Developed for the **CSC248 (Data Structures)** course, this system replaces manual record-checking with an automated "Intelligent Agent" approach to ensure no student is left behind.

---

## ⚠️ The Problem
In many academic institutions, monitoring CGPA is still a manual, error-prone process. This leads to:
* **Human Error:** Overlooking students who critically need academic intervention.
* **Delayed Support:** A significant time gap between result release and support action.
* **Inefficient Tracking:** Lack of a centralized system to track the status of counselling appointments.

---

## 🎯 Project Objectives
* **Centralized Data Management:** Efficiently store and manage student profiles and academic results using structured data formats.
* **Automated Intervention:** Implement an algorithm that instantly detects students with a **CGPA < 2.00** and auto-generates counselling appointments.
* **Status Tracking:** Provide a dedicated dashboard for counsellors to manage and update appointment progress from **"Pending"** to **"Completed"**.

---

## 🛠️ Technical Implementation (CSC248 Focus)
To solve these problems, this project utilizes fundamental **Data Structures** to ensure efficient data handling:

| Component | Implementation |
| :--- | :--- |
| **Data Storage** | `Linked Lists` / `ArrayLists` for dynamic storage of student records and appointment logs. |
| **Logic Engine** | `Conditional Logic & Filtering` to scan records and flag underperforming students. |
| **Architecture** | `Object-Oriented Programming (OOP)` with classes for *Student*, *Counsellor*, and *Appointment*. |

---

## 🚀 Key Features
* **✅ Auto-Detection:** Automatically flags students needing support based on CGPA thresholds.
* **📅 Appointment Management:** Creates a systematic queue for the counselling department.
* **📊 Real-time Status Updates:** Tracks the "Pending" vs "Completed" lifecycle of each support case.

---

## 💻 Tech Stack
* **Language:** Java
* **Concepts:** Data Structures (CSC248), Object-Oriented Programming (OOP)
* **Tools:** IntelliJ
