package company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Men implements Interface { //создаем переменные и инициализируем их

    private String name;
    private int age;                    // Нельзя вызвать из дочернего класса
    private String coloreye;
    public int result1 = 1;// Поле вне видимости метода вызываем его.syper
    private String status;
    int a[] = new int[]{1,2,3,4,5,6,6};



    public String Iam = "Я в родительском классе ко мне можно достучаться используя syper.";

    public Men() {

    }

    public void tell() {
        System.out.println("Имя студента= " + getName());
        System.out.println("Возраст= " + getAge());
        System.out.println("Цвет глаз= " + getColoreye());
        System.out.println("Статус= " + getStatus());
    }


    public Men(String name, int age, String coloreye, String status) {          // конструктор
        this.name = name;
        this.age = age;
        this.coloreye = coloreye;
        this.status = status;

    }
        // сами геттеры и сеттреры
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

    public String getColoreye() {
        return coloreye;
    }

    public void setColoreye(String coloreye) {
        this.coloreye = coloreye;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String Data() {                       // функция генерирующая дату в поле (Date)
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy-MM-dd");
        String Data = formatForDateNow.format(dateNow);
        return Data;
    }

    public String GoHome() {// Создаем функцию которая выводит на экран когда студент ушел домой
        String data = Data();
        String home = ("Student " + name + " Go Home ") + Data();
        System.out.println(home);
        return data;


    }

    @Override
    public void tell1() {
        System.out.println("Я очень хочу учиться");
    }

    @Override
    public void MakeSound() {
        System.out.println("Я человек");
    }


}


