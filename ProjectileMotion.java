import java.util.Date;
import java.util.Scanner;

import Project.DrawingPanel;

public class ProjectileMotion {
    public static final int LENGTH = 1000;
    public static final int WIDTH = 1000;
    public static final int OVALWIDTH = 10;
    public static final int OVALLENGTH = 10;
    public static final int STARTINGPOSX = 500;
    public static final int STARTINGPOSY = 500;
    public static final Double GRABITY = -9.81;
    public static void main(String[] args){
        Double[] BeginningValues = GetInfo();
        Fire MyFire = new Fire();
        Double[] NewSet = MyFire.Calculate(BeginningValues);
        DrawingPanel Board = MyFire.PanelMaker(WIDTH, LENGTH);
        MyFire.Launch(NewSet, OVALWIDTH, OVALLENGTH, STARTINGPOSX, STARTINGPOSY, Board, BeginningValues);

        
    }
    public static Double[] GetInfo(){
        System.out.println("Welcome to Projectile Motion");
        System.out.println("You are accessing this method on " + new Date());
        for(int i = 1; i <= 10; i++){
            System.out.print("*-*");
        }
        System.out.println();
        Scanner GetAngle = new Scanner(System.in);
        System.out.println("Please input an angle: ");
        System.out.println(">");
        Double Angle = GetAngle.nextDouble();
        Scanner GetVelocity = new Scanner(System.in);
        System.out.println("Please input a velocity");
        System.out.println(">");
        Double Velocity = GetVelocity.nextDouble();
        Scanner GetSteps = new Scanner(System.in);
        System.out.println("How many many Steps should be completed?");
        System.out.println(">");
        Double Steps = GetSteps.nextDouble();
        Double[] valuables = {Angle, Velocity, Steps};
        return valuables;
    }
}
