public class SmartWatch extends Gadget {
    private SmartPhone connectedSmartPhone;

    public void connectToSmartPhone(SmartPhone smartPhone) {
        connectedSmartPhone = smartPhone;
        smartPhone.connectToDevice(this);
    }

    public void sendNotificationToSmartPhone(String message) {
        if (connectedSmartPhone != null) {
            connectedSmartPhone.receiveNotification(message);
        }
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("Smartwatch received notification: " + message);
        sendNotificationToSmartPhone(message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("Smartwatch battery is at 75%.");
    }

    public void trackHeartRate() {
        System.out.println("Tracking heart rate.");
    }

    public void showTime() {
        System.out.println("Displaying current time on Smartwatch.");
    }
}