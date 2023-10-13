package principle.ocp.draw;

public class App {
    public void drawChart(String chartType) throws Exception {
        switch (chartType) {
            case "line" -> new LineChart().draw();
            case "bar" -> new BarChart().draw();
            default -> throw new Exception("Such Chart Type is not supported.");
        }
    }
}

class LineChart {
    public void draw() {
        System.out.println("Draw Line Chart...");
    }
}

class BarChart {
    public void draw() {
        System.out.println("Draw Bar Chart...");
    }
}