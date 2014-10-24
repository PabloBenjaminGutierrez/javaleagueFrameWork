package org.javahispano.javaleague.ID_5886672914874368;

import org.javahispano.javaleague.ID_5886672914874368.util.Player;
import org.javahispano.javacup.model.PlayerDetail;
import org.javahispano.javacup.model.TacticDetail;
import org.javahispano.javacup.model.util.Color;
import org.javahispano.javacup.render.EstiloUniforme;

/**
 *
 * @author pablo.gutierrez
 */
public class TeamDetails implements TacticDetail {

    private final TacticTeam tacticTeam;

    TeamDetails(final TacticTeam tacticTeam) {
        this.tacticTeam = tacticTeam;
    }

    public TacticTeam getTacticTeam() {
        return tacticTeam;
    }

    @Override
    public String getTacticName() {
        return "Killers";
    }

    @Override
    public String getCountry() {
        return "Argentina";
    }

    @Override
    public String getCoach() {
        return "Benja";
    }

    @Override
    public Color getShirtColor() {
        return new Color(228, 146, 63);
    }

    @Override
    public Color getShortsColor() {
        return new Color(250, 253, 243);
    }

    @Override
    public Color getShirtLineColor() {
        return new Color(198, 93, 146);
    }

    @Override
    public Color getSocksColor() {
        return new Color(238, 10, 8);
    }

    @Override
    public Color getGoalKeeper() {
        return new Color(164, 50, 99);
    }

    @Override
    public EstiloUniforme getStyle() {
        return EstiloUniforme.FRANJA_DIAGONAL;
    }

    @Override
    public Color getShirtColor2() {
        return new Color(75, 216, 150);
    }

    @Override
    public Color getShortsColor2() {
        return new Color(54, 16, 109);
    }

    @Override
    public Color getShirtLineColor2() {
        return new Color(198, 109, 189);
    }

    @Override
    public Color getSocksColor2() {
        return new Color(98, 119, 97);
    }

    @Override
    public Color getGoalKeeper2() {
        return new Color(73, 215, 254);
    }

    @Override
    public EstiloUniforme getStyle2() {
        return EstiloUniforme.FRANJA_VERTICAL;
    }

    @Override
    public PlayerDetail[] getPlayers() {
        return new PlayerDetail[]{
            new Player("Jugador",  1, 1.00d, 1.00d, 1.00d, true, this),
            new Player("Jugador",  2, 1.00d, 1.00d, 1.00d, this),
            new Player("Jugador",  3, 1.00d, 1.00d, 1.00d, this),
            new Player("Jugador",  4, 1.00d, 1.00d, 1.00d, this),
            new Player("Jugador",  5, 1.00d, 1.00d, 1.00d, this),
            new Player("Jugador",  6, 1.00d, 1.00d, 1.00d, this),
            new Player("Jugador",  7, 1.00d, 1.00d, 1.00d, this),
            new Player("Jugador",  8, 1.00d, 1.00d, 1.00d, this),
            new Player("Jugador",  9, 1.00d, 1.00d, 1.00d, this),
            new Player("Jugador", 10, 1.00d, 1.00d, 1.00d, this),
            new Player("Jugador", 11, 1.00d, 1.00d, 1.00d, this)
        };
    }

}
