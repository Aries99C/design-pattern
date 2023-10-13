package principle.lod.count;

public class Student implements IStudent {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + "到");
    }
}
