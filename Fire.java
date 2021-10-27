import java.awt.*;
import Project.DrawingPanel;
public class Fire implements Shoot {
    public Double[] Calculate(Double[] a){
        Double Angle = a[0];
        Double Velocity = a[1];
        Double Steps = a[2];
        Double Vy = Velocity * Math.sin(Angle);
        Double Vx = Velocity * Math.cos(Angle);
        Double TotalTime = -2.0 * Vy/ -9.81;
        Double TimeIncrement = TotalTime/Steps;
        Double XIncrement = Vx * TimeIncrement;
        Double[] z = {XIncrement, Vy, TimeIncrement};
        return z;
    }
    public DrawingPanel PanelMaker(int x, int y){
        DrawingPanel panel = new DrawingPanel(x, y);
        return panel;
    }
    public void Launch(Double[] NewSet, int ProjectileWidth, int ProjectileHeight, int PosX, int PosY,  DrawingPanel x, Double[] OldSet){
       int times = OldSet[2].intValue();
        Graphics g =  x.getGraphics();
     double posx = 0.0;
     double posy = 0.0;
     double t = 0.0;
     for(int i = 1; i <= 10; i++){
        System.out.print("*-*");
    }
    System.out.println();
     System.out.println("step/tx/ty/ttime");
     System.out.println("0/t0.0/t0.0/t0.0/t");
       for(int i = 1; i <= times; i++){
        g.fillOval((int) posx, 500 - (int)posy, ProjectileWidth, ProjectileHeight);
        posx += 4 * NewSet[0];
        posy = NewSet[1] * t + 0.5 * -9.81 * t * t;
        t += NewSet[2];
        System.out.println(i + "/t" + Round(posx) + "/t" + Round(posy) + "/t" + Round(t));
       }
    }
    public double Round(double N){
        return Math.round((N * 100.0)/100.0);
    }
}
