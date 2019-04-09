package company;

public class Course2 extends Course {

    private String Predmets;
    private String status;

    public void tell() {                                                    // функция выводит на экран параметры объекта
        System.out.println("NameMen= " + getName());
        System.out.println("AgeMen= " + getAge());
        System.out.println("ColorEye= " + getColoreye());
        System.out.println("appraisal= " + getAppraisal());
        System.out.println("Course= " + getCourse());
        System.out.println("Стипендия= " + getStip());
        System.out.println("Предмет= " + getPredmets());
        System.out.println("Статус= " + getStatus());

    }

    public Course2() {

    }

    public Course2(String name, int age, String coloreye, int app, int cou, int stip, String Predmets, String status) {      // Добавляем кусочек к конструктору
        super(name, age, coloreye, app, cou, stip, status);
        this.Predmets = Predmets;
        this.status = status;
    }

    public String getPredmets() {
        return Predmets;
    }

    public void setPredmets(String predmets) {
        Predmets = predmets;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}

