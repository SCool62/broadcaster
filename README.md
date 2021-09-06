# Broadcaster
Broadcaster is a system to broadcast messages to all Java classes set up to accept broadcasts.

# Installation
Still working on getting this library installable

# Documentation
## Make a class receive broadcasts:
```java
import com.scool.broadcaster.BroadcastReceiver;

public class Receiver implements BroadcastReceiver {
  @Override
  public void onBroadcast(String msg) { // msg is the broadcast message
    // HANDLE BROADCAST
  }
}
```
This, on it's own will not do anything. When your program starts you need to execute this method:
```java
Broadcaster.addReceiver(new Receiver());
```
## Send broadcast messages
```java
Broadcaster.sendMessage(message);
```

    
