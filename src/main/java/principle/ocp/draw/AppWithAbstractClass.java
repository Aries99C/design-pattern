package principle.ocp.draw;

public class AppWithAbstractClass {
    public void drawChart(AbstractChart chart) {
        chart.draw();
    }
}

abstract class AbstractChart {
    public abstract void draw();
}

class ALineChart extends AbstractChart {
    @Override
    public void draw() {
        System.out.println("Draw Line Chart");
    }
}

class ABarChart extends AbstractChart {
    @Override
    public void draw() {
        System.out.println("Draw Bar Chart");
    }
}