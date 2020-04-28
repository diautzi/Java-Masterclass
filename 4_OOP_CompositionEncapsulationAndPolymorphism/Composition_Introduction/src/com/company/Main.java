package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions( 13, 13, 13 );
        Case theCase = new Case("Pro", "Apple", "2020", dimensions);

        Monitor monitor = new Monitor( "Macbook", "Apple", 13, new Resolution(2000, 3000));
        Motherboard motherboard = new Motherboard( "12-00", "Apple", 14, 10, "v2020");
        MacBookPro macBookPro = new MacBookPro( theCase, monitor, motherboard );
//               macBookPro.getMonitor().drawPixelAt( 1500, 1200, "red" );
//        macBookPro.getMotherboard().loadProgram( "Catalina 10.15.4" );
//        macBookPro.getTheCase.pressPowerButton();
        macBookPro.powerUp();
    }
}
