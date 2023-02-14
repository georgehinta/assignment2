package org.example;

public class WallImpl implements Maze{
    @Override
    public String enter() {
        return "player has hit a wall";
    }
}
