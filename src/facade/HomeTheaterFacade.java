package facade;

import facade.base.DvdPlayer;
import facade.base.Projector;
import facade.base.Screen;

public class HomeTheaterFacade {
    DvdPlayer dvdPlayer;
    Projector projector;
    Screen screen;

    private HomeTheaterFacade() {}

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchDvd() {
        dvdPlayer.on();
        projector.on();
        screen.on();
    }

    public void endDvd() {
        dvdPlayer.off();
        projector.off();
        screen.off();
    }
}
