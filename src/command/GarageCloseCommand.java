package command;

public class GarageCloseCommand implements Command{
    Garage garage;

    public GarageCloseCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.close();
    }
}
