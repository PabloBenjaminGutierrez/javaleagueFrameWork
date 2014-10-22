package org.javahispano.javaleague.kpacha.analysis;

import java.util.List;

import org.javahispano.javacup.model.engine.GameSituations;
import org.javahispano.javacup.model.util.Position;
import org.javahispano.javaleague.kpacha.player.AbstractPlayer;

public interface Analysis {

    public void update(GameSituations sp, List<AbstractPlayer> players);

    public GameSituations getGameSituations();

    public GameStatus getGameStatus();

    public Position getInterception();

    public boolean shouldIntercept(int player);

    public double getPositionValoration(int player);

    public double[] getPositionValorations();

    public int getInterceptionIteration();

}
