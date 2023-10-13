package principle.ocp.draw;

public class AppWithInterface {
    public void drawChart(DrawChart drawChart, Chart chart) {
        drawChart.draw(chart);
    }
}

class Chart {
    String type;
}

interface DrawChart {
    public void draw(Chart chart);
}

class DrawLineChart implements DrawChart {
    @Override
    public void draw(Chart chart) {
        System.out.println("Draw Line Chart");
    }
}

class DrawBarChart implements DrawChart {
    @Override
    public void draw(Chart chart) {
        System.out.println("Draw Bar Chart");
    }
}