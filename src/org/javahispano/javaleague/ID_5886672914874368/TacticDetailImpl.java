package org.javahispano.javaleague.ID_5886672914874368;

import org.javahispano.javacup.model.PlayerDetail;
import org.javahispano.javacup.model.TacticDetail;
import org.javahispano.javacup.model.util.Color;
import org.javahispano.javacup.render.EstiloUniforme;

/**
 *
 * @author pablo.gutierrez
 */
class TacticDetailImpl implements TacticDetail {

    private final TacticTeam tacticTeam;

    TacticDetailImpl(final TacticTeam tacticTeam) {
        this.tacticTeam = tacticTeam;
    }

    public String getTacticName() {
        return "benja";
    }

    public String getCountry() {
        return "Argentina";
    }

    public String getCoach() {
        return "Benja";
    }

    public Color getShirtColor() {
        return new Color(228, 146, 63);
    }

    public Color getShortsColor() {
        return new Color(250, 253, 243);
    }

    public Color getShirtLineColor() {
        return new Color(198, 93, 146);
    }

    public Color getSocksColor() {
        return new Color(238, 10, 8);
    }

    public Color getGoalKeeper() {
        return new Color(164, 50, 99);
    }

    public EstiloUniforme getStyle() {
        return EstiloUniforme.FRANJA_DIAGONAL;
    }

    public Color getShirtColor2() {
        return new Color(75, 216, 150);
    }

    public Color getShortsColor2() {
        return new Color(54, 16, 109);
    }

    public Color getShirtLineColor2() {
        return new Color(198, 109, 189);
    }

    public Color getSocksColor2() {
        return new Color(98, 119, 97);
    }

    public Color getGoalKeeper2() {
        return new Color(73, 215, 254);
    }

    public EstiloUniforme getStyle2() {
        return EstiloUniforme.FRANJA_VERTICAL;
    }

    public PlayerDetail[] getPlayers() {
        return new PlayerDetail[]{
            new PlayerDetailImpl("Jugador", 1, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, true, this),
            new PlayerDetailImpl("Jugador", 2, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this),
            new PlayerDetailImpl("Jugador", 3, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this),
            new PlayerDetailImpl("Jugador", 4, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this),
            new PlayerDetailImpl("Jugador", 5, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this),
            new PlayerDetailImpl("Jugador", 6, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this),
            new PlayerDetailImpl("Jugador", 7, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this),
            new PlayerDetailImpl("Jugador", 8, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this),
            new PlayerDetailImpl("Jugador", 9, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this),
            new PlayerDetailImpl("Jugador", 10, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this),
            new PlayerDetailImpl("Jugador", 11, new Color(255, 200, 150), new Color(50, 0, 0), 0.5d, 0.5d, 0.5d, false, this)
        };
    }

}
