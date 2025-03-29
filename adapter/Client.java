package adapter;

public class Client {
    public static void main(String[] args) {
        RoundPinCharger olCharger = new RoundPinCharger();

        USBCCharger adapter = new ChargerAdapter(olCharger);
        System.out.println("Using the adapter to charge a USB-C laptop:");
        adapter.chargeWithUSBC();
    }
}
