package org.eternity.event;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    @Test
    public void salePrice() {
        Game game = new Game("오브젝트-기초편", 10000, 0.1);
        assertThat(game.calculateSalePrice()).isEqualTo(9000);
    }
}
