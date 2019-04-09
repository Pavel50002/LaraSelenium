package company;

public class Course extends Men {                             // Наследуем класс Men
    ;

    protected int stip;
    protected int course;
    protected int appraisal;


    public void tell() {                                                    // функция выводит на экран параметры объекта
        System.out.println("NameMen= " + getName());
        System.out.println("AgeMen= " + getAge());
        System.out.println("ColorEye= " + getColoreye());
        System.out.println("appraisal= " + getAppraisal());
        System.out.println("Course= " + getCourse());
        System.out.println("Стипендия= " + getStip());
        System.out.println("Статус= " + getStatus());

    }

    public Course(String name, int age, String coloreye, int app, int cou, int stip, String status) {      // Добавляем кусочек к конструктору
        super(name, age, coloreye, status);
        this.course = cou;
        this.stip = stip;
        this.appraisal = app;
    }

    public Course() {

    }

    public int getStip() {
        return stip;
    }

    public void setStip(int stip) {
        this.stip = stip;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.stip = course;
    }

    public int getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(int appraisal) {
        this.appraisal = appraisal;
    }


    public int allmoney() {
        int allstiponecurse = 30000;
        int totalmoney = (stip + allstiponecurse);
        System.out.println("Все деньги студента за первый и второй курс = " + totalmoney);
        return (totalmoney);
    }

    public void GiveMoney(int HowMuch) {
        String info = "Ха откуда у студента такие деньги ?!)";
        String info1 = "Я не знаком с дочкой миллонера";
        String info2 = "Конечно, вить ты мой самый лучший друг";
        String info4 = "Нетакая большая сумма для меня, OK";

        String info3 = "Я всего имею в наличии ";
        if (HowMuch > stip) {
            System.out.println(info + info3 + stip + ", и причем рублей" + ", а ты просишь " + HowMuch);
        } else if (HowMuch <= stip / 6) {
            System.out.println(info2);
        } else if (HowMuch <= (stip / 4)) {
            System.out.println(info4);
        } else if (HowMuch <= (stip / 2)) {
            System.out.println(info1);
        } else System.out.println("Хм давольно крупная сумма для меня");
        return;
    }

    public void CountNumber(int number, int stepen) {

        for (int i = 0; i < stepen; i++)
            super.result1 = result1 * number;      // this. позваляет методу видить Поля вне своей зоны
        System.out.println("Ваше число " + number + " в степени " + stepen + " = " + result1);
        //return result1;
    }

}