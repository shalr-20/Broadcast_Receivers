# 4 Pillars of Android:

**1. Activity:** The core component that provides the user interface and interaction.

**2. Service:** A component that runs in the background to perform long-running operations.

**3. Broadcast Receivers:** Handles system-wide events and notifications.

**4. Content Providers:** Manages shared data and database interactions across applications.

## Broadcast Receiver

In Android, Broadcast Receivers are used to handle system-wide events and messages. They enable applications to receive and react to broadcasted intents from the system or other applications, even when other components of the application (e.g., activities and services) are not running. Broadcast Receivers are essential for implementing features like handling incoming messages, device boot events, alarms, connectivity changes, and more.

---

## Key Features of Broadcast Receivers:

**- Callbacks:** Broadcast Receivers are callbacks that get triggered when a specific intent is sent. These intents can be system-wide events such as device start, message receipt, call, or alarm events.

**- Receive Intents:** Even when other components of the application aren’t active, Broadcast Receivers allow applications to listen to system-wide broadcasted intents.

--- 

## Types of Broadcasts:

**- Normal Broadcast:** A regular broadcast that can be intercepted by any Broadcast Receiver in any application.
  
**- Ordered Broadcast:** Allows Broadcast Receivers to be executed sequentially. Receivers can set result codes and data to influence subsequent receivers in the chain.
  
**- Sticky Broadcast:** Retained by the system after the broadcast is completed, allowing other components to retrieve the broadcast data later.
  
**- Local Broadcast:** Restricted to the application sending the broadcast and its receivers. They do not go across application boundaries.

---

## Process of Broadcasting

**- System to App:** The system sends a broadcast to a specific app or all apps.

**- App to App:** One application can send broadcasts to other applications.

**- Within the App:** From one component to another within the same app (e.g., from Activity to Activity).

---

### How Are Broadcasts Implemented?

**-Dynamic Broadcast:** These are temporary broadcasts defined in the Java file. They are used for one-time broadcasts or events not expected to persist across sessions.

**- Static Broadcast:** These are long-lived broadcasts defined in the AndroidManifest.xml file. They are registered with the system and are used for events that need to be received even when the app is not running (e.g., device boot events).

---

## How to View the Animations
Below is the demo video:

<a href="https://github.com/user-attachments/assets/3b5d1adb-80a5-4e2b-9218-71931562f95a" 
  alt="Watch the video">
</a>
