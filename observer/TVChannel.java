package observer;

public class TVChannel implements Observer {

    @Override
    public void update(String news) {
        System.out.println("TV Channel: Live Update - " + news);
    }
    
}
