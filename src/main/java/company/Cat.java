package company;

public class Cat implements Interface {

    @Override
    public void MakeSound() {
        System.out.println("Miau");
    }

    @Override
    public void tell1() {
        System.out.println("Я Кошка");
    }
}
