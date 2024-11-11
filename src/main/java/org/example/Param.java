package org.example;

public class Param {
    private String symbol;
    private int width;
    private int height;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getWidth() {
        return width;
    }

    public void setWedth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Param(String x, int y, int z){
        symbol=x;
        width=y;
        height=z;

    }
}
