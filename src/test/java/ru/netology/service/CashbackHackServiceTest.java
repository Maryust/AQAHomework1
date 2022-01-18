package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateCashbackHackForPriceNotDivisibleByThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5300;

        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateCashbackHackForPriceDivisibleByThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
}