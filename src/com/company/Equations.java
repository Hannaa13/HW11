package com.company;

import java.util.Arrays;

public class Equations {


    private double a;
    private double b;
    private double c;

    public Equations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void solution() {

        if (getDiscriminant() > 0) {
            System.out.println(Arrays.toString(firstSolution()));

        } else if (getDiscriminant() == 0) {
            System.out.println(secondSolution());

        } else {
            System.out.println("Уравнение не имеет явного решения");
        }

    }


    private double[] firstSolution() {
        double x1, x2;
        x1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        x2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);

        return new double[] {x1, x2};
    }

    private double secondSolution() {
        double x;
        x = -b / (2 * a);

        return x;
    }

    private double getDiscriminant() {

        return    b * b - 4 * a * c;
    }

}
