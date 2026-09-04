public class Main {

    public static void main(String[] args) {

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Hub hub = new Hub();

        hub.setCommand(new TurnOnCommand(light));
        hub.pressButton();

        hub.setCommand(new TurnOffCommand(light));
        hub.pressButton();

        hub.setCommand(new IncreaseTemperatureCommand(thermostat));
        hub.pressButton();

        hub.setCommand(new DecreaseVolumeCommand(musicPlayer));
        hub.pressButton();
    }
}