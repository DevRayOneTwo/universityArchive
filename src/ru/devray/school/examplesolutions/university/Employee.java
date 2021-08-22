package ru.devray.school.examplesolutions.university;

public class Employee extends UniversityVisitor{

    //должность
    String position;

    //заработная плата
    int salary;


    public Employee(String fullName, int age, String position, int salary) {
        super(fullName, age);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Сотрудник университета, ФИО: '%s', возраст: '%d', должность: '%s', зар.плата: '%d'",
            fullName, age, position, salary);
    }
}
