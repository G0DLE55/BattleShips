package players;

import players.Player;
import vessels.Vessel;

import java.util.List;

public class Computer implements Player {
    List<Vessel> vessels;

    @Override
    public void getReadyForGame() {

    }

    @Override
    public boolean isReadyToPlay() {
        return false;
    }

    @Override
    public List<Vessel> getVessels() {
        return null;
    }
}