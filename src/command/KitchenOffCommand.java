package command;

public class KitchenOffCommand implements Command {
    Kitchen kit;

    public KitchenOffCommand(Kitchen kit) {
        this.kit = kit;
    }

    @Override
    public void execute() {
        Kitchen.off();
    }
}