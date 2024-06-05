package org.example;

public class Average<A extends Number> {
    private A mass[];

    public A[] getMass() {
        return mass;
    }

    public Average(A[] mass) {
        this.mass = mass;
    }

    public Double avg() {
        double a = 0;

        for (int i = 0; i < mass.length; i++) {
            a = a + mass[i].doubleValue();
        }
        a = (a / mass.length);


        return a;
    }



}
