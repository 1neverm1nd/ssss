
public class SmartPhone extends Gadget {
    private SmartWatch connectedSmartWatch;

    public void connectToSmartWatch(SmartWatch smartWatch) {
        connectedSmartWatch = smartWatch;
        smartWatch.connectToDevice(this);
    }

    public void sendNotificationToSmartWatch(String message) {
        if (connectedSmartWatch != null) {
            connectedSmartWatch.receiveNotification(message);
        }
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("Smartphone received notification: " + message);
        sendNotificationToSmartWatch(message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("Smartphone battery is at 80%.");
    }

    public void makeCall(String number) {
        System.out.println("Making a call to " + number);
    }

    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
        sendNotificationToSmartWatch(message);
    }
}