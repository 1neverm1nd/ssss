public class Main {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        SmartWatch smartwatch = new SmartWatch();
        SmartTV smartTV = new SmartTV();

        // Устанавливаем соединение между смартфоном и смартчасами
        smartphone.connectToSmartWatch(smartwatch);

        smartphone.turnOn();
        smartphone.connectToInternet();

        smartwatch.turnOn();
        smartwatch.connectToInternet();

        smartTV.turnOn();
        smartTV.connectToInternet();

        smartphone.makeCall("87772836762");
        smartphone.sendSMS("Hello!");

        smartwatch.trackHeartRate();
        smartwatch.showTime();

        smartTV.streamVideo("https://moodle.astanait.edu.kz/mod/assign/view.php?id=113887");
        smartTV.changeChannel(5);

        smartphone.turnOff();
        smartwatch.turnOff();
        smartTV.turnOff();
    }
}
