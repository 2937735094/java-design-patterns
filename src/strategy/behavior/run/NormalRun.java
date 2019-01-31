package strategy.behavior.run;

import strategy.behavior.interfaces.Run;

public class NormalRun implements Run {
    @Override
    public void execute() {
        System.out.println("普通跑");
    }
}
