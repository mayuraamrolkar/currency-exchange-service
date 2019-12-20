package com.example.controller;
import com.example.currencyexchangeservice.beans.ExchangeBean;
import com.example.currencyexchangeservice.repository.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    Environment env;
    @Autowired
    ExchangeRepository repo;

    @GetMapping(path="/currency-exchange/from/{from}/to/{to}")
    public ExchangeBean retriveCurrencyExchangeValue(@PathVariable String from, @PathVariable String to){

        ExchangeBean exchangeBean= repo.findByFromAndTo(from,to);
       // ExchangeBean exchangeBean=new ExchangeBean(1L,"USD","INR", BigDecimal.valueOf(65L));

        if(exchangeBean!=null)
            exchangeBean.setPort(Integer.valueOf(env.getProperty("local.server.port")));
        else
            exchangeBean= new ExchangeBean();

        return exchangeBean;
    }
}
