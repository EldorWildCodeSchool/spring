package com.wildecodeschool.spring_02;

public class Doctor {

    @Override
    public String toString() {
        return "Doctor{" +
                "actorID:" + actorID +
                ", actorName:'" + actorName + '\'' +
                '}';
    }

    private int actorID;
    private String actorName;

    public Doctor() {

    }

    public Doctor(int actorID, String actorName) {
        this.actorID = actorID;
        this.actorName = actorName;
    }

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
}
