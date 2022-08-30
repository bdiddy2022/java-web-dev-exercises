package org.launchcode.java.demos.lsn6inheritance.Technology;

public class SmartPhone extends Laptop{
    private String carrier;

    public SmartPhone(String name, String screenDimensions, String carrier, int ram, int memory, boolean isPortable, int batteryLifeHrs, int hrsUsed){
        super(name, screenDimensions, memory, ram, isPortable, batteryLifeHrs, hrsUsed);
        this.carrier=carrier;
        mobileCheck();
    }

    public boolean isUnlocked(String carrier){
        return this.carrier.length() == 0 || this.carrier.equals("N/A");
    }

}
