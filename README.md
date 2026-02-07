# Interactive AI Canvas & Management System 🎨
**Tech Stack:** Java, JavaFX, Maven, AI-Integration Services

## 🚀 Project Overview
A sophisticated JavaFX-based desktop application that combines a creative drawing canvas with a robust academic management backend. This project demonstrates clean architecture, multi-role access control, and integration of AI services.

## 🛠️ Key Engineering Features
* **Multi-Role Architecture:** Implemented distinct dashboards for Students and Teachers with secure LoginServices.
* **AI Service Integration:** Designed `AIService.java` to handle intelligent logic and automated design suggestions.
* **Data Persistence:** Utilized `DataService` for reliable handling of course, student, and teacher records.
* **Maven Lifecycle:** Managed dependencies and build processes using a standardized `pom.xml` configuration.

## 📂 System Structure
* `src/UI`: View layer containing the Login and Dashboard screens.
* `src/model`: Data objects (User, Student, Teacher, Course).
* `src/service`: Business logic layer handling AI and Data operations.

## ⚙️ How to Run
1. Ensure Java 17+ and Maven are installed.
2. Clone the repo: `git clone https://github.com/ApuroopchaitanyagoudMadari/Interactive-ai-canvas.git`
3. Run `mvn clean install` followed by `java -cp target/EduTrack.jar Main.Main`
