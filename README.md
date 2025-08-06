# Todo Test Guide

This repository contains an Appium + Java test suite automating the Todo app.

## Prerequisites
- Java 17+
- Maven
- Appium Server running on port 4723
- Android Emulator running
- APK placed at: `/app/todo.apk`

## How to Run
Prerequisites
1. Java 17 or later Install Java and make sure it's accessible via the terminal: java -version 
2. Maven Make sure Maven is installed: mvn -v 
3. Android SDK
    * Android Studio must be installed.
    * Make sure adb is available in your system PATH. 
4. Appium Server Install Appium globally: npm install -g appium 
5. Appium Inspector (optional) For inspecting UI elements in the app. 
6. Android Emulator or Physical Device
    * Ensure one is running and visible via adb devices. 
7. Todo App APK
    * Place the APK file in your project’s apps/ folder or update path in BaseTest.java.
