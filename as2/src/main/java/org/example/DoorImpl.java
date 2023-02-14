package org.example;

public class DoorImpl implements Maze {

    @Override
    public String enter() {
        return "player has entered a door";
    }
    public String toString() {
        String result = " door";
        return result;
    }
}
