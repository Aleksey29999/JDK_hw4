package org.example;

public class Employee {
    int id;
    String phone;
    String name;
    int age;

    public Employee(int id, String phone, String name, int age) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return  "id=" + id +
                "; Name=" + name +
                "; phone=" + phone +
                "; age=" + age +
                '\n';
    }
}
