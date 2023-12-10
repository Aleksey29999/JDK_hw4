package org.example;
//Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь
//        следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник сотрудников

import java.util.List;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();
        Employee employee1 = new Employee(1, "+79053332211", "Ivan", 23);
        Employee employee2 = new Employee(2, "+79053332212", "Nikolay", 18);
        Employee employee3 = new Employee(3, "+79053332213", "Fedor", 25);
        Employee employee4 = new Employee(4, "+79053332214", "Aleksey", 30);
        Employee employee5 = new Employee(5, "+79053332215", "Stepan", 42);
        Employee employee6 = new Employee(6, "+79053332216", "Mariya", 50);
        Employee employee7 = new Employee(7, "+79053332217", "Svetlana", 33);
        Employee employee8 = new Employee(8, "+79053332218", "Tatyana", 37);
        Employee employee9 = new Employee(9, "+79053332219", "Irina", 44);
        Employee employee10 = new Employee(10, "+79053332220", "Anna", 39);


        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);
        employee.add(employee5);
        employee.add(employee6);
        employee.add(employee7);
        employee.add(employee8);
        employee.add(employee9);
        employee.add(employee10);

        System.out.println(employee);


        System.out.println("Task1--------------------------------");

        var result = employee.stream()
                .filter(x -> x.getAge() < 40)
                .filter(x -> x.getAge() > 34)
                .map(s -> "Имя : " + s.getName())
                .toList();
        System.out.println(result);

        System.out.println("Task2--------------------------------");

        var result1 = employee.stream()
//                .map(String::toUpperCase)
                .filter(s -> s.getName().startsWith("Mariya"))
                .map(s -> "Телефон : " + s.getPhone())
                .collect(Collectors.toList());
        System.out.println(result1);

        System.out.println("Task3--------------------------------");

       var result2 = employee.stream()
               .filter(s -> s.getId()==2)
               .map(s -> "Имя : " + s.getName())
               .toList();
        System.out.println(result2);


        System.out.println("Task4--------------------------------");
       Employee employee11 = new Employee();
        List<Employee> employeeNew = employee.stream()
                .map(s -> {
                        employee11.setId(11);
                        employee11.setName("Nik");
                        employee11.setPhone("+79050402222");
                        employee11.setAge(33);
                                return employee11;
                })
                        .toList();
        employee.add(employee11);
        System.out.println(employee);

    }
}
