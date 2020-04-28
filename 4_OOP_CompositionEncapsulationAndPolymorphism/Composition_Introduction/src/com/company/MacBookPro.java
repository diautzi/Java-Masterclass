package com.company;

public class MacBookPro {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public MacBookPro(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public  void powerUp() {
        theCase.pressPowerButton();
        drawLoop();
    }

    private void drawLoop() {
        ////fancy graphics//
       monitor.drawPixelAt( 1200, 50, "yellow" );
    }

}
