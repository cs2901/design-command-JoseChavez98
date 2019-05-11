package command;

public class KitchenOnCommand implements Command {
    Kitchen kit;

    public KitchenOnCommand(Kitchen kit) {
        this.kit = kit;
    }

    @Override
    public void execute() {
        Kitchen.on();
    }
}