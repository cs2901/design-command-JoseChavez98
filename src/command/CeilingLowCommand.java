package command;

public class CeilingLowCommand implements Command {
    Ceiling ceiling;

    public CeilingLowCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public void execute() {
        ceiling.low();
    }
}
