/*Develop a simple text-based game using Java loops that simulates 
a journey through a maze. The maze consists of rooms represented by numbers 
(e.g., 1, 2, 3, etc.). The player starts in Room 1 and can choose directions 
(north, south, east, west) to move to adjacent rooms. 
Implement a win condition when the player reaches Room 10.*/

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentRoom = 1;

        System.out.println("Welcome to the Maze Game!");
        System.out.println("Goal: Reach Room 10 to win.");
        System.out.println("You are in Room 1.");

        while (currentRoom != 10) {
            System.out.println("\nChoose a direction: north, south, east, west (or exit)");

            if (!sc.hasNext()) {
                break;
            }

            String move = sc.next().toLowerCase();

            if (move.equals("exit")) {
                System.out.println("You left the maze. Game Over!");
                break;
            }

            int nextRoom = currentRoom;

            switch (move) {
                case "north":
                    nextRoom = moveNorth(currentRoom);
                    break;
                case "south":
                    nextRoom = moveSouth(currentRoom);
                    break;
                case "east":
                    nextRoom = moveEast(currentRoom);
                    break;
                case "west":
                    nextRoom = moveWest(currentRoom);
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    continue;
            }

            if (nextRoom == currentRoom) {
                System.out.println("You cannot move in that direction from Room " + currentRoom + ".");
            } else {
                currentRoom = nextRoom;
                System.out.println("You are now in Room " + currentRoom + ".");
            }
        }

        if (currentRoom == 10) {
            System.out.println("Congratulations! You reached Room 10 and won the maze!");
        }

        sc.close();
    }

    static int moveNorth(int room) {
        switch (room) {
            case 2: return 1;
            case 3: return 2;
            case 4: return 3;
            case 5: return 4;
            case 6: return 5;
            case 7: return 6;
            case 8: return 7;
            case 9: return 8;
            case 10: return 9;
            default: return room;
        }
    }

    static int moveSouth(int room) {
        switch (room) {
            case 1: return 2;
            case 2: return 3;
            case 3: return 4;
            case 4: return 5;
            case 5: return 6;
            case 6: return 7;
            case 7: return 8;
            case 8: return 9;
            case 9: return 10;
            default: return room;
        }
    }

    static int moveEast(int room) {
        switch (room) {
            case 1: return 2;
            case 2: return 3;
            case 3: return 4;
            case 4: return 5;
            case 5: return 6;
            case 6: return 7;
            case 7: return 8;
            case 8: return 9;
            case 9: return 10;
            default: return room;
        }
    }

    static int moveWest(int room) {
        switch (room) {
            case 2: return 1;
            case 3: return 2;
            case 4: return 3;
            case 5: return 4;
            case 6: return 5;
            case 7: return 6;
            case 8: return 7;
            case 9: return 8;
            case 10: return 9;
            default: return room;
        }
    }
}