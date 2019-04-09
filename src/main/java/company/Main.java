package company;

import java.util.Random;

public class Main {


    //tell(); - Показать свои характеристики
    //GoHome(); - Отправить студента домой
    //allmoney(); - Сколько у студента денег которые он получил учась в институте
    //GiveMoney(2000); - попросить у студента в долг

    public static void main(String[] args) {
        // Реализация Интерфейса
        Interface Cat1 = new Cat();
        Cat1.MakeSound();
        Cat1.tell1();

        System.out.println();

        Interface Dog1 = new Dog();
        Dog1.MakeSound();
        Dog1.tell1();

        System.out.println();

        Interface Jena = new Men();
        Jena.MakeSound();
        Jena.tell1();

        //Полиморфизм
        Drow[] picture = new Drow[]{new Car(), new Home()};
        picture[0].Drow1();
        picture[1].Drow1();

        //Get and Set + конструкторы + перегрузка конструктора
        Men Pasha = new Men();
        Pasha.setName("Пашка");
        Pasha.tell();

        System.out.println();

        Men Misha = new Men();

        System.out.println();

        Course Petia = new Course();

        System.out.println();

        Course Sasha = new Course();

        System.out.println();

        Course Anton = new Course();

        System.out.println();

        Course Gosha = new Course();


        System.out.println();

        Course2 Marina = new Course2();
        Marina.tell();
        Marina.setName("Марина");
        Marina.setStip(1500);
        String name = Marina.getName();
        Marina.GiveMoney(200);


    }


}





