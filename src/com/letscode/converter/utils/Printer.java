package com.letscode.converter.utils;

import com.letscode.converter.service.Conversion;

import java.text.NumberFormat;

public class Printer {

    private static String EXCHANGE_RATE_US_TO_BRL_MESSAGE =
            "Enter exchange rate US DOLLAR (USD) to BRAZIL REAL (BRL): ";
    private static String BRL_AMOUNT_MESSAGE =
            "Enter the amount of BRAZIL REAL (BRL) you want to exchange to US DOLLAR (USD): ";

    public static void printExchangeRateMessage() {
        System.out.print(EXCHANGE_RATE_US_TO_BRL_MESSAGE);
    }

    public static void printBrazilRealAmountMessage() {
        System.out.print(BRL_AMOUNT_MESSAGE);
    }

    public static void printCurrencyConversion() {
        double exchangeRate = Reader.getExchangeRate();
        double brazilRealAmount = Reader.getBrazilRealAmount();
        double usDollarAmount = Conversion.setCurrencyConversion(exchangeRate, brazilRealAmount);

        System.out.printf("Based on today's currency: R$%.2f = " +
                NumberFormat.getCurrencyInstance().format(usDollarAmount),
                brazilRealAmount);
    }
}
