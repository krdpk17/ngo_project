# NGO App

A simple Android application built with Kotlin that demonstrates basic Android development concepts.

## Features

- Welcome screen with a greeting message
- Interactive button that counts clicks
- Toast messages for user feedback
- Modern Material Design UI

## Prerequisites

- Android Studio (latest version recommended)
- JDK 11 or higher
- Android SDK (minimum SDK version: 24)

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone [your-repository-url]
   ```

2. Open the project in Android Studio:
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the project directory and select it

3. Let Android Studio sync the project and download dependencies

4. Run the app:
   - Connect an Android device or start an emulator
   - Click the "Run" button (green play icon) in Android Studio
   - Select your target device/emulator
   - Wait for the app to build and install

## Project Structure

```
app/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/myapp/
│       │       └── MainActivity.kt
│       ├── res/
│       │   ├── layout/
│       │   │   └── activity_main.xml
│       │   └── values/
│       │       └── strings.xml
│       └── AndroidManifest.xml
└── build.gradle
```

## Development

The app is built using:
- Kotlin as the programming language
- AndroidX libraries
- Material Design components
- Gradle build system

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Android Studio team for the development environment
- Google for the Android platform and Material Design 
