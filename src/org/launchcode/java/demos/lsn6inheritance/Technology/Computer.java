package org.launchcode.java.demos.lsn6inheritance.Technology;

public abstract class Computer extends AbstractEntity {
    private int ram;
    private boolean isPlugged;
    public final boolean isPortable;
    private int batteryLifeHrs;
    final private int memory;

    public Computer(int ram, int memory, boolean isPortable, int batteryLifeHrs){
        this.ram = ram;
        this.memory = memory;
        this.isPortable = isPortable;

        mobileCheck();
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getBatteryLifeHrs(){
        if(this.isPortable) {
            return this.batteryLifeHrs;
        } else{
            return 0;
        }
    }
    public void setBatteryLifeHrs(int batteryLifeHrs) {
        this.batteryLifeHrs = batteryLifeHrs;
    }

    public int getMemory() {
        return this.memory;
    }

    public boolean getIsPortable(){
        return this.isPortable;
    }

    public void mobileCheck(){
        if(getIsPortable()){
            setBatteryLifeHrs(batteryLifeHrs);
        }
    }

}
