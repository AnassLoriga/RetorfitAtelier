# 🚀 Professional Android Retrofit App

[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com/)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-blue.svg)](https://kotlinlang.org/)
[![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg)](https://android-arsenal.com/api?level=24)
[![License](https://img.shields.io/badge/License-MIT-orange.svg)](LICENSE)
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen.svg)]()

A comprehensive Android application showcasing modern Android development practices with **Retrofit** for HTTP communication, **MVVM architecture**, and **Material Design** components.

## 📱 Screenshots

<div align="center">
  <img src="https://github.com/user-attachments/assets/c7f62c5a-69f8-4d66-b2f3-22caa1dd229a" width="250" alt="Main Screen"/>
  <img src="https://github.com/user-attachments/assets/9e8cc72e-3113-43db-a871-cbae313b9343" width="250" alt="Post Details"/>
  <img src="https://github.com/user-attachments/assets/e16f2193-4c6a-4eb1-94ed-302071707aff" width="250" alt="Create Post"/>
</div>

## ✨ Features

- 🌐 **REST API Integration** with Retrofit 2
- 🏗️ **MVVM Architecture** with LiveData and ViewModel
- ⚡ **Kotlin Coroutines** for asynchronous operations
- 📋 **RecyclerView** with custom adapter
- 🎨 **Material Design 3** components
- 🔒 **Error Handling** and input validation
- 🔄 **CRUD Operations** for posts
- 🔍 **Search Functionality** by post ID
- 📱 **Responsive UI** with loading states
- 🎯 **Clean Code** following Android best practices

## 🛠️ Tech Stack

| Category | Technology |
|----------|------------|
| **Language** | Kotlin |
| **Architecture** | MVVM (Model-View-ViewModel) |
| **Networking** | Retrofit 2 + Gson |
| **Async Programming** | Kotlin Coroutines |
| **UI Framework** | Material Design 3 |
| **Architecture Components** | LiveData, ViewModel, ViewBinding |
| **Testing API** | JSONPlaceholder |

## 📁 Project Structure

```
app/
├── src/main/java/com/professional/retrofitapp/
│   ├── data/
│   │   ├── model/
│   │   │   └── Post.kt                 # Data model
│   │   ├── api/
│   │   │   ├── ApiService.kt           # API endpoints
│   │   │   └── RetrofitInstance.kt     # Retrofit configuration
│   │   └── repository/
│   │       └── PostRepository.kt       # Data repository
│   ├── ui/
│   │   ├── adapter/
│   │   │   └── PostAdapter.kt          # RecyclerView adapter
│   │   ├── viewmodel/
│   │   │   └── PostViewModel.kt        # Business logic
│   │   └── activity/
│   │       ├── MainActivity.kt         # Main screen
│   │       └── CreatePostActivity.kt   # Create post screen
│   └── utils/
│       ├── Constants.kt                # App constants
│       ├── NetworkResult.kt            # Network state wrapper
│       └── Extensions.kt               # Kotlin extensions
└── res/
    ├── layout/
    │   ├── activity_main.xml
    │   ├── activity_create_post.xml
    │   └── item_post.xml
    ├── values/
    │   ├── colors.xml
    │   ├── strings.xml
    │   └── themes.xml
    └── drawable/
        └── [vector drawables and icons]
```

## 📦 Dependencies

```kotlin
dependencies {
    // Core Android
    implementation 'androidx.core:core-ktx:1.12.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    
    // Architecture Components
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.7.0'
    implementation 'androidx.activity:activity-ktx:1.8.2'
    
    // Networking
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.12.0'
    
    // UI Components
    implementation 'androidx.recyclerview:recyclerview:1.3.2'
    implementation 'androidx.swiperefreshlayout:swiperefreshlayout:1.1.0'
    
    // Coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3'
    
    // Image Loading
    implementation 'com.github.bumptech.glide:glide:4.16.0'
    
    // Testing
    testImplementation 'junit:junit:4.13.2'
    testImplementation 'org.mockito:mockito-core:5.7.0'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
}
```

## 🚀 Getting Started

### Prerequisites

- **Android Studio** Flamingo or newer
- **Android SDK** 24+
- **Kotlin** 1.9+
- **JDK** 8 or higher

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/android-retrofit-professional.git
   cd android-retrofit-professional
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned directory
   - Click "OK"

3. **Build the project**
   ```bash
   ./gradlew build
   ```

4. **Run the application**
   - Connect an Android device or start an emulator
   - Click the "Run" button in Android Studio
   - Or use command line: `./gradlew installDebug`

## 🎯 Usage

### Core Features

#### 📋 View All Posts
- Tap "Load All Posts" button
- Browse through posts in the RecyclerView
- Pull to refresh for latest data

#### 🔍 Search Post by ID
- Enter a post ID in the search field
- Tap "Search" button
- View post details in the dedicated section

#### ✏️ Create New Post
- Tap "Create New Post" button
- Fill in title and content fields
- Tap "Save" to create the post

### API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/posts` | Retrieve all posts |
| `GET` | `/posts/{id}` | Retrieve post by ID |
| `POST` | `/posts` | Create a new post |
| `PUT` | `/posts/{id}` | Update existing post |
| `DELETE` | `/posts/{id}` | Delete a post |

## 🏗️ Architecture

This application follows the **MVVM (Model-View-ViewModel)** architectural pattern recommended by Google:

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│      View       │───▶│   ViewModel     │───▶│     Model       │
│   (Activity/    │    │  (Business      │    │  (Repository/   │
│    Fragment)    │    │    Logic)       │    │   Data Source)  │
└─────────────────┘    └─────────────────┘    └─────────────────┘
        ▲                        │                        │
        │                        ▼                        ▼
        └─────────── LiveData ────────────────────────────┘
```

### Key Components

- **🗂️ Repository Pattern**: Abstracts data sources and provides a clean API
- **📊 LiveData**: Observable data holder for UI updates
- **⚡ Coroutines**: Handles asynchronous operations efficiently
- **🌐 Retrofit**: Type-safe HTTP client for API communication
- **🔄 ViewBinding**: Type-safe view references

## 🔒 Error Handling

The application implements comprehensive error handling:

- **🌐 Network Errors**: Try-catch blocks in repository layer
- **✅ Input Validation**: Client-side validation for user inputs
- **💬 User Feedback**: Toast messages for success/error states
- **⏳ Loading States**: UI feedback during async operations
- **🔄 Retry Mechanism**: Automatic retry for failed network requests

## 🧪 Testing

Run tests using:

```bash
# Unit tests
./gradlew test

# Instrumented tests
./gradlew connectedAndroidTest

# Test coverage report
./gradlew createDebugCoverageReport
```

## 📊 Performance Optimizations

- **🗃️ ViewHolder Pattern** in RecyclerView
- **🔄 Coroutines** for efficient threading
- **💾 Response Caching** with OkHttp
- **🖼️ Image Loading** optimization with Glide
- **📱 Memory Management** with proper lifecycle handling

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Your Name**
- GitHub: [@AnassLoriga](https://github.com/AnassLoriga)
- LinkedIn: [https://www.linkedin.com/in/anas-loriga-897278351/]
- Email: lorigaanas1@gmail.com

## 🙏 Acknowledgments

- [JSONPlaceholder](https://jsonplaceholder.typicode.com/) for the testing API
- [Material Design](https://material.io/) for design guidelines
- [Android Developers](https://developer.android.com/) for comprehensive documentation

---

<div align="center">
  <sub>Built with ❤️ using Kotlin and Android</sub>
</div>
