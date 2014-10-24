package org.javahispano.javaleague.ID_5886672914874368.strategy;

import java.util.ArrayList;
import java.util.List;
import org.javahispano.javacup.model.Tactic;
import org.javahispano.javacup.model.command.Command;
import org.javahispano.javacup.model.engine.GameSituations;

public class GameInformation {

    private final List<Command> commands;

    public GameInformation(Tactic tactic) {
        this.commands =  new ArrayList<>(11);
    }

    public void update(GameSituations sp) {
        this.commands.clear();
    }

    public List<Command> getCommands() {
        return this.commands;
    }

}
