package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {

        BigDecimal price = BigDecimal.valueOf(0);

        if (condition == 1) {
            price = new BigDecimal("180.00").multiply(BigDecimal.valueOf(squareFoot));

        } else if (condition == 2) {
            price = new BigDecimal("130.00").multiply(BigDecimal.valueOf(squareFoot));

        } else if (condition == 3) {
            price = new BigDecimal("90.00").multiply(BigDecimal.valueOf(squareFoot));

        } else if (condition == 4) {
            price = new BigDecimal("80.00").multiply(BigDecimal.valueOf(squareFoot));

        }

        BigDecimal lot = new BigDecimal("0.25").multiply(BigDecimal.valueOf(lotSize));

        BigDecimal total = price.add(lot);


        return total;
    }
}
