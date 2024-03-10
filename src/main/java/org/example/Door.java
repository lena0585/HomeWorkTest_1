package org.example;

import java.util.Random;

class Door {
    private boolean hasPrize;

    public Door() {
        this.hasPrize = false;
    }

    public void setPrize() {
        this.hasPrize = true;
    }

    public boolean hasPrize() {
        return hasPrize;
    }
}










