package observer;

public class MobileApp implements Observer{

    @Override
    public void update(String news) {
        System.out.println("Mobile App: Breaking News - " + news);
    }
    
}
