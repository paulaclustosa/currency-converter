package com.letscode.converter.utils;

import java.util.Scanner;

public class Reader {

    private static Scanner currencyScan = new Scanner(System.in);

    public static double getExchangeRate() {
        Printer.printExchangeRateMessage();
        return currencyScan.nextDouble();
    }

    public static double getBrazilRealAmount() {
        Printer.printBrazilRealAmountMessage();
        return currencyScan.nextDouble();
    }

}
