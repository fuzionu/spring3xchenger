package com.auth0.samples.controller;

import com.auth0.samples.Currency;
import com.auth0.samples.Exchanger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/exchange")
public class ExchangerController
{
    Exchanger exchanger = new Exchanger();

    @GetMapping
    public Serializable exchange(@RequestParam String dataType,
                                 @RequestParam Currency from,
                                 @RequestParam Currency to,
                                 @RequestParam int amount)
    {
        if (dataType.equalsIgnoreCase("int"))
        {
            return exchanger.exchange(from, to, amount);
        }

        else if (dataType.equalsIgnoreCase("string"))
        {
            return exchangeString(from, to, amount);
        }

        throw new WrongParameterException("Wrong parameter");
    }

    private String exchangeString(Currency from, Currency to, int amount)
    {
        return amount + " " + from + " exchanged to " + to + " is " + exchanger.exchange(from, to, amount);
    }
}