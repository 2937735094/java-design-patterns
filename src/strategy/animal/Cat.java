package strategy.animal;

import strategy.behavior.run.SpecialRun;
import strategy.behavior.voice.CatVoice;

public class Cat extends Animal {
    public Cat() {
        setVoice(new CatVoice());
        setRun(new SpecialRun());
    }
}
