package org.example;

import java.util.Random;

class Game {
    Door[] doors;
    private Player player;
    private int numDoors;
    private Random random;

    public Game(int numDoors) {
        this.numDoors = numDoors;
        this.random = new Random();
        initializeDoors();
    }

    private void initializeDoors() {
        this.doors = new Door[numDoors];
        for (int i = 0; i < numDoors; i++) {
            doors[i] = new Door();
        }
        int randomPrizeDoor = random.nextInt(numDoors);
        doors[randomPrizeDoor].setPrize();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean play() {
        int shownDoor = -1;
        do {
            int randomDoor = random.nextInt(numDoors);
            if (randomDoor != player.getChosenDoor() && !doors[randomDoor].hasPrize()) {
                shownDoor = randomDoor;
                break;
            }
        } while (true);

        boolean switchDoor = random.nextBoolean();

        if (switchDoor) {
            int newDoor = -1;
            for (int i = 0; i < numDoors; i++) {
                if (i != shownDoor && i != player.getChosenDoor()) {
                    newDoor = i;
                    break;
                }
            }
            player.chooseDoor(newDoor);
        }

        return doors[player.getChosenDoor()].hasPrize();
    }

}