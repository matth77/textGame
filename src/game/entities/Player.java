package game.entities;

import engine.maths.Vector3i;
import engine.objects.Symbol;
import engine.objects.modifiers.Modifier;
import game.level.Room;

import java.util.ArrayList;

public class Player extends Entitie {

    public Player(Vector3i position, Symbol symbol, Room room, ArrayList<Modifier> modifiers) {
        super(position, symbol, room, modifiers);
    }
}
