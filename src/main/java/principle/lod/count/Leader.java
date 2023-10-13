package principle.lod.count;

import java.util.List;

public class Leader implements ILeader {
    private List<IStudent> students;

    public Leader(List<IStudent> students) {
        this.students = students;
    }

    @Override
    public void count() {
        for (IStudent student : students) {
            System.out.println("点名");
            student.speak();
        }
    }
}
