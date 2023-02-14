package org.example;
public class MazeGame {

    public Maze createMaze(MazeFactory factory) {
        Maze maze = factory.create("maze");
        Maze mazeDoor = factory.create("door");
        Maze mazeWall = factory.create("wall");
        Maze mazeRoom = factory.create("room");

        System.out.println(maze.enter() + "\n" +
                mazeRoom.enter() + "\n" +
                mazeWall.enter() + "\n" +
                mazeDoor.enter() + "\n" +
                mazeRoom.enter() + "\n" +
                maze.enter());
        //
        return maze;
    }
    public Maze createEnhantedMaze(EnchantedMazeFactory factory) {
        Maze enchantedroomMazeRoom = factory.create("enchantedRoom");
        Maze doorNeedingSpell = factory.create("DoorNeedingSpell");
        System.out.println(enchantedroomMazeRoom.enter() + "\n" +
                enchantedroomMazeRoom.toString());
        System.out.println(doorNeedingSpell.enter() + "\n" +
                doorNeedingSpell.toString());
        //
        return enchantedroomMazeRoom;
    }
}

