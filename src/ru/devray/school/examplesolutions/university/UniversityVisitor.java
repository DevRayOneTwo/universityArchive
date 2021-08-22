package ru.devray.school.examplesolutions.university;

public class UniversityVisitor {

    //ФИО посетителя
    String fullName;

    //возраст посетителя
    int age;


    public UniversityVisitor(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Посетитель, ФИО: '%s', возраст: '%d'", fullName, age);
    }
}
