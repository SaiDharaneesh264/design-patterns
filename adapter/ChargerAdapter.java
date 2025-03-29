package adapter;

public class ChargerAdapter implements USBCCharger {
    private RoundPinCharger roundPinCharger;

    public ChargerAdapter(RoundPinCharger roundPinCharger) {
        this.roundPinCharger = roundPinCharger;
    }

    @Override
    public void chargeWithUSBC() {
        System.out.println("Adapter converting Round Pin to USB-C...");
        roundPinCharger.chargeWithRoundPin();
    }
    
}
