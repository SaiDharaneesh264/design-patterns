package command;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
    
        RemoteControl remote = new RemoteControl();
    
        remote.pressUndo();

        remote.pressButton(lightOn);
        remote.pressUndo();

        remote.pressButton(lightOff);
        remote.pressUndo();
    }
}
