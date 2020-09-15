package com.example.utecindependencia.models;

import java.io.Serializable;

public class Country implements Serializable {

    private String name;
    private String mapImage;
    private String independenceDate;
    private Currency currency;
    private String nationalShieldImage;
    private NationalSymbol nationalBird;
    private NationalSymbol nationalTree;

    public Country(String name, String mapImage, String independenceDate, Currency currency, String nationalShieldImage, NationalSymbol nationalBird, NationalSymbol nationalTree) {
        this.name = name;
        this.mapImage = mapImage;
        this.independenceDate = independenceDate;
        this.currency = currency;
        this.nationalShieldImage = nationalShieldImage;
        this.nationalBird = nationalBird;
        this.nationalTree = nationalTree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMapImage() {
        return mapImage;
    }

    public void setMapImage(String mapImage) {
        this.mapImage = mapImage;
    }

    public String getIndependenceDate() {
        return independenceDate;
    }

    public void setIndependenceDate(String independenceDate) {
        this.independenceDate = independenceDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getNationalShieldImage() {
        return nationalShieldImage;
    }

    public void setNationalShieldImage(String nationalShieldImage) {
        this.nationalShieldImage = nationalShieldImage;
    }

    public NationalSymbol getNationalBird() {
        return nationalBird;
    }

    public void setNationalBird(NationalSymbol nationalBird) {
        this.nationalBird = nationalBird;
    }

    public NationalSymbol getNationalTree() {
        return nationalTree;
    }

    public void setNationalTree(NationalSymbol nationalTree) {
        this.nationalTree = nationalTree;
    }
}
