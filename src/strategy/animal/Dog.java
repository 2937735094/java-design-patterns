package strategy.animal;

import strategy.behavior.run.NormalRun;
import strategy.behavior.voice.DogVoice;

public class Dog extends Animal {
    public Dog() {
        setVoice(new DogVoice());
        setRun(new NormalRun());
    }

    @Override
    public void doRun() {
        System.out.println("我要加上一点我的个性！");
        super.doRun();
    }
}
