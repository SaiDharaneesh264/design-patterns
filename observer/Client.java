package observer;

public class Client {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Observer mobileApp = new MobileApp();
        Observer emailAlerts = new EmailAlerts();
        Observer tvChannel = new TVChannel();

        newsAgency.addObserver(mobileApp);
        newsAgency.addObserver(emailAlerts);
        newsAgency.addObserver(tvChannel);

        newsAgency.notifyObservers("Stock Market Hits Recor High!");
        System.out.println("\nRemoving Email Alerts...\n");
        newsAgency.removeObserver(emailAlerts);
        newsAgency.notifyObservers("New Tech Product Launch!");
    }
}
