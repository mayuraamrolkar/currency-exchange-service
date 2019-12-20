package com.example.currencyexchangeservice.repository;

import com.example.currencyexchangeservice.beans.ExchangeBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<ExchangeBean,Long> {
    public ExchangeBean findByFromAndTo(String from, String to);
}
