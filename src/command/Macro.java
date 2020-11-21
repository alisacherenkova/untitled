package command;

import java.util.ArrayList;
import java.util.List;

public class Macro {
    List<Command> list = new ArrayList<>();

    void add(Command cmd){
        list.add(cmd);
    }

    void run(){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).execute();
        }
    }

    public static void main(String[] args){
        Macro m = new Macro();
        m.add(new PrintHello());
        m.add(new PrintHello());
        m.add(new PrintNumber(5));
        m.run();
    }

}