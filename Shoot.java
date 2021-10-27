import Project.DrawingPanel;

public interface Shoot {

    public void Launch(Double[] z, int a, int b, int c, int d, DrawingPanel x, Double[] t);
    public DrawingPanel PanelMaker(int x, int y);
    public Double[] Calculate(Double[] a);
    public double Round(double N);
}