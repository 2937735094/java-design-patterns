package strategy.animal;

import strategy.behavior.interfaces.Run;
import strategy.behavior.interfaces.Voice;

public abstract class Animal {
    private Voice voice;
    private Run run;

    public void doRun() {
        voice.execute();
    }

    public void doVoice() {
        run.execute();
    }

    public void show() {
        System.out.println("----------开始表演--------------");
        doRun();
        doVoice();
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public void setRun(Run run) {
        this.run = run;
    }
}
