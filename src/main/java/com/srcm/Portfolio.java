package com.srcm;

import java.util.List;

/**
 * Created by Pentcho on 5/6/2017.
 */
public class Portfolio {

    private String name;
    private List<String[]> positions;
    private double netWorth;
    private double buyPower;
    private List<String[]> transactions;

    public Portfolio(String name, List<String []> positions, double net_worth, double buy_power,
                      List<String[]> transactions) {

        this.name = name;
        this.positions = positions;
        this.netWorth = net_worth;
        this.buyPower = buy_power;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public List<String[]> getPositions() {
        return positions;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public double getBuyPower() {
        return buyPower;
    }

    public List<String[]> getTransactions() {
        return transactions;
    }
}
