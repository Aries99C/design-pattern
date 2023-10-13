package principle.lod.count;

import java.util.ArrayList;
import java.util.List;

public class EducationApp {
    public static void main(String[] args) {
        ITeacher teacher = new Teacher();

        List<IStudent> students = new ArrayList<>();
        students.add(new Student("A"));
        students.add(new Student("B"));
        students.add(new Student("C"));
        students.add(new Student("D"));
        students.add(new Student("E"));

        ILeader leader = new Leader(students);

        teacher.command(leader);
    }
}
