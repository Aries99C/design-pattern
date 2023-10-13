package principle.lod.count;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ITeacher{
    @Override
    public void command(ILeader leader) {
        leader.count();
    }
}
