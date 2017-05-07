package com.srcm;

public class Buy {

    private String portfolio;
    private String tradeType;
    private String market;
    private String sym;
    private int shares;
    private int status;

    public Buy (String portfolio, String trade_type, String market, String sym, int shares, int status) {
        this.portfolio = portfolio;
        this.tradeType = trade_type;
        this.market = market;
        this.sym = sym;
        this.shares = shares;
        this.status = status;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getTradeType() {
        return tradeType;
    }

    public String getMarket() {
        return market;
    }

    public String getSym() {
        return sym;
    }

    public int getShares() {
        return shares;
    }

    public int getStatus() {
        return status;
    }
}
