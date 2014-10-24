package org.javahispano.javaleague.ID_5886672914874368;

import java.util.ArrayList;
import java.util.List;
import org.javahispano.javacup.model.Tactic;
import org.javahispano.javacup.model.TacticDetail;
import org.javahispano.javacup.model.command.Command;
import org.javahispano.javacup.model.engine.GameSituations;
import org.javahispano.javacup.model.util.Position;
import org.javahispano.javaleague.ID_5886672914874368.strategy.GameInformation;
import org.javahispano.javaleague.ID_5886672914874368.strategy.Strategy;
import org.javahispano.javaleague.ID_5886672914874368.util.Alignment;

public class TacticTeam implements Tactic {

    private final TacticDetail detail;
    private final GameInformation gameInformation;
    private final List<Strategy> strategies;

    public TacticTeam() {
        this.detail = new TeamDetails(this);
        this.gameInformation = new GameInformation(this);
        this.strategies = new ArrayList<>();
    }

    @Override
    public TacticDetail getDetail() {
        return detail;
    }

    @Override
    public Position[] getStartPositions(GameSituations sp) {
        return Alignment.alineacion5;
    }

    @Override
    public Position[] getNoStartPositions(GameSituations sp) {
        return Alignment.alineacion6;
    }

    @Override
    public List<Command> execute(GameSituations sp) {
        gameInformation.update(sp);
        for (Strategy strategy : strategies) {
            strategy.apply(gameInformation);
        }
        return gameInformation.getCommands();
    }
}
