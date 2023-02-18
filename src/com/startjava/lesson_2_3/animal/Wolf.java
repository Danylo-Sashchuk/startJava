package com.startjava.lesson_2_3.animal;

public class Wolf {

    private String sex;
    private String name;
    private String color;
    private double weight;
    private int age;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void walk() {
        System.out.println(name + "  идет.");
    }

    public void sit() {
        System.out.println(name + "  сидит.");
    }

    public void run() {
        System.out.println(name + "  бежит.");
    }

    public void howl() {
        System.out.println(name + "  воет.");
    }

    public void hunter() {
        System.out.println(name + "  охотиться.");
    }
}