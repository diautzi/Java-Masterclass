package com.company;

public class Lamp {
    private String style;
    private boolean batery;
    private int globalRating;

    public Lamp(String style, boolean batery, int globalRating) {
        this.style = style;
        this.batery = batery;
        this.globalRating = globalRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turn on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBatery() {
        return batery;
    }

    public int getGlobalRating() {
        return globalRating;
    }
}
