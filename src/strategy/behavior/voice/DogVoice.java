package strategy.behavior.voice;

import strategy.behavior.interfaces.Voice;

public class DogVoice implements Voice {
    @Override
    public void execute() {
        System.out.println("汪汪汪");
    }
}
