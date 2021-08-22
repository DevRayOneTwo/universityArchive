package ru.devray.school.examplesolutions.university;

import java.util.ArrayList;
import java.util.List;

/*
Когда мы выносим все методы из статики - мы преследуем следующую задачу.
Представьте, что мы сделали все поля и методы статическим. Окей. Но завтра к вам приходит заказчик.
И сообщает радостные вести - решение будет использоваться для группы университетов.
Как вы будете делить статические поля и методы между разными университетами в рамках одной программы?
Как будет работать ваш метод "вывести на печать всех студентов"?

Если бы вы построили логику опираясь на объекты - такого вопроса не возникло бы. Можно было бы спокойно
с помощью контруктора создать необходимое количество архивов для каждого отдельного университетов.

Не забывайте, что класс - это в первую очередь именно чертеж для создания объектов.
И зачастую именно объектый подход позволяет решать задачу проще.
 */
public class UniversityArchive {

    //наше универсальное хранилище для всех, и для студентов, и для преподов:)
    //нет необходимости разбивать их на разные списки
    private List<UniversityVisitor> visitors;

    public UniversityArchive() {
        this.visitors = new ArrayList<>();
    }

    public void printAllStudents(){
        System.out.println("Поиск студентов в базе данных...");
        for(UniversityVisitor visitor : visitors){
            if (visitor.getClass() == Student.class){
                System.out.println(String.format("Найден студент. [%s]", visitor));
            }
        }
    }

    public void printAllEmployees(){
        System.out.println("Поиск студентов в базе данных...");
        for(UniversityVisitor visitor : visitors){
            if (visitor.getClass() == Employee.class){
                System.out.println(String.format("Найден сотрудник. [%s]", visitor));
            }
        }
    }

    public void printVisitorByName(String name){
        System.out.println(String.format("Поиск человека с именем/частичным именем '%s' в базе данных...", name));
        for (UniversityVisitor visitor : visitors) {
            if (visitor.fullName.toLowerCase().contains(name.toLowerCase())){
                System.out.println(String.format("Найдено соответствие. [%s]", visitor));
            }
        }
    }

    public void addNewVisitor(UniversityVisitor visitor){
        visitors.add(visitor);
        System.out.println("Добавлен новый посетитель.");
    }

}
