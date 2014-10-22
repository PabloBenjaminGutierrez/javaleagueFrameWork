package org.javahispano.javaleague.ID_5886672914874368;

import org.javahispano.javacup.model.PlayerDetail;
import org.javahispano.javacup.model.util.Color;
import org.javahispano.javacup.model.util.Position;

/**
 *
 * @author pablo.gutierrez
 */
class PlayerDetailImpl implements PlayerDetail {

    String nombre;
    int numero;
    Color piel;
    Color pelo;
    double velocidad;
    double remate;
    double presicion;
    boolean portero;
    Position Position;
    private final TacticDetailImpl tacticDetail;

    public PlayerDetailImpl(String nombre, int numero, Color piel, Color pelo, double velocidad, double remate, double presicion, boolean portero, final TacticDetailImpl tacticDetail) {
        this.tacticDetail = tacticDetail;
        this.nombre = nombre;
        this.numero = numero;
        this.piel = piel;
        this.pelo = pelo;
        this.velocidad = velocidad;
        this.remate = remate;
        this.presicion = presicion;
        this.portero = portero;
    }

    public String getPlayerName() {
        return nombre;
    }

    public Color getSkinColor() {
        return piel;
    }

    public Color getHairColor() {
        return pelo;
    }

    public int getNumber() {
        return numero;
    }

    public boolean isGoalKeeper() {
        return portero;
    }

    public double getSpeed() {
        return velocidad;
    }

    public double getPower() {
        return remate;
    }

    public double getPrecision() {
        return presicion;
    }

}
