# Broadcaster
Broadcaster is a system to broadcast messages to all Java classes set up to accept broadcasts.

# Installation
## Maven
Add this dependency to your `pom.xml`:
```xml
<dependency>
  <groupId>com.scool</groupId>
  <artifactId>broadcaster</artifactId>
  <version>1.0</version>
</dependency>
```
Then just reload maven using `mvn install` or any other way that works for you.

# Documentation
## Make a class receive broadcasts:
```java
import com.scool.broadcasting.BroadcastReceiver;

public class Receiver implements BroadcastReceiver {
  @Override
  public void onBroadcast(String msg) { // msg is the broadcast message
    // HANDLE BROADCAST
  }
}
```
Note: Make sure your language Maven language level is 6 or above. If it is not, just remove the `@Override`.
This, on it's own will not do anything. When your program starts you need to execute this method:
```java
Broadcaster.addReceiver(new Receiver());
```
## Send broadcast messages
```java
Broadcaster.sendMessage(message);
```

    
