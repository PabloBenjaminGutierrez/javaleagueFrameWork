package org.javahispano.javaleague.toulousains.core.strategy;

import org.javahispano.javacup.model.util.Position;

public interface Strategy {

    Position[] getLineUpAttacking();

    Position[] getLineUpDefending();
}
