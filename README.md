android-preserv (InputPeers)
===============

Android application to get the location, create secret, generate Shamir's share, and send the share via SSL socket (Java)

####  InputPeers
InputPeer is a Gradle-based project written purely in Android/Java. The following libraries are required:
 
 - [msgpack-0.6.8] - Binary serialization format
 - [sepia-0.9.1] - Java library for secure multiparty-computation (MPC)
 - [slf4j-android-1.5.8] - SLF4J logging framework on Android
 - [android-maps-utils-0.3] - Google Maps Android API utility library
 - [Google Play Services] - Provides features and functionality through APIs which integrates with Google services.
 
The minimum SDK version is set to 15 which according to [Android Dashboard] will support 87.9% of the Android devices.

##### Description
The main part of the task is done in a service called `PulseService`. It's invoked periodically by `AlarmManager`, waits for three locations from Google Play Service Location API, uses the most accurate one and decides whether the location is inside any of the polygons. If so, it then creates the share and sends it out to PrivacyPeers using `ShamirGPS` class. `ShamirGPS` uses the public key, `"cert.pem"`, to secure the connection.

The service execution interval and PrivacyPeers' IPs and Ports are configurable via Setting:

![Settings][img-setting]

**TODO**:
 - [ ] There is also another option for POI opt-out in settings to let the user decide which POI (polygon) he/she would like to be opted-out but it lacks the functionality.


[img-setting]:https://dl.dropboxusercontent.com/u/169649705/Henrik/screenshot-settings.png  "Settings activity"