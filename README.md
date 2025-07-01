
# Real-Time Tactical Command Simulation (Java)

A lightweight real-time simulation built in Java to demonstrate multithreading, object-oriented programming, and MVC-style design. This project simulates units (like drones or vehicles) moving randomly on a grid while being tracked by a command center controller.

---

## Project Overview

- **Language:** Java  
- **Concepts Demonstrated:**
  - Object-Oriented Programming (OOP))
  - MVC-style structure (Model, View, Controller separation)
  - Real-time simulation logic
  - Console-based output
---

## Project Structure

| File | Purpose |
|------|---------|
| `Position.java` | Represents a unit's (x, y) position on a grid. |
| `Unit.java` | Simulates a moving unit using its own thread. |
| `CommandCenter.java` | Manages multiple units and coordinates the simulation. |
| `Main.java` | Entry point; runs the simulation for 10 seconds. |

---

## How It Works

1. The simulation launches 3 units (`Unit-1`, `Unit-2`, `Unit-3`) using threads.
2. Each unit updates its position every 1 second by moving randomly.
3. The `CommandCenter` starts the simulation and shuts it down after 10 seconds.
4. Positions are printed in the console in real time.

---

# How to Run

# Compile

```bash
javac *.java
java Main

---

# Real-World Applications

This simulation models the basic logic behind command and control systems (C2) used in real-world scenarios like:

Military or Tactical Operations: tracking friendly/enemy units

Fleet Management: monitoring delivery trucks, ships, or drones in real time

Emergency Response: coordinating movement of rescue units or firetrucks

Logistics & Warehousing: tracking robot movement across a warehouse grid

With enhancements, this could evolve into a tool for visualizing live location data, issuing commands to units, or logging historical movement

---
# What Could Be Improved / Future Enhancements
Database Logging: Store unit positions in SQLite or PostgreSQL using JDBC

GUI Dashboard: Replace console output with a real-time interface (JavaFX or Swing)

Command Features: Add ability to pause/resume individual units or issue movement commands

Collision Detection: Detect and handle units occupying the same position

Networking: Convert to a client-server architecture to simulate remote control

Unit Testing: Add JUnit tests for core logic (e.g., position updates)

These changes would align the project even more closely with industry-ready systems for logistics, C2, or monitoring dashboards.

---
## Sample Output

Unit-1 is at (0,0)

Unit-2 is at (0,0)

Unit-3 is at (0,1)

Unit-1 is at (1,0)

Unit-2 is at (0,0)

Unit-3 is at (0,2)

Unit-3 is at (0,3)

...

Unit-1 is at (2,0)

Unit-2 is at (0,0)

Unit-3 is at (1,4)

Unit-2 is at (1,1)

Unit-1 is at (3,0)

Simulation ended.
