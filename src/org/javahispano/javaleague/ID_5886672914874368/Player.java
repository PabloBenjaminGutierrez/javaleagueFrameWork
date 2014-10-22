package org.javahispano.javaleague.ID_5886672914874368;

import org.javahispano.javacup.model.PlayerDetail;
import org.javahispano.javacup.model.util.Color;
import org.javahispano.javacup.model.util.Position;

/**
 *
 * @author pablo.gutierrez
 */
class Player implements PlayerDetail {

    String nombre;
    int numero;
    Color piel;
    Color pelo;
    double velocidad;
    double remate;
    double presicion;
    boolean portero;
    Position Position;
    private final TeamDetails teamDetails;

    public Player(String nombre, int numero, double velocidad, double remate, double presicion, boolean portero, final TeamDetails teamDetails) {
        this(nombre, numero, new Color(255, 200, 150), new Color(50, 0, 0), velocidad, remate, presicion, portero, teamDetails);
    }

    public Player(String nombre, int numero, double velocidad, double remate, double presicion, final TeamDetails teamDetails) {
        this(nombre, numero, new Color(255, 200, 150), new Color(50, 0, 0), velocidad, remate, presicion, false, teamDetails);
    }

    public Player(String nombre, int numero, Color piel, Color pelo, double velocidad, double remate, double presicion, boolean portero, final TeamDetails teamDetails) {
        this.teamDetails = teamDetails;
        this.nombre = nombre;
        this.numero = numero;
        this.piel = piel;
        this.pelo = pelo;
        this.velocidad = velocidad;
        this.remate = remate;
        this.presicion = presicion;
        this.portero = portero;
    }

    @Override
    public String getPlayerName() {
        return nombre;
    }

    @Override
    public Color getSkinColor() {
        return piel;
    }

    @Override
    public Color getHairColor() {
        return pelo;
    }

    @Override
    public int getNumber() {
        return numero;
    }

    @Override
    public boolean isGoalKeeper() {
        return portero;
    }

    @Override
    public double getSpeed() {
        return velocidad;
    }

    @Override
    public double getPower() {
        return remate;
    }

    @Override
    public double getPrecision() {
        return presicion;
    }

}
