package ru.devray.school.examplesolutions.university;

public class Student extends UniversityVisitor {

    //наименование факультета
    String faculty;

    //код группы
    String groupCode;

    //средний балл
    double averageScore;


    public Student(String fullName, int age, String faculty, String groupCode, double averageScore) {
        super(fullName, age);
        this.faculty = faculty;
        this.groupCode = groupCode;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return String.format("Студент, ФИО: '%s', возраст: '%d', факультет: '%s', группа: '%s', средний балл: '%f'",
                fullName, age, faculty, groupCode, averageScore);
    }
}
