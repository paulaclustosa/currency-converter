package com.letscode.converter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner currencyScan = new Scanner(System.in);

        System.out.print("Enter exchange rate US DOLLAR (USD) to BRAZIL REAL (BRL): ");

        double exchangeRate = currencyScan.nextDouble();

        System.out.print("Enter the amount of BRAZIL REAL (BRL) you want to exchange to US DOLLAR (USD): ");

        double brl = currencyScan.nextDouble();

        exchangeBrazilRealToUSDollar(exchangeRate, brl);

    }

    public static void exchangeBrazilRealToUSDollar(double exchangeRate, double brl) {
        double usd = brl / exchangeRate;

        System.out.print("Today " + "R$" + String.format("%.2f", brl) + " equals to ");
        System.out.print(NumberFormat.getCurrencyInstance().format(usd));
    }
}
