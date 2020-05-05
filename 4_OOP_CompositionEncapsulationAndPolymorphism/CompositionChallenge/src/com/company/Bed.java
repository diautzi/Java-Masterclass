package com.company;

public class Bed {

    private String style;
    private int pillow;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillow, int height, int sheets, int quilt) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("BedClass -> making bed");
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPillow(int pillow) {
        this.pillow = pillow;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public void setQuilt(int quilt) {
        this.quilt = quilt;
    }

    public int getPillow() {
        return pillow;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
