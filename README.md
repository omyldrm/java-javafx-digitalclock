#  🕒 JavaFX Digital Clock

A modern JavaFX Digital Clock application with world timezone support, built using the MVP (Model–View–Presenter) architecture.

Features

⏱ Displays the current time (updates every second using Timeline)

- 📅 Shows the current date
- 🌎 World clock support via a timezone selector (ComboBox)
- 🧱 Clean MVP architecture (Model–View–Presenter separation)
- 🖥 Defaults to system timezone on startup


🏗 Architecture

This project follows the MVP (Model–View–Presenter) design pattern to maintain clean separation of concerns.

🧠 Model

- Handles business logic
- Uses ZonedDateTime, ZoneId, and DateTimeFormatter
- Returns formatted time and date strings

🎨 View

- Owns all UI components (Label, ComboBox)
- Exposes update methods for the Presenter
- Contains no business logic

🎮 Presenter

- Owns and manages the Timeline
- Handles UI events
- Coordinates communication between Model and View

🛠 Requirements
☕ Java 21
🎨 JavaFX SDK


🎯 Learning Goals
This project demonstrates:

- JavaFX fundamentals
- MVP design pattern implementation
- Java Date/Time API (ZonedDateTime, ZoneId, DateTimeFormatter)
- Event handling & Timeline animations
- Git & GitHub version control best practices


# 🚀 Getting Started
Clone the repository:
git clone https://github.com/omyldrm/java-javafx-digitalclock.git

Configure JavaFX in your IDE.
Run the application.

📜 License
This project is licensed under the MIT License.
