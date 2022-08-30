package org.launchcode.java.demos.lsn6inheritance.Technology;

public class Laptop extends Computer{
    String screenDimensions;
    String name;
    private boolean isCharging = false;
    int hoursUsed;
    String hoursLeft;
    int batteryLifeRemaining;
    public String infinitePower() {
            return "Battery is Currently Charging";
        }

    public Laptop(String name, String screenDimensions,  int memory, int ram, boolean isPortable,int batteryLifeHrs, int hrsUsed) {
        super(memory, ram, isPortable, batteryLifeHrs);
        this.name=name;
        this.screenDimensions = screenDimensions;
        mobileCheck();
    }
    
    
    @Override
    public void mobileCheck(){
        if (isCharging){
            this.hoursLeft =infinitePower();
        } else{
            setBatteryLifeHrs(this.getBatteryLifeHrs());

            this.batteryLifeRemaining = hrsRemaining(this.getBatteryLifeHrs(), this.hoursUsed);

        }
    }

    public void plugIn(){
        this.isCharging=true;
    }
    public void unplug(){
        this.isCharging=false;
    }
    public int hrsRemaining(int batteryLifeHrs, int hrsUsed) {
        if (hrsUsed >= batteryLifeHrs) {
            return 0;
        } else {
            return batteryLifeHrs - hrsUsed;
        }
    }

    public String getScreenDimensions() {
        return screenDimensions;
    }

    public void setScreenDimensions(String screenDimensions) {
        this.screenDimensions = screenDimensions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCharging() {
        return isCharging;
    }

    public void setCharging(boolean charging) {
        isCharging = charging;
    }

    public int getHoursUsed() {
        return hoursUsed;
    }

    public void setHoursUsed(int hoursUsed) {
        this.hoursUsed = hoursUsed;
    }

    public String getHoursLeft() {
        return hoursLeft;
    }

    public void setHoursLeft(String hoursLeft) {
        this.hoursLeft = hoursLeft;
    }

    public int getBatteryLifeRemaining() {
        return batteryLifeRemaining;
    }

    public void setBatteryLifeRemaining(int batteryLifeRemaining) {
        this.batteryLifeRemaining = batteryLifeRemaining;
    }

    public String toString() {
        return ("Model name: "+this.getName() +"\nScreen Dimensions: "+this.getScreenDimensions()+"\nInternal Storage: "+ this.getMemory() +"\nRAM: "+ this.getRam() +"\n");
    }
}
