# SpiderCast - Live TV Streaming App

SpiderCast is an Android application for streaming live TV channels. Built with Kotlin and ExoPlayer, it provides a smooth and reliable streaming experience.

## Features

- 📺 Live TV streaming with HLS support
- 🎬 Multiple channel categories (Demo, News, Entertainment)
- 📱 Clean and intuitive Material Design UI
- ⚡ Fast and responsive video playback using ExoPlayer
- 🔄 Seamless channel switching
- 📡 Support for HTTP Live Streaming (HLS) protocol

## Technical Stack

- **Language**: Kotlin
- **Min SDK**: 21 (Android 5.0)
- **Target SDK**: 33 (Android 13)
- **Video Player**: ExoPlayer 2.18.7
- **Architecture**: MVVM-ready structure
- **UI**: Material Components, RecyclerView, CardView

## Requirements

- Android Studio Arctic Fox or later
- Android SDK 33
- Gradle 8.0.2
- Kotlin 1.8.0

## Build Instructions

1. Clone the repository:
```bash
git clone https://github.com/sadid2o/SpiderCast-Apk.git
cd SpiderCast-Apk
```

2. Open the project in Android Studio

3. Sync Gradle files

4. Build and run the app on your device or emulator

## App Structure

```
app/
├── src/main/
│   ├── java/com/spidercast/livetv/
│   │   ├── MainActivity.kt           # Main screen with channel list
│   │   ├── VideoPlayerActivity.kt    # Video playback screen
│   │   ├── TVChannel.kt             # Channel data model
│   │   ├── ChannelAdapter.kt        # RecyclerView adapter
│   │   └── ChannelDataSource.kt     # Sample channels data
│   ├── res/
│   │   ├── layout/                  # XML layouts
│   │   ├── values/                  # Strings, colors, themes
│   │   └── drawable/                # Icons and graphics
│   └── AndroidManifest.xml
└── build.gradle
```

## Permissions

The app requires the following permissions:
- `INTERNET` - For streaming video content
- `ACCESS_NETWORK_STATE` - To check network connectivity

## Adding New Channels

To add new channels, edit `ChannelDataSource.kt`:

```kotlin
TVChannel(
    id = 6,
    name = "Your Channel Name",
    streamUrl = "https://your-stream-url.m3u8",
    category = "Category"
)
```

## License

This project is open source and available for educational purposes.

## Contributing

Contributions are welcome! Feel free to submit issues and pull requests.

## Disclaimer

This app is for educational purposes. Ensure you have proper rights and permissions for any content streams you add to the application.