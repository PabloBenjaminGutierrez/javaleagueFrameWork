package org.javahispano.javaleague.kpacha.strategy;

import java.util.ArrayList;
import java.util.List;

import org.javahispano.javacup.model.command.Command;
import org.javahispano.javacup.model.command.CommandHitBall;
import org.javahispano.javacup.model.util.Constants;
import org.javahispano.javaleague.kpacha.analysis.Analysis;
import org.javahispano.javaleague.kpacha.analysis.ShootAnalysis;
import org.javahispano.javaleague.kpacha.analysis.ShootAnalysisData;
import org.javahispano.javaleague.kpacha.player.AbstractPlayer;

public class ShootingStrategy implements Strategy {

    private static ShootingStrategy instance = null;

    public synchronized static ShootingStrategy getInstance() {
        if (instance == null) {
            instance = new ShootingStrategy();
        }
        return instance;
    }

    private ShootingStrategy() {
    }

    public List<Command> execute(AbstractPlayer player, Analysis analysis) {
        List<Command> command = new ArrayList<Command>(1);
        command.add(shootToGoal(player, analysis));
        return command;
    }

    private Command shootToGoal(AbstractPlayer player, Analysis analysis) {
        ShootAnalysis sa = new ShootAnalysis(player, analysis);
        List<ShootAnalysisData> candidates = sa.getShootCandidates(1);
        ShootAnalysisData shootData = null;
        if (candidates.size() > 0) {
            shootData = candidates.get(candidates.size() - 1);
        } else {
            shootData = new ShootAnalysisData(null, player.getPosition().angle(
                    Constants.centroArcoSup), 1, 15d * Math.PI / 180d, 0);
        }
        return new CommandHitBall(player.getCurrentPlayer(),
                shootData.getAzimuth(), shootData.getHitPower(),
                shootData.getElevation());
    }
}
