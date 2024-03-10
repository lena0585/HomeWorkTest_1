package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Game game;
    private Player player;

    @Before
    public void setup() {
        int numDoors = 3;
        game = new Game(numDoors);
        player = new Player();
        game.setPlayer(player);
    }

    @Test
    public void testPlayWhenPrizeDoorStay() {
        // Устанавливаем первую дверь с призом
        game.doors[0].setPrize();

        // Игрок выбирает первую дверь
        player.chooseDoor(0);

        // Играем
        boolean result = game.play();

        // Проверяем, что игрок не поменял выбор и выиграл
        assertEquals(true, result);
        assertEquals(0, player.getChosenDoor());
    }

    @Test
    public void testPlayWhenPrizeDoorSwitch() {
        // Устанавливаем первую дверь с призом
        game.doors[0].setPrize();

        // Игрок выбирает первую дверь
        player.chooseDoor(0);

        // Переключаем выбор двери игрока
        player.chooseDoor(1);

        // Играем
        boolean result = game.play();

        // Проверяем, что игрок поменял выбор и проиграл
        assertEquals(false, result);
        assertEquals(1, player.getChosenDoor());
    }
}