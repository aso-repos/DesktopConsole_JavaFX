# 🖥️ PersonalDesktopConsole_JavaFX

*A fixed-layout JavaFX console inspired by a digital instrument display*

---

## 📌 Project Overview

This project is a **custom-designed personal desktop console**, built as a standalone JavaFX application.

It is intentionally **not a dashboard**, but a structured, fixed-layout **digital instrument**, inspired by physical console displays.

Key goals:

* Apply clean object-oriented structure to UI-driven applications
* Build a **stable, non-dynamic layout** (no widgets, no reflow)
* Create a visually distinctive, device-inspired interface
* Establish a solid foundation for future expansion (reminders, database integration)

---

## 🖼️ Screenshots

**Console Layout (Initial Implementation)**
![Console Layout](Images/Personal%20Dashboard%20Template.png)
*(Add screenshot once ready)*

---

## 🎨 Visual Design

* Inspired by **digital console instruments and LCD displays**
* **Monotone / duotone aesthetic** for clarity and restraint
* Fixed layout with **defined information territories**
* Custom-designed background and UI elements created in CorelDRAW / Photoshop
* No floating elements, no card-based UI, no scrolling

---

## ✨ Current Features

* 🕒 **Date & Time Display**

  * Live system time
  * Day and date formatting
  * Auto-refresh using JavaFX Timeline

* 🌤️ **Weather Display (Base Implementation)**

  * Weather icon rendering
  * Current temperature display
  * Min / Max temperature placeholders

* 🧱 **Structured Console Layout**

  * Left segment: Time anchor (date + time)
  * Right segment: Weather anchor (icon + temperature)
  * Bottom strip reserved for future expansion

---

## 🖌️ Tools & Design Process

* UI and layout designed in **CorelDRAW / Photoshop**
* Assets exported and integrated into JavaFX
* Layout recreated in **Scene Builder** using fixed positioning
* Developed as a **console-style interface**, not a responsive UI

---

## ⚙️ Usage

(Current version is a base functional build)

* Application launches with:

  * Live date and time
  * Weather icon (test value)
  * Static temperature values (for layout validation)

Future versions will include real data integration.

---

## 🚀 How to Run

1. Clone the repository:

   ```
   git clone https://github.com/aso-repos/DesktopConsole_JavaFX.git
   ```

2. Open the project in **IntelliJ IDEA**

3. Configure JavaFX VM options:

   ```
   --module-path "C:/Java/javafx-sdk-21/lib" --add-modules javafx.controls,javafx.fxml
   ```

4. Run `Main.java`

The console window will open with the current layout and placeholder data.

---

## 💻 Development Environment

* **Language:** Java (JDK 21.0.7, ZuluFX)
* **Framework:** JavaFX 21
* **IDE:** IntelliJ IDEA Community Edition
* **UI Builder:** Gluon Scene Builder
* **Version Control:** Git + GitHub

---

## 🚀 Next Steps

* Integrate **WeatherAPI** for real-time data
* Implement **sunrise / sunset display**
* Add **day/night icon logic**
* Improve temperature formatting and data handling
* Activate **bottom strip for reminders / system data**

---

## 🎯 Long-Term Vision

This project aims to evolve into a **fully functional personal console**, combining:

* Environmental data (weather, time)
* Personal data (reminders, alerts)
* Persistent storage (PostgreSQL integration)

All while maintaining a **stable, console-style interface** without redesign.
