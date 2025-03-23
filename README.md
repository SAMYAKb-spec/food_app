# FoodHub Android

FoodHub is a comprehensive food delivery platform that connects customers, restaurants, and riders through a seamless mobile experience. The Android application is built using modern Android development practices and technologies.

## Features

### Customer App
- User authentication (Email, Google, Facebook)
- Restaurant browsing and searching
- Menu viewing and item selection
- Cart management
- Order tracking
- Payment integration (Stripe)
- Push notifications for order updates
- Location-based restaurant discovery

### Restaurant App
- Restaurant profile management
- Menu management
- Order management and processing
- Real-time order notifications
- Order status updates

### Rider App
- Order pickup and delivery management
- Real-time location tracking
- Route optimization
- Order status updates
- Push notifications for new orders

## Technical Stack

- **Language**: Kotlin
- **Architecture**: MVVM 
- **UI Framework**: Jetpack Compose
- **Dependency Injection**: Hilt
- **Networking**: Retrofit with OkHttp
- **Image Loading**: Coil
- **Maps Integration**: Google Maps
- **Authentication**: Google Sign-In, Facebook Login
- **Push Notifications**: Firebase Cloud Messaging
- **Payment Processing**: Stripe
- **Location Services**: Google Play Services Location
- **Serialization**: Kotlinx Serialization

## Tutorial Series

Watch the complete tutorial series on YouTube to learn how to build this FoodHub Android app from scratch:

[![FoodHub Android Tutorial](https://img.youtube.com/vi/4kFqlFEEUus/0.jpg)](https://www.youtube.com/watch?v=4kFqlFEEUus&list=PL0pXjGnY7PORsStPOklvOMPOTXoS1-bkP)

### Tutorial Playlist Contents

1. Project Setup and Architecture
2. Authentication Implementation
3. Restaurant Listing and Details
4. Cart Management
5. Order Processing
6. Payment Integration
7. Real-time Location Tracking
8. Push Notifications
9. Restaurant Dashboard
10. Rider App Features

Watch the complete playlist: [FoodHub Android Tutorial Series](https://www.youtube.com/playlist?list=PL0pXjGnY7PORsStPOklvOMPOTXoS1-bkP)

## Screenshots

### Customer App
|   Login Screen   | Restaurant List |Restaurant Details|      Cart        |
|------------------|-----------------|------------------|------------------|
| <img src="docs/screenshots/customer_login.png" width="200"  alt="Login Screen"> | <img src="docs/screenshots/customer_restaurant_list.png" width="200"  alt="Restaurant List"> | <img src="docs/screenshots/customer_restaurant_details.png" width="200"  alt="Restaurant Details"> | <img src="docs/screenshots/customer_cart.png" width="200"  alt="Cart"> |

### Restaurant App
| Dashboard | Menu Management | Order Processing | Add Menu |
|------------------|------------------|------------------|------------------|
| <img src="docs/screenshots/restaurant_dashboard.png" width="200"  alt="Dashboard"> | <img src="docs/screenshots/restaurant_menu.png" width="200"  alt="Menu Management"> | <img src="docs/screenshots/restaurant_orders.png" width="200"  alt="Order Processing"> | <img src="docs/screenshots/restaurant_add_menu.png" width="200"  alt="Add Menu"> |

### Rider App
|    Order List    |    Navigation    |   Order Details  |
|------------------|------------------|------------------|
| <img src="docs/screenshots/rider_orders.png" width="200"  alt="Order List"> | <img src="docs/screenshots/rider_navigation.png" width="200"  alt="Navigation"> | <img src="docs/screenshots/rider_order_details.png" width="200"  alt="Order Details"> |

*Note: Click on any image to view it in full size. All screenshots are displayed at 200x400 pixels to maintain consistent dimensions.*

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/codewithfk/foodhub/
│   │   │   ├── data/           # Data layer (repositories, data sources)
│   │   │   ├── di/            # Dependency injection modules
│   │   │   ├── location/      # Location-related functionality
│   │   │   ├── notification/  # Push notification handling
│   │   │   ├── ui/           # UI components and screens
│   │   │   ├── utils/        # Utility classes
│   │   │   └── FootHubApp.kt # Application class
│   │   └── res/              # Resources
│   └── test/                 # Unit tests
```

## Building the Project

### Prerequisites

- Android Studio Hedgehog (2023.1.1) or newer
- JDK 17 or newer
- Google Maps API key
- Firebase project setup
- Stripe API keys

### Environment Setup

1. Clone the repository
2. Add your Google Maps API key to `AndroidManifest.xml`:
3. Add your Firebase configuration file (`google-services.json`) to the `app` directory
4. Add your Stripe publishable key to the appropriate configuration file

### Building Different Flavors

The project has three flavors: customer, restaurant, and rider. To build each flavor:

#### Customer App
```bash
./gradlew assembleCustomerDebug
# or
./gradlew assembleCustomerRelease
```

#### Restaurant App
```bash
./gradlew assembleRestaurantDebug
# or
./gradlew assembleRestaurantRelease
```

#### Rider App
```bash
./gradlew assembleRiderDebug
# or
./gradlew assembleRiderRelease
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details. This license allows you to:

- Use the code commercially
- Modify the code
- Distribute the code
- Use the code privately
- Sublicense the code

The only requirement is that you must include the original copyright notice and license text in any substantial portion of the code.

## Support

For support, please contact the development team or raise an issue in the repository. 