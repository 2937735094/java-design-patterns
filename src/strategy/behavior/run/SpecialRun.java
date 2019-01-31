package strategy.behavior.run;

import strategy.behavior.interfaces.Run;

public class SpecialRun implements Run {
    @Override
    public void execute() {
        System.out.println("飞檐走壁");
    }
}
