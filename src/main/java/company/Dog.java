package company;

public class Dog implements Interface {
    @Override
    public void MakeSound() {
        System.out.println("Gaf-Gaf");
    }

    @Override
    public void tell1() {
        System.out.println("Я Собака");
    }
}
