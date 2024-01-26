public class SmartTV extends Gadget {
    @Override
    public void receiveNotification(String message) {
        System.out.println("SmartTV received notification: " + message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("SmartTV doesn't have a battery.");
    }

    public void streamVideo(String url) {
        System.out.println("Streaming video from " + url);
    }

    public void changeChannel(int channel) {
        System.out.println("Changing TV channel to " + channel);
    }
}
