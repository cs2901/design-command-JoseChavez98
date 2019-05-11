package command;

public class CeilingHighCommand implements Command{
    Ceiling ceiling;

    public CeilingHighCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public void execute() {
        ceiling.high();
    }
}
