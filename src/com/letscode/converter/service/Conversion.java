package com.letscode.converter.service;

public class Conversion {

    public static double setCurrencyConversion (double exchangeRate, double currencyAmount) {
        return currencyAmount / exchangeRate;
    }

}
