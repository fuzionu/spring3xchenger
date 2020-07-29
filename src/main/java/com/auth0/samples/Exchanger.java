package com.auth0.samples;

import java.util.HashMap;
import java.util.Map;

import static com.auth0.samples.Currency.*;

public class Exchanger
{
    private final Map<Currency, Integer> factors = getFactors();

    public int exchange(Currency from, Currency to, int amount)
    {
        int fromValue = factors.get(from);
        int toValue = factors.get(to);

        return toValue * amount / fromValue;
    }

    private Map<Currency, Integer> getFactors()
    {
        Map<Currency, Integer> factors = new HashMap<>();

        factors.put(PLN, 100);
        factors.put(EUR, 22);
        factors.put(USD, 24);
        factors.put(GBP, 19);
        factors.put(SHKL, 84);

        return factors;
    }
}
