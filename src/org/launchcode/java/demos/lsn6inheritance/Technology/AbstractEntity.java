package org.launchcode.java.demos.lsn6inheritance.Technology;

public abstract class AbstractEntity {
    private int id;
    public static int nextId=1;

    private String computerType;

    public AbstractEntity(){
        this.id=nextId;
        nextId++;
    }

    public AbstractEntity(String computerType){
        this();
    }

    public int getId(){
        return this.id;
    }

}
