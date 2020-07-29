package com.auth0.samples;

import org.junit.jupiter.api.Test;

import static com.auth0.samples.Currency.*;

import static org.junit.jupiter.api.Assertions.*;

class ExchangerTest
{
    @Test
    void shouldExchangePlnToPln()
    {
        // given
        Exchanger exchanger = new Exchanger();

        // when
        int actual = exchanger.exchange(PLN, PLN, 158);

        // then
        assertEquals(158, actual);
    }

    @Test
    void shouldExchangeEurToGbp()
    {
        // given
        Exchanger exchanger = new Exchanger();

        // when
        int actual = exchanger.exchange(EUR, GBP, 5500);

        // then
        assertEquals(4750, actual);
    }

    @Test
    void shouldExchangeEurToPln()
    {
        // given
        Exchanger exchanger = new Exchanger();

        // when
        int actual = exchanger.exchange(EUR, PLN, 14400);

        // then
        assertEquals(65454, actual);
    }

    @Test
    void shouldExchangeNegative()
    {
        // given
        Exchanger exchanger = new Exchanger();

        // when
        int actual = exchanger.exchange(SHKL, USD, -200);

        // then
        assertEquals(-57, actual);
    }
}