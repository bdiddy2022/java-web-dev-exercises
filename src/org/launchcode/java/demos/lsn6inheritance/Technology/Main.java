package org.launchcode.java.demos.lsn6inheritance.Technology;

public class Main {

    public static void main(String[] args) {
        //Laptop(String screenDimensions,  int memory, int ram, boolean isPortable,int batteryLifeHrs, int hrsUsed)
        Laptop surface = new Laptop("Surface Laptop 4", "15in x 10in", 512, 32,true, 16,4);
        //SmartPhone(String screenDimensions, String carrier, int ram, int memory, boolean isPortable, int batteryLifeHrs, int hrsUsed)
        SmartPhone pixelSix = new SmartPhone("Pixel 6", "6.4in", "Verizon", 8, 256, true,16,15);

        System.out.println(surface.toString());


    }

}
