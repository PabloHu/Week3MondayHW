package com.example.admin.week3mondayhw;

/**
 * Created by Admin on 9/12/2017.
 */

public class Animal {
    String Name;
    String Type;
    int Age;
    int Weight;
    int ImageId;

    public Animal(String name, String type, int age, int weight, int ImageId) {
        Name = name;
        Type = type;
        Age = age;
        Weight = weight;
        this.ImageId= ImageId;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }
}
