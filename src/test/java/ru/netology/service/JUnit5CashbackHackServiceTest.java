package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class JUnit5CashbackHackServiceTest {

    @Test
    void shouldCalculateCashbackHackForPriceNotDivisibleByThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5300;

        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateCashbackHackForPriceDivisibleByThousandJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
