package org.example;

public class RoomImpl implements Maze{

    @Override
    public String enter() {
        return "player has entered the room";
    }
    public String toString() {
        String result = " room";
        return result;
    }
}
