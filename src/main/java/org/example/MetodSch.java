package org.example;

import java.util.Random;

public class MetodSch {
    public <A> void sch(A search, A a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (search.equals(a[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    public <A> boolean sch2(A a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j]) && i != j) return true;
            }
        }
        return false;
    }
    public <A>  A[] Shafl(A a[]){

        for (int i = 0; i < a.length ; i++) {

            a[i] = a[(int) (Math.random()*a.length+0)];
        }
        return a;
    }
}
