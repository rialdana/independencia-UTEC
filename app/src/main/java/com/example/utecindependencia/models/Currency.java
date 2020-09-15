package com.example.utecindependencia.models;

import java.io.Serializable;

public class Currency implements Serializable {
    private String currencyName;
    private String currencyImageOne;
    private String currencyImageTwo;
    private String currencyImageThree;

    public Currency(String currencyName, String currencyImageOne, String currencyImageTwo, String currencyImageThree) {
        this.currencyName = currencyName;
        this.currencyImageOne = currencyImageOne;
        this.currencyImageTwo = currencyImageTwo;
        this.currencyImageThree = currencyImageThree;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyImageOne() {
        return currencyImageOne;
    }

    public void setCurrencyImageOne(String currencyImageOne) {
        this.currencyImageOne = currencyImageOne;
    }

    public String getCurrencyImageTwo() {
        return currencyImageTwo;
    }

    public void setCurrencyImageTwo(String currencyImageTwo) {
        this.currencyImageTwo = currencyImageTwo;
    }

    public String getCurrencyImageThree() {
        return currencyImageThree;
    }

    public void setCurrencyImageThree(String currencyImageThree) {
        this.currencyImageThree = currencyImageThree;
    }
}
