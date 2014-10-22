package org.javahispano.javaleague.kpacha.strategy;

import java.util.List;

import org.javahispano.javacup.model.command.Command;
import org.javahispano.javaleague.kpacha.analysis.Analysis;
import org.javahispano.javaleague.kpacha.player.AbstractPlayer;

public interface Strategy {

    public List<Command> execute(AbstractPlayer player, Analysis analysis);
}
