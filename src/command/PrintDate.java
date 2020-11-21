package command;

import java.util.Date;

public class PrintDate implements Command {
    @Override
    public void execute() {
        Date date = new Date();
        System.out.println(date);
    }
}
