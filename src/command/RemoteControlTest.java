package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        Kitchen kit = new Kitchen();
        KitchenOnCommand KlightOn = new KitchenOnCommand(kit);
        KitchenOffCommand KlightOff = new KitchenOffCommand(kit);

        Ceiling ceiling = new Ceiling();
        CeilingHighCommand CfanHigh = new CeilingHighCommand(ceiling);
        CeilingLowCommand CfanLow = new CeilingLowCommand(ceiling);

        Garage garage = new Garage();
        GarageOpenCommand Gopen = new GarageOpenCommand(garage);
        GarageCloseCommand Gclose = new GarageCloseCommand(garage);

        Stereo stereo  = new Stereo();
        StereoOnCommand Son = new StereoOnCommand(stereo);
        StereoOffCommand Soff = new StereoOffCommand(stereo);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(lightOff);
        remote.buttonWasPressed();

        remote.setCommand(KlightOn);
        remote.buttonWasPressed();
        remote.setCommand(KlightOff);
        remote.buttonWasPressed();

        remote.setCommand(CfanHigh);
        remote.buttonWasPressed();
        remote.setCommand(CfanLow);
        remote.buttonWasPressed();

        remote.setCommand(Gopen);
        remote.buttonWasPressed();
        remote.setCommand(Gclose);
        remote.buttonWasPressed();

        remote.setCommand(Son);
        remote.buttonWasPressed();
        remote.setCommand(Soff);
        remote.buttonWasPressed();

    }
}
