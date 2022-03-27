package players;

import vessels.Vessel;

import java.util.List;

public interface Player {
    void getReadyForGame();
    boolean isReadyToPlay();
    List<Vessel> getVessels();
}