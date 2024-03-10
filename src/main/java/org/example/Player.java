package org.example;
 class Player {
        private int chosenDoor;

        public Player() {
            this.chosenDoor = -1;
        }

        public void chooseDoor(int door) {
            this.chosenDoor = door;
        }

        public int getChosenDoor() {
            return chosenDoor;
        }
    }

