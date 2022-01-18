package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldCalculateCashbackHackForPriceNotDivisibleByThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5300;

        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void shouldCalculateCashbackHackForPriceDivisibleByThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}