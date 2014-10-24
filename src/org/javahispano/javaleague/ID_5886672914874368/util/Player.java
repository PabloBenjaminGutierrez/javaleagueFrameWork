package org.javahispano.javaleague.ID_5886672914874368.util;

import org.javahispano.javacup.model.PlayerDetail;
import org.javahispano.javacup.model.util.Color;
import org.javahispano.javaleague.ID_5886672914874368.TeamDetails;

/**
 *
 * @author pablo.gutierrez
 */
public class Player extends PlayerInGame implements PlayerDetail {

    private final String playerName;
    private final int number;
    private final Color skin;
    private final Color hair;
    private final boolean goalkeeper;
    private final double speed;
    private final double power;
    private final double accuracy;
    private final TeamDetails teamDetails;

    public Player(String name, int number, double speed, double power, double accuracy, boolean goalkeeper, final TeamDetails teamDetails) {
        this(name, number, new Color(255, 200, 150), new Color(50, 0, 0), speed, power, accuracy, goalkeeper, teamDetails);
    }

    public Player(String name, int number, double speed, double power, double accuracy, final TeamDetails teamDetails) {
        this(name, number, new Color(255, 200, 150), new Color(50, 0, 0), speed, power, accuracy, false, teamDetails);
    }

    public Player(String name, int number, Color skin, Color hair, double speed, double power, double accuracy, boolean goalkeeper, final TeamDetails teamDetails) {
        this.teamDetails = teamDetails;
        this.playerName = name;
        this.number = number;
        this.skin = skin;
        this.hair = hair;
        this.speed = speed;
        this.power = power;
        this.accuracy = accuracy;
        this.goalkeeper = goalkeeper;
    }

    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public Color getSkinColor() {
        return skin;
    }

    @Override
    public Color getHairColor() {
        return hair;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public boolean isGoalKeeper() {
        return goalkeeper;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public double getPrecision() {
        return getAccuracy();
    }

    public double getAccuracy() {
        return accuracy;
    }

    public TeamDetails getTeamDetails() {
        return teamDetails;
    }

}
