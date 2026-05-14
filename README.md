Student Support & Academic Management System (SSAMS)
📌 Overview
The Student Support & Academic Management System (SSAMS) is a Java-based solution designed to automate the monitoring of student academic performance and streamline the counselling intervention process. Developed for the CSC248 (Data Structures) course, this system replaces manual record-checking with an automated "Intelligent Agent" approach to ensure no student is left behind.

⚠️ The Problem
In many academic institutions, monitoring CGPA is still a manual, error-prone process. This leads to:

Human Error: Overlooking students who critically need academic intervention.

Delayed Support: A significant time gap between result release and support action.

Inefficient Tracking: Lack of a centralized system to track the status of counselling appointments.

🎯 Project Objectives
Centralized Data Management: Efficiently store and manage student profiles and academic results using structured data formats.

Automated Intervention: Implemented an algorithm that instantly detects students with a CGPA < 2.00 and auto-generates counselling appointments.

Status Tracking: A dedicated dashboard for counsellors to manage and update appointment progress from "Pending" to "Completed".

🛠️ Technical Implementation (CSC248 Focus)
To solve these problems, this project utilizes fundamental Data Structures to ensure efficient data handling:

Linked Lists / ArrayLists: For dynamic storage of student records and appointment logs.

Conditional Logic & Filtering: Automated algorithms to scan through records and flag underperforming students.

Object-Oriented Programming (OOP): Implementing classes for Student, Counsellor, and Appointment for a modular system architecture.

🚀 Key Features
Auto-Detection: The system automatically flags students needing support based on CGPA thresholds.

Appointment Management: Creates a systematic queue for the counselling department.

Real-time Status Updates: Helps staff track the "Pending" vs "Completed" lifecycle of each support case.
