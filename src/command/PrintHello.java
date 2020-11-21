package command;

public class PrintHello implements Command{
    @Override
    public void execute() {
        System.out.println("Hello!");
    }
}
