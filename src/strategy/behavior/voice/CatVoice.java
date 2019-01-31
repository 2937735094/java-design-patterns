package strategy.behavior.voice;

import strategy.behavior.interfaces.Voice;

public class CatVoice implements Voice {
    @Override
    public void execute() {
        System.out.println("喵喵喵");
    }
}
