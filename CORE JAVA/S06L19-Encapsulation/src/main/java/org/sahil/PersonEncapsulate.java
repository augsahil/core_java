package org.sahil;

public class PersonEncapsulate {
    private String name;
    private int age;
    private String gender;

    public PersonEncapsulate(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setAge(int age) {
        if(age > 0 && age <= 100) {
            this.age = age;
            return true;
        }
        else {
            System.out.println("Please enter valid age.");
            return false;
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonEncapsulate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
