package com.example.practice.task03;

public class Worker extends Person implements NotHigherEducation{
    private String lastName;
    private int age;
    private String education;
    private String position;

    public Worker(String lastName, int age, String education, String position) {
        this.lastName = lastName;
        this.age = age;
        this.education = education;
        this.position = position;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean ageMore30() {
        if ((age > 30) && hasNotHigherEducation()){
            System.out.println(toString());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean hasNotHigherEducation() {
        return !education.equals("Higher Education");
    }
}
