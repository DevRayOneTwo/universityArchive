package ru.devray.school.examplesolutions.university;

/*
Задание 6.2 - Помогаем бюрократам.
К вам обратился декан одного из факультетов - он вечно теряет список своих студентов, и хочет разработать программу, позволяющую ему хранить эти данные.
Тут же к вам подошла руководитель отдела кадров - ей тоже необходимо вести список работников университета, и продолжать это делать на бумажках она не желает.

Разрешите все беды документооборота и создайте необходимую иерархию классов:

Student extends UniversityVisitor
Employee extends UniversityVisitor

Каждому классу задайте несколько нестатических полей и методов.

Создайте класс-архив для хранения информации о всех посетителях университета(и студентов и персонала университета) (используем ArrayList)
Реализуйте у класс архива методы, позволяющие выводить:
-студентов
-преподавателей
-всех посетителей, у кого имя = переданному в аргумент метода параметру
 */
public class Main {
    public static void main(String[] args) {

        //создаем объект архива
        UniversityArchive archive = new UniversityArchive();

        //добавляем образцы данных и студентов и сотрудников университета
        archive.addNewVisitor(new Student("Виталий Орлов", 19, "ИТ", "6505", 4.5));
        archive.addNewVisitor(new Student("Андрей Баранов", 21, "ИТ", "6501", 3.25));
        archive.addNewVisitor(new Student("Степан Кошкин", 19, "ИТ", "6501", 4.83));
        archive.addNewVisitor(new Employee("Сергей Иванов", 56, "Зав. кафедры", 75000));
        archive.addNewVisitor(new Employee("Олег Макаров", 44, "Старший преподаватель", 60000));
        archive.addNewVisitor(new Student("Петр Синицын", 19, "ИТ", "6517", 4.5));
        archive.addNewVisitor(new Student("Глеб Козлов", 19, "ИТ", "6504", 4.1));

        //работаем с нашими крутыми методами
        archive.printAllEmployees();
        archive.printAllStudents();
        archive.printVisitorByName("Кошкин");

    }
}
