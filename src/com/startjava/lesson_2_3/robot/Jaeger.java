package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private String operatingSystem;
    private String energyCore;
    private boolean active;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, String operatingSystem, 
            String energyCore, boolean active, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.operatingSystem = operatingSystem;
        this.energyCore = energyCore;
        this.active = active;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getEnergyCore() {
        return energyCore;
    }

    public void setEnergyCore(String energyCore) {
        this.energyCore = energyCore;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void die() {
        setActive(false);
    }

    public void increaseArmor(int number) {
        setArmor(getArmor() + number);
    }

    public void changeOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void weakenArmor(int deduction) {
        setArmor(getArmor() - deduction);
    }
}
