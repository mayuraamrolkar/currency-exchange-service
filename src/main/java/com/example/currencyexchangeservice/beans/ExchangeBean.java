package com.example.currencyexchangeservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name="exchange_bean")
public class ExchangeBean {
    @Id
    Long id;
    @Column(name="currency_from")
    String from;
    @Column(name="currency_to")
    String to;
    BigDecimal multiple;
    int port;

    public ExchangeBean(){

    }
    public ExchangeBean(Long id, String from, String to, BigDecimal multiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.multiple = multiple;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getMultiple() {
        return multiple;
    }

    public void setMultiple(BigDecimal multiple) {
        this.multiple = multiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ExchangeBean{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", multiple=" + multiple +
                ", port=" + port +
                '}';
    }
}
