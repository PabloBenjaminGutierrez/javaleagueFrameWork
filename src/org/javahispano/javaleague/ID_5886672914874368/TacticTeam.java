package org.javahispano.javaleague.ID_5886672914874368;

import org.javahispano.javacup.model.engine.GameSituations;
import java.util.List;
import org.javahispano.javacup.model.Tactic;
import org.javahispano.javacup.model.TacticDetail;
import org.javahispano.javacup.model.command.Command;
import org.javahispano.javacup.model.util.Position;

public class TacticTeam implements Tactic {

    Position alineacion1[] = new Position[]{
        new Position(0.2595419847328244, -50.41044776119403),
        new Position(-19.46564885496183, -31.6044776119403),
        new Position(0.2595419847328244, -31.082089552238806),
        new Position(19.984732824427482, -31.6044776119403),
        new Position(7.526717557251908, -11.753731343283583),
        new Position(-8.564885496183205, -11.753731343283583),
        new Position(-24.65648854961832, -2.3507462686567164),
        new Position(23.099236641221374, -2.873134328358209),
        new Position(-14.274809160305344, 30.559701492537314),
        new Position(-0.7786259541984732, 8.097014925373134),
        new Position(12.717557251908397, 29.51492537313433)
    };

    Position alineacion2[] = new Position[]{
        new Position(0.2595419847328244, -50.41044776119403),
        new Position(-11.16030534351145, -31.082089552238806),
        new Position(11.16030534351145, -31.6044776119403),
        new Position(27.251908396946565, -27.94776119402985),
        new Position(-29.84732824427481, -26.902985074626866),
        new Position(8.564885496183205, -7.574626865671642),
        new Position(-10.641221374045802, -7.052238805970149),
        new Position(27.251908396946565, 4.440298507462686),
        new Position(-29.32824427480916, 3.3955223880597014),
        new Position(-0.2595419847328244, 19.067164179104477),
        new Position(-0.2595419847328244, 35.78358208955224)
    };

    Position alineacion3[] = new Position[]{
        new Position(0.2595419847328244, -50.41044776119403),
        new Position(-11.16030534351145, -31.082089552238806),
        new Position(11.16030534351145, -31.6044776119403),
        new Position(26.732824427480914, -20.111940298507463),
        new Position(-29.32824427480916, -21.67910447761194),
        new Position(0.2595419847328244, -0.26119402985074625),
        new Position(-18.946564885496183, -0.26119402985074625),
        new Position(18.946564885496183, -0.26119402985074625),
        new Position(-19.46564885496183, 35.78358208955224),
        new Position(-0.2595419847328244, 19.067164179104477),
        new Position(18.946564885496183, 35.26119402985075)
    };

    Position alineacion4[] = new Position[]{
        new Position(0.2595419847328244, -50.41044776119403),
        new Position(-11.16030534351145, -31.082089552238806),
        new Position(11.16030534351145, -31.6044776119403),
        new Position(28.290076335877863, -28.470149253731343),
        new Position(-28.290076335877863, -28.470149253731343),
        new Position(11.16030534351145, -1.3059701492537314),
        new Position(-10.641221374045802, -0.7835820895522387),
        new Position(-27.251908396946565, 31.6044776119403),
        new Position(-10.641221374045802, 30.559701492537314),
        new Position(9.603053435114505, 28.992537313432837),
        new Position(25.69465648854962, 28.992537313432837)
    };

    Position alineacion5[] = new Position[]{
        new Position(0.2595419847328244, -50.41044776119403),
        new Position(-11.16030534351145, -35.78358208955224),
        new Position(12.717557251908397, -35.26119402985075),
        new Position(28.290076335877863, -28.470149253731343),
        new Position(-28.290076335877863, -28.470149253731343),
        new Position(14.793893129770993, -18.544776119402986),
        new Position(-17.389312977099234, -19.58955223880597),
        new Position(-23.618320610687025, -0.7835820895522387),
        new Position(5.969465648854961, -5.485074626865671),
        new Position(0.2595419847328244, -0.26119402985074625),
        new Position(22.580152671755727, -1.3059701492537314)
    };

    Position alineacion6[] = new Position[]{
        new Position(0.2595419847328244, -50.41044776119403),
        new Position(-11.16030534351145, -35.78358208955224),
        new Position(12.717557251908397, -35.26119402985075),
        new Position(28.290076335877863, -28.470149253731343),
        new Position(-28.290076335877863, -28.470149253731343),
        new Position(14.793893129770993, -18.544776119402986),
        new Position(-17.389312977099234, -19.58955223880597),
        new Position(-23.618320610687025, -0.7835820895522387),
        new Position(6.4885496183206115, -6.529850746268657),
        new Position(-6.4885496183206115, -6.529850746268657),
        new Position(22.580152671755727, -1.3059701492537314)
    };

    TacticDetail detalle = new TacticDetailImpl(this);

    public TacticDetail getDetail() {
        return detalle;
    }

    public Position[] getStartPositions(GameSituations sp) {
        return alineacion5;
    }

    public Position[] getNoStartPositions(GameSituations sp) {
        return alineacion6;
    }

    public List<Command> execute(GameSituations sp) {
        return null;
    }
}
