package sk.stuba.fei.uim.oop;

import java.util.List;

public class Person {
    private String name;
    private String adress;
    private double height;
    private double weight;
    private int age;
    private List<Person> friends;

    public Person(String name, String adress, double height, double weight, int age, List<Person> friends) {
        this.name = name;
        this.adress = adress;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.friends = friends;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
        this.age = age;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }
}
