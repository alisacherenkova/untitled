package command;

public class PrintNumber implements Command {
    int m;
    public PrintNumber(int number) {
        this.m = number;
    }

    @Override
    public void execute() {
        System.out.println(m);
    }
}
