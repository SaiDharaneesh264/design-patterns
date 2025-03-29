package observer;

public class EmailAlerts implements Observer {

    @Override
    public void update(String news) {
       System.out.println("Email Alert: Latest News - " + news);
    }
    
}
